/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DBLecInsert;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class LectDetailInsertController {
    
    
    
    public static void insertForm(String lecID,String lecName,String nic,String gender,String pW ){
        
        
        if(lecID != null){
        
            new DBLecInsert().insertForm(lecID, lecName, nic, gender, pW);

        JOptionPane.showMessageDialog(null, "Record has added successfully", "Successfull",JOptionPane.INFORMATION_MESSAGE);
      
        }
        
    
    }
}
