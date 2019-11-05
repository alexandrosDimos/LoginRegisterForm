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
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDAOImpl implements CustomerDAO{
    
    static Connection con;
    static PreparedStatement ps;
    /**
     *
     * @param c
     * @return
     */
    @Override
    public int insertCustomer(Customer c){
        int status = 0;
        try{
            con = MyProvider.getCon();
            ps = con.prepareStatement("insert into new_table values(?,?,?)");
            ps.setString(1, c.getUsername());
            ps.setString(2, c.getEmail());
            ps.setString(3, c.getPassword());
            status = ps.executeUpdate();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return status;
    }
    
    /**
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public Customer getCustomer(String username, String password){
        Customer c = new Customer();
        
        try{
            con=MyProvider.getCon();
           
            ps=con.prepareStatement("select * from new_table where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                c.setUsername(rs.getString(1));
                //c.setEmail(rs.getString(2));
                c.setPassword(rs.getString(2));
                
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return c;
    }
}
