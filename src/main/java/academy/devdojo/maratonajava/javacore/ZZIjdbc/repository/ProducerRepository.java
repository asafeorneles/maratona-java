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
             Statement stmt = conn.createStatement()) {
            ResultSet resultSet = stmt.executeQuery(sql);
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
             Statement stmt = conn.createStatement()) {
            ResultSet resultSet = stmt.executeQuery(sql);
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

    public static void showProducerMetadata() {
        log.info("Showing producer Metadata...");
        String sql = "SELECT * FROM anime_store.producer";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {

            ResultSet resultSet = stmt.executeQuery(sql);
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
}
