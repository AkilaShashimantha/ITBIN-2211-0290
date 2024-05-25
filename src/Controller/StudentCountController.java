/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Home;

import Model.DBCount;

//import com.mysql.jdbc.ResultSet;

import java.sql.ResultSet;



/**
 *
 * @author Lenovo
 */



public class StudentCountController {
    
   
    public static void stCount(){
        
     
        try {
            
            ResultSet rs = new DBCount().stCount();
            
    
             while (rs.next()) {
                 String  faculty = rs.getString("faculty");
                int count = rs.getInt("count");
    
    
                System.out.println("Faculty: " + faculty + ", Count: " + count);
                
             
            }
             
        
            
        } catch (Exception e) {
            
        }
        
    }

 /*
 
    public void showLineChart(){
        
          
        //create dataset for the graph
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Amount", "january");
        dataset.setValue(150, "Amount", "february");
        dataset.setValue(18, "Amount", "march");
        dataset.setValue(100, "Amount", "april");
        dataset.setValue(80, "Amount", "may");
        dataset.setValue(250, "Amount", "june");
        
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("contribution","monthly","amount", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        //create plot object
         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
       panelLineChart.removeAll();
        panelLineChart.add(lineChartPanel, BorderLayout.CENTER);
        panelLineChart.validate();
    }
    
    
  
    */
  
    public static void main(String[] args) {
        
        stCount();
        
    }
    
  
    }
    

/*

   int itCount = 0;
        int managementCount = 0;
        int lawCount = 0;
        int scienceCount = 0 ;
        int educationCount = 0;
        
    
                if(faculty.equals("IT")){
                    itCount = count;
                
                     // System.out.println("Faculty: " + faculty + ", Count: " + count);
                }
                if(faculty.equals("Management")){
                    managementCount = count;
                }
                if(faculty.equals("Law")){
                    lawCount = count;
                     // System.out.println("Faculty: " + faculty + ", Count: " + count);
                }
                if(faculty.equals("Education")){
                    educationCount = count;
                }
                if(faculty.equals("Science")){
                    scienceCount = count;
                }

*/