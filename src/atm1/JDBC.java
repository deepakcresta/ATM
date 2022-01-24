/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Deepak
 */
public class JDBC {
    
    Connection con;
    Statement stm;
    ResultSet rs; 
    
    public JDBC()
     {
     try
      {
      Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bank","root","");
    stm=con.createStatement();
      }
    catch(Exception ex)
      {
       System.out.println(ex);
    
      }    
     }
 private static class statement {

        public statement() {
        }
    }
    
}
