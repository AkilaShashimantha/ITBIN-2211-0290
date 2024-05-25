/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class DBCourseInsert {
    
    
     Statement stmt;
 
   
   public  void insertForm(String subID,String subName,String degree,String lecID){
        
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           stmt = DBConnection.getStatementConnection();

          
          stmt.executeUpdate("INSERT INTO course(sub_id, sub_name, degree, lecturer_id) VALUES('"+subID+"','"+subName+"','"+degree+"','"+lecID+"') ");
           
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(DBFormInsert.class.getName()).log(Level.SEVERE, null, ex);
       }
        catch (SQLException ex) {
            Logger.getLogger(DBFormInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
       
     
   }
   
    
    
}
