/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Lenovo
 */

import Model.UpdateForm;
import javax.swing.JOptionPane;

public class UpdateController {
    
  
    public static void UpdateForm(String indexNum,String name,String email,String password,String gender,String faculty,String intake){
        
        new UpdateForm().updateForm(indexNum,name,email, password, gender, faculty, intake);
        
        
        if(indexNum.equals("")){
        
       
        }
        else{
              JOptionPane.showMessageDialog(null, "Record has Updated successfully", "Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
       
        
    }
    
    
    public static void updateCourse(String subID,String subName,String faculty,String lecId){
    
    new UpdateForm().updateCorse(subID, subName, faculty, lecId);
     
        if(subID.equals("")){
        
       
        }
        else{
              JOptionPane.showMessageDialog(null, "Record has Updated successfully", "Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
    
    }
    
    
    
    public static void updateLec(String lecID, String lecname, String nic,String gender,String pW){
    
    new UpdateForm().updateLec(lecID, lecname, nic, gender, pW);
        
        if(lecID.equals("")){
        
        
        }
        else{
            
            JOptionPane.showMessageDialog(null, "Record has Updated successfully", "Successfull",JOptionPane.INFORMATION_MESSAGE);
            
        }
    
    }
    
    
    
}
