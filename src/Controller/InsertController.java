/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Lenovo
 */


import Model.DBFormInsert;



import javax.swing.JOptionPane;

public class InsertController {
    
    
    public static void insertForm(String indexNum,String stName,String email,String password,String gender,String faculty,String intake){
        
        
        if(indexNum != null){
        
            new DBFormInsert().insertForm(indexNum,stName,email,password,gender,faculty,intake);

        JOptionPane.showMessageDialog(null, "Record has added successfully", "Successfull",JOptionPane.INFORMATION_MESSAGE);
        

        
        }
        
        
    
        
    }
    
    
}
