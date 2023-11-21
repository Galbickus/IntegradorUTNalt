/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "utnAlt";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection con;

    private Conexion() {
    }

    public static Connection getConexion() {

        if (con == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                con = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión");
            }

        }
        return con;
    }

    
}
