/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.tds.relatorios.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Giuvane
 */
public class ConnectionFactory {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public static Connection getConnection(String url, String usuario, String senha) throws SQLException{
        return DriverManager.getConnection(url, usuario, senha);
    }
    
    public static Connection getLocadoraFilmes() throws SQLException {
        return getConnection("jdbc:mysql://localhost/locadora_filmes", "root", "12345");
    }
}
