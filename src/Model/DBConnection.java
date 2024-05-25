/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */


import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    
    static Connection conn;
    static Statement stat = null;
    
   public static Statement getStatementConnection(){
       // public static void main(String[] args) {
        
    
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/studentlms","root","");
           // System.out.println(conn);
            
            stat = conn.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return stat;
    }
    

   
    public static void closeCon() throws SQLException{
        conn.close();
    }
    
    
}
