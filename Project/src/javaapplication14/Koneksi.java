package javaapplication14;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;

public class Koneksi {
    public static Connection hubungkan() {
        try {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setDatabaseName("db_project");
            dataSource.setUser("root");
            dataSource.setPassword("");
            dataSource.setPortNumber(3306);
            dataSource.setServerName("localhost");
            dataSource.setServerTimezone("Asia/Jakarta");

            Connection connection = dataSource.getConnection();
            System.out.println("Sukses terhubung!");
            return connection;
        } catch (SQLException e) {
            System.err.println("Gagal terhubung!");
            System.err.println("Error: " + e.getMessage());
            throw new RuntimeException("Gagal terhubung ke database", e);
        }
    }

    public static Connection koneksiDB() {
         return hubungkan();
    }
}
