package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAfeccted = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database. Rows affected '{}'", producer.getName(), rowsAfeccted);
        } catch (SQLException e) {
            log.info("Error while trying to inserte producer '{}'", producer.getName(), e);
        }

    }
    // Podemos passar o sql sem o uso de aspas
//    public static void save(Producer producer) {
//        String sql = "INSERT INTO anime_store.producer (name) VALUES ('%s');".formatted(producer.getName());
//        try (Connection conn = ConnectionFactory.getConnection();
//             Statement stmt = conn.createStatement()) {
//            int rowsAfeccted = stmt.executeUpdate(sql);
//            log.info("Inserted producer '{}' in the database. Rows affected '{}'", producer.getName(), rowsAfeccted);
//        } catch (SQLException e) {
//            log.info("Error while trying to inserte producer '{}'", producer.getName(), e);
//        }
//
//    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAfeccted = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' in the database. Rows affected '{}'", id, rowsAfeccted);
        } catch (SQLException e) {
            log.info("Error while trying to delete producer '{}'", id, e);
        }

    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');".formatted(producer.getName(), producer.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAfeccted = stmt.executeUpdate(sql);
            log.info("Updated producer '{}' in the database. Rows affected '{}'", producer.getId(), rowsAfeccted);
        } catch (SQLException e) {
            log.info("Error while trying to update producer '{}'", producer.getId(), e);
        }

    }

    public static List<Producer> findAll() {
        log.info("Finding all Producers in the database.");
        String sql = "SELECT * FROM `anime_store`.`producer`";
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet resultSet = stmt.executeQuery(sql)) {

            while (resultSet.next()) {
                Producer produce = Producer.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .build();
                producers.add(produce);
            }
        } catch (SQLException e) {
            log.info("Error while trying to findAll producers", e);
        }
        return producers;
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding producers by name...");
        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE '%%%s%%'".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet resultSet = stmt.executeQuery(sql)) {
            while (resultSet.next()) {
                Producer producerFound = Producer.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .build();
                producers.add(producerFound);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producers;
    }

    public static List<Producer> findAll2() {
        log.info("Finding all Producers in the database...");
        return findByName("");
    }

    public static void showProducerMetadata() { // Obter informações dos dados da tabela e suas colunas
        log.info("Showing producer Metadata...");
        String sql = "SELECT * FROM anime_store.producer";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet resultSet = stmt.executeQuery(sql)) {

            ResultSetMetaData rsMetaData = resultSet.getMetaData(); // Através do result set, criamos um ResultSetMetaData
            int columnCount = rsMetaData.getColumnCount(); // Retorna a quantidade de colunas da tabela
            resultSet.next(); // Faz referencia pra primeira linha apenas (Se quisermos todas, usamos um while)

            for (int i = 1; i <= columnCount; i++) { // a cada interação de i, ele parte pra próxima coluna
                log.info("Table name: '{}'", rsMetaData.getTableName(i));
                log.info("Column name: '{}'", rsMetaData.getColumnName(i));
                log.info("Column type: '{}'", rsMetaData.getColumnTypeName(i));
                log.info("Column size: '{}'", rsMetaData.getColumnDisplaySize(i));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showDriverMetadata() { // Obter informações sobre o driver do jdbc
        log.info("Showing driver metadata...");
        try (Connection conn = ConnectionFactory.getConnection()) {

            DatabaseMetaData dbDetaData = conn.getMetaData();

            if (dbDetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) { // Se o db permite consultar de cima pra baixo
                log.info("Supports TYPE_FORWARD_ONLY");
                if (dbDetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }

            if (dbDetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) { // Se permite consultar de cima pra baixo, baixo pra cima, mas não altera os dados em tempo real
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (dbDetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }

            if (dbDetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) { // altera os dados em tempo real
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if (dbDetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM anime_store.producer;";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = stmt.executeQuery(sql)) {

            log.info("Last row? '{}'", resultSet.last()); // Pula pra ultima linha
            log.info("Row number '{}'", resultSet.getRow());
            log.info(Producer.builder().id(resultSet.getInt("id")).name(resultSet.getString("name")).build());
            log.info("---------");

            log.info("First row? '{}'", resultSet.first()); //Pula pra primeira linha
            log.info("Row number '{}'", resultSet.getRow());
            log.info(Producer.builder().id(resultSet.getInt("id")).name(resultSet.getString("name")).build());
            log.info("---------");

            log.info("Row absolute? '{}'", resultSet.absolute(2)); //Pula pra linha que definirmos
            log.info("Row number '{}'", resultSet.getRow());
            log.info(Producer.builder().id(resultSet.getInt("id")).name(resultSet.getString("name")).build());
            log.info("---------");

            log.info("Row relative? '{}'", resultSet.relative(-1)); //Volta a quantidade de linhas que quisermos
            log.info("Row number '{}'", resultSet.getRow());
            log.info(Producer.builder().id(resultSet.getInt("id")).name(resultSet.getString("name")).build());
            log.info("---------");

            log.info("Is last? '{}'", resultSet.isLast()); // Só retorna se está na ultima linha (Não modifica o cursor)
            log.info("Row number '{}'", resultSet.getRow());
            log.info(Producer.builder().id(resultSet.getInt("id")).name(resultSet.getString("name")).build());
            log.info("---------");

            log.info("Is first? '{}'", resultSet.isFirst()); // Só retorna se está na primeira linha (Não modifica o cursor)
            log.info("Row number '{}'", resultSet.getRow());
            log.info(Producer.builder().id(resultSet.getInt("id")).name(resultSet.getString("name")).build());
            log.info("---------");

            log.info("Last row? '{}'", resultSet.last());
            resultSet.next(); // Como fomos pra ultima linha, movemos o cursor mais uma vez para ir pra depois da ultima linha. (Poderíamos usar o afterLast())
            log.info("Is after last? '{}'", resultSet.isAfterLast());
            while (resultSet.previous()) {
                log.info(Producer.builder().id(resultSet.getInt("id")).name(resultSet.getString("name")).build());
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Producer> findByNameAndUpdateToUpper(String name) {
        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE '%%%s%%'".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = stmt.executeQuery(sql)) {
            while (resultSet.next()) {
                resultSet.updateString("name", resultSet.getString("name").toUpperCase());
                resultSet.updateRow(); // Só vai atualizar de fato o banco de dados se adicionarmos esse metodo
                Producer producerFound = Producer.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .build();
                producers.add(producerFound);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producers;
    }

    public static List<Producer> findByNameAndInserteWhenNotFound(String name) {
        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE '%%%s%%'".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = stmt.executeQuery(sql)) {
            if (resultSet.next()) return producers;

            insertNewProducer(name, resultSet);

            producers.add(getProducer(resultSet));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producers;
    }

    public static void findByNameAndDelete(String name) {
        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE '%%%s%%'".formatted(name);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = stmt.executeQuery(sql)) {

            while (resultSet.next()) {
                log.info("Deleting '{}'", resultSet.getString("name"));
                resultSet.deleteRow();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void insertNewProducer(String name, ResultSet resultSet) throws SQLException {
        resultSet.moveToInsertRow(); // Move para a linha vazia da tabela
        resultSet.updateString("name", name); // "Modifica" esta linha que está vazia
        resultSet.insertRow(); // Confirma a inserção dessa nova linha
    }

    private static Producer getProducer(ResultSet resultSet) throws SQLException {
        resultSet.beforeFirst();
        resultSet.next();
        return Producer.builder().id(resultSet.getInt("id")).name(resultSet.getString("name")).build();
    }

    public static List<Producer> findByNamePreparedStatement(String name) {
        log.info("Finding producers by name...");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindByName(conn, name);
             ResultSet resultSet = ps.executeQuery()) {

            while (resultSet.next()) {
                Producer producerFound = Producer.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .build();
                producers.add(producerFound);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producers;
    }

    private static PreparedStatement preparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static void updatePreparedStatement(Producer producer) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementUpdate(conn, producer)) {
            int rowsAfeccted = ps.executeUpdate();
            log.info("Updated producer '{}' in the database. Rows affected '{}'", producer.getId(), rowsAfeccted);
        } catch (SQLException e) {
            log.info("Error while trying to update producer '{}'", producer.getId(), e);
        }

    }

    private static PreparedStatement preparedStatementUpdate (Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);".formatted(producer.getName(), producer.getId());
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }

}


