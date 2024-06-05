/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Lenovo
 */
import Model.DBSearch;
import Model.DBDelete;

import javax.swing.JOptionPane;
import Model.DBConnection;
import java.sql.SQLException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class DeleteController {
    
  public static void deleteIndex(String index){
     
      try {
          
    String indexNum = null;
 
              ResultSet rs = new DBSearch().searchStudent(index);
              
           while(rs.next()){
           indexNum = rs.getString("std_id");
           
           if(indexNum != null){
           
                new DBDelete().deleteIndex(index);
           JOptionPane.showMessageDialog(null, "Record Deleted","Successfull",JOptionPane.INFORMATION_MESSAGE);
           }
           else{
           
            JOptionPane.showMessageDialog(null, "Invalid Index Number ", "Error", JOptionPane.ERROR_MESSAGE);
           }

          }
        
            DBConnection.closeCon();
          
      } catch (SQLException ex) {
          Logger.getLogger(DeleteController.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      
   
    
  }  
  
  public static void lecDelete(String lecID){
  
      try {
          
          String lec_id = null;
          
          ResultSet rs = new DBSearch().searchlecture(lecID);
          
          while(rs.next()){
          
          lec_id = rs.getString("lecturer_id");
          
          if(lec_id != null){
          
          new DBDelete().deleteLec(lecID);
          JOptionPane.showMessageDialog(null, "Record Deleted","Successfull",JOptionPane.INFORMATION_MESSAGE);
          
          }
          else{
              JOptionPane.showMessageDialog(null, "Invalid Index Number ", "Error", JOptionPane.ERROR_MESSAGE);
          }
          
          }
           DBConnection.closeCon();
          
      } 
         
     catch (SQLException ex) {
          Logger.getLogger(DeleteController.class.getName()).log(Level.SEVERE, null, ex);
      }
  
  }
  
    
    
}
