
package Model;

//import com.mysql.jdbc.ResultSet;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.DBConnection;
import java.sql.SQLException;




public class DBCount {
    
        Statement stmt;
   ResultSet rs;
    
    public ResultSet stCount(){
        
   
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                stmt = DBConnection.getStatementConnection();
                
                rs = stmt.executeQuery("SELECT faculty, COUNT(*) AS count FROM st_detail GROUP BY faculty");
                
                //rs = stmt.executeQuery("SELECT COUNT(*) FROM st_detail WHERE faculty= IT" ");
                
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBCount.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DBCount.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return rs;
        
        
    }
    
 
}
