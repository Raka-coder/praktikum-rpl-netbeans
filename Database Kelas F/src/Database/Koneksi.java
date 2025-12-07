package Database;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 import java.sql.*;
 import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class Koneksi {
     public static Connection getConnection() {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/universitas_kelas_F";
        try {
            Connection cn = DriverManager.getConnection(url, username, password);
            JOptionPane.showMessageDialog(null, "Berhasil Koneksi", "Berhasil", JOptionPane.DEFAULT_OPTION);
            return cn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Koneksi", "Gagal", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
