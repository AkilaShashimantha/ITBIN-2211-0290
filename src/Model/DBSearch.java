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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBSearch {
    
    Statement stmt;
    ResultSet rs;
		 
	public ResultSet searchLogin(String usName) {
		
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            
            String name = usName;
                    
            rs = stmt.executeQuery("SELECT * FROM login Where std_id = '"+name+"'");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBSearch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
	
        
        return rs;
	}
        
        
        public ResultSet searchAll(){
            
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM st_detail");
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBSearch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
            return rs;
        }
       
        
        public ResultSet searchStudent(String usName){
        
        
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM st_detail WHERE std_id = '"+usName+"' ");
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBSearch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        return rs;
        }
        
    
}
