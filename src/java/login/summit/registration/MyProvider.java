/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.summit.registration;

/**
 *
 * @author arc68
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class MyProvider {
        static Connection con = null;
          
        public static Connection getCon(){
            try{
                Class.forName("com.mysql.jdbc.Driver"); 
            }catch(ClassNotFoundException e ){
                System.out.println(e);
            }
            
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdb_demo", "root", "alekos2457");
            } catch(Exception e){
                System.out.println(e);
            }
            
            return(con);
        }
}
