/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * @Author : Rumesh Eranga
 * 
 */
package DB;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rumesh
 */
public class DBConnector {

    public static Connection createMYSQLCon(String db,String username, String password) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(db, username, password);
        
        return con;

    }

    public static void createSQLSERVERCon(){
    
    }
    
    public static void createORACLECon(){
    
    }
    
    public static void main(String[] args) {
        String db = "jdbc:mysql://Localhost:3306/";
        String user = "root";
        String pwd = "123";
        try {
            Connection c = DBConnector.createMYSQLCon(db, user, pwd);
            c.createStatement().executeQuery("use tst");
            ResultSet r= c.createStatement().executeQuery("show databases");
            while(r.next()){
            System.out.println(r.getString("database"));
            
            }
            
            
            System.out.println("Connection made...");
        } catch (Exception ex) {
            System.out.println(ex.toString().split(":")[1].trim());
        }
        
    }

}
