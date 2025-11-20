package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.listener.CustomRowListener;
import lombok.extern.log4j.Log4j2;

import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepositoryRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name){
        log.info("Finding producers by name...");
        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE ?;";
        List<Producer> producers = new ArrayList<>();
        try (JdbcRowSet jrs = ConnectionFactory.getjdbcRowSet()){
            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%", name));
            jrs.execute(); // Executa a setagem do name
            while (jrs.next()){
                Producer producer = Producer.builder()
                        .id(jrs.getInt("id"))
                        .name(jrs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producers;
    }

    public static void updateJdbcRowSet(Producer producer){
        String sql = "SELECT * FROM anime_store.producer WHERE (id = ?);";
        try (JdbcRowSet jrs = ConnectionFactory.getjdbcRowSet()){
            jrs.addRowSetListener(new CustomRowListener());
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getId());
            jrs.execute(); // Executa a setagem do id
            if (!jrs.next()) return; // Se nao encontrou ngm com o id, retorna vazio
            jrs.updateString("name", producer.getName()); // Se tiver encontrado, avança pra cá e executa a atualização do Producer
            jrs.updateRow(); // Executa a atualização da linha

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
