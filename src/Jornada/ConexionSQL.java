/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jornada;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Miguel
 */
public class ConexionSQL {
    
        
    
  Connection conn = null;
        public  Connection getConexion(){
            
            
            
        
        
       // String url = "jdbc:sqlserver://LUISMI:1433;databaseName=JornadaDeportiva;user=Miguel;password=2001;";
        
         String url =
                "jdbc:sqlserver://LUISMI:1433;" + "database=JornadaDeportiva;" + "user=Miguel;" + "password=2001;";
        
        try{
               conn = DriverManager.getConnection(url, "Miguel", "2001");
               System.out.println("Conecion establecida");
          //  Connection con = DriverManager.getConnection( url);
        } catch(SQLException e){
            System.out.println("Error"+e.toString());

      //      return null;
        }
            return conn;
        
      
        
     
    }
}
    

