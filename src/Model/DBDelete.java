/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBDelete {
    
    Statement stmt;
    
    
    public void deleteIndex(String indexName){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            
            String stId = indexName;
            
          stmt.executeUpdate("DELETE FROM st_detail where std_id='"+stId+"'");
            
            
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBDelete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
        
    }
    
    
    public void deleteLec(String lecID){
    
        try {
  
       
            stmt = DBConnection.getStatementConnection();
           
            
          stmt.executeUpdate("DELETE FROM `lecturer` WHERE `lecturer_id`='"+lecID+"'");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
    
}
