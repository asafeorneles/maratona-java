package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            while (resultSet.next()){
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
}
