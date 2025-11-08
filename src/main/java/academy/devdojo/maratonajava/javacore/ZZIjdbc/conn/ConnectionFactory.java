package academy.devdojo.maratonajava.javacore.ZZIjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    // O java criou essa biblioteca para tentar padronizar a conexão com diferentes tipos de banco de dados
    // java.sql = Connection, Statement, ResultSet, DriveManager
    // A criação dos conectores ficam responsáveis pelas empresas que criam os bancos de dados

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "root";
        return DriverManager.getConnection(url, username, password);
    }
}
