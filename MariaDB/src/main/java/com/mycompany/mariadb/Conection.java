/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mariadb;

/**
 *
 * @author lestu
 */
    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conection {
    


    public  Connection conectionn (){
     String URL = "jdbc:mariadb://localhost:3306/proyecto1";
      String USER = "root";
      String PASSWORD = "admin";
        Connection connection = null;
        try{  
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
//             Statement statement = connection.createStatement())            
        } catch (SQLException e) {
            System.out.println("fallo conexion"+ e); 
        }
        return connection;
    }
    
    public void findfactura (int param){
        Conection conect = new Conection();
     Connection con;
      PreparedStatement ps;
       ResultSet rs;
        try {
            con = conect.conectionn();
            ps = con.prepareStatement("SELECT * FROM proyecto1.factura where id_producto = ?" );
            ps.setInt(1, param);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " - " + rs.getString(2)+ " - " + rs.getString(3));
            }
        } catch (SQLException e) {
        }
    }

    
}



