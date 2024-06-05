/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UpdateForm {
    
    Statement stmt1;
     
    
    
    public void updateForm(String indexNum,String name,String email,String password,String gender,String faculty, String intake){
        
          try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           stmt1 = DBConnection.getStatementConnection();
          
           
           String indexNumber = indexNum;
           String emailaddress = email;
           String pW = password;
           String gd = gender;
           String fac = faculty;
           String intk = intake;
       
          
          stmt1.executeUpdate("UPDATE `st_detail` SET `st_name`='"+name+"',`email`='"+emailaddress+"', `password`='"+pW+"', `gender`='"+gd+"', `faculty`='"+fac+"', `intake`='"+intk+"' WHERE std_id='"+indexNumber+"' ");
          
          //stmt1.executeUpdate("UPDATE image i JOIN st_deatil s ON(i.std_id = s.std_id) SET ");
         
          
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(DBFormInsert.class.getName()).log(Level.SEVERE, null, ex);
       }
        catch (SQLException ex) {
            Logger.getLogger(DBFormInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    
    
    public void updateCorse(String subId,String subName,String faculty, String lecId){
    
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           stmt1 = DBConnection.getStatementConnection();
   
          
          stmt1.executeUpdate("UPDATE `course` SET `sub_name`='"+subName+"', `degree`='"+faculty+"', `lecturer_id`='"+lecId+"' WHERE sub_id='"+subId+"' ");
          
          //stmt1.executeUpdate("UPDATE image i JOIN st_deatil s ON(i.std_id = s.std_id) SET ");
         
          
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(DBFormInsert.class.getName()).log(Level.SEVERE, null, ex);
       }
        catch (SQLException ex) {
            Logger.getLogger(DBFormInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    
    
    }
    
    
    
    public void updateLec(String lecID,String lecName,String lecNIC,String gender,String pW){
    
     try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           stmt1 = DBConnection.getStatementConnection();
   
          
          stmt1.executeUpdate("UPDATE `lecturer` SET `lec_name`='"+lecName+"', `nic`='"+lecNIC+"', `gender`='"+gender+"', `password`='"+pW+"' WHERE lecturer_id='"+lecID+"' ");
          
   
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(DBFormInsert.class.getName()).log(Level.SEVERE, null, ex);
       }
        catch (SQLException ex) {
            Logger.getLogger(DBFormInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    
    }
    
    
}
