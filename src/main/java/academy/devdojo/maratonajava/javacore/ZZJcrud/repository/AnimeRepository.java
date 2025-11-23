package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;

import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class AnimeRepository {
    public static List<Anime> findByName(String name) {
        log.info("Finding animes by name '{}'", name);
        List<Anime> animes = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.builder().name(rs.getString("producer_name")).id(rs.getInt("producer_id")).build();
                Anime anime = Anime.builder().id(rs.getInt("id")).name(rs.getString("name")).episodes(rs.getInt("episodes")).producer(producer).build();
                animes.add(anime);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return animes;
    }

    private static PreparedStatement createPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = """ 
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name AS 'producer_name'
                FROM anime_store.anime a
                INNER JOIN anime_store.producer p on a.producer_id = p.id
                WHERE a.name like ?; 
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static Optional<Anime> findById(int id) {
        log.info("Finding animes by id '{}'", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {

            if (!rs.next()) return Optional.empty();
            Producer producer = Producer.builder().name(rs.getString("producer_name")).id(rs.getInt("producer_id")).build();
            return Optional.of(Anime.builder().id(rs.getInt("id")).name(rs.getString("name")).episodes(rs.getInt("episodes")).producer(producer).build());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createPreparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = """ 
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name AS 'producer_name'
                FROM anime_store.anime a
                INNER JOIN anime_store.producer p on a.producer_id = p.id
                WHERE a.id = ?; 
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static List<Anime> findAll() {
        List<Anime> animes = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementfindAll(conn);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.builder().name(rs.getString("producer_name")).id(rs.getInt("producer_id")).build();
                Anime anime = Anime.builder().id(rs.getInt("id")).name(rs.getString("name")).episodes(rs.getInt("episodes")).producer(producer).build();
                animes.add(anime);
            }

        } catch (SQLException e) {
            log.info("Error while trying to findAll animes", e);
        }
        return animes;
    }

    private static PreparedStatement createPreparedStatementfindAll(Connection conn) throws SQLException {
        String sql = """ 
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name AS 'producer_name'
                FROM anime_store.anime a
                INNER JOIN anime_store.producer p on a.producer_id = p.id
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementDelete(conn, id)) {
            ps.execute(); // Dentro do bloco try
            log.info("Deleted Anime '{}' from database", id);
        } catch (SQLException e) {
            log.info("Error while trying to delete Anime '{}'", id, e);
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`anime` WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Anime anime) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementSave(conn, anime)) {
            ps.execute();
            log.info("Inserted anime '{}' in the database", anime.getName());

        } catch (SQLException e) {
            log.info("Error while trying to inserte anime '{}'", anime.getName(), e);
        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection conn, Anime anime) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`anime` (`name`, `episodes`, `producer_id`) VALUES (?, ?, ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getProducer().getId());
        return ps;
    }

    public static void update(Anime anime) {
        log.info("Updating the anime '{}' in the database.", anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementUpdate(conn, anime)) {
            ps.execute();

        } catch (SQLException e) {
            log.info("Error while trying update anime '{}'", anime.getName());
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, Anime anime) throws SQLException {
        String sql = "UPDATE `anime_store`.`anime` SET `name` = ?, `episodes` = ? WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getId());
        return ps;
    }
}
