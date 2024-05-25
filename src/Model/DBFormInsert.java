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

public class DBFormInsert {
    
  Statement stmt;
 
   
   public  void insertForm(String indexNum,String stName,String email,String password,String gender,String faculty, String intake){
        
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           stmt = DBConnection.getStatementConnection();
           
           String indexNumber = indexNum;
           String stuName = stName;
           String emailaddress = email;
           String pW = password;
           String gd = gender;
           String fac = faculty;
           String intk = intake;
        
           
         // stmt.executeQuery("INSERT * INTO `st_detail` VALUES('"+indexNumber+"','"+emailaddress+"','"+pW+"','"+gd+"','"+fac+"','"+intk+"') ");
          
          stmt.executeUpdate("INSERT INTO st_detail VALUES('"+indexNumber+"','"+stuName+"','"+emailaddress+"','"+pW+"','"+gd+"','"+fac+"','"+intk+"') ");
           
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(DBFormInsert.class.getName()).log(Level.SEVERE, null, ex);
       }
        catch (SQLException ex) {
            Logger.getLogger(DBFormInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     
   }
   
  
    
}
