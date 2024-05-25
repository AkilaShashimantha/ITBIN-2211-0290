/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DBCourseInsert;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class CourseInsertController {
    
    
     public static void insertForm(String subID,String subName,String degree,String lecID){
        
        
        if(subID != null){
        
            new DBCourseInsert().insertForm(subID, subName, degree, lecID);

        JOptionPane.showMessageDialog(null, "Record has added successfully", "Successfull",JOptionPane.INFORMATION_MESSAGE);
        

        
        }
        
    
    }
    
    
}
