/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.*;


/**
 *
 * @author damacena
 */
public class ModuloConexao {
    public static Connection conector ()  {
        java.sql.Connection conexao = null;
        String  driver = "com.mysql.cj.jdbc.Driver";
        String  url    = "jdbc:mysql://localhost:3306/Bancodedados";
        String  user   = "root";
        String password= "rootroot";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
            
        } catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    
}
