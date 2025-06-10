/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ricar
 */
public class Conexion {
    
    private static final String URL =
      "jdbc:mysql://localhost:3306/eurekabank"
      + "?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=America/Lima";
    private static final String USUARIO = "interculturalidad";
    private static final String CLAVE   = "admin";

    public static Connection getConnection() throws SQLException {
        try { Class.forName("com.mysql.cj.jdbc.Driver"); }
        catch (ClassNotFoundException e) {
            throw new SQLException("Driver no encontrado", e);
        }
        return DriverManager.getConnection(URL, USUARIO, CLAVE);
    }
}
