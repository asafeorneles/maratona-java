package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAfeccted = stmt.executeUpdate(sql);
            log.info("Darabase rows affected  {}", rowsAfeccted);
            System.out.println(rowsAfeccted);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void delete(Producer producer) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (name = 'MadHouse');";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAfeccted = stmt.executeUpdate(sql);
            System.out.println(rowsAfeccted);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
