/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoPackage;

import PojoPackage.LoginPojo;
import connectionPackage.ConnectionClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author india
 */
public class LoginDao 
{
    public static ArrayList<String> validateLogin(String username , String password)
    {
         ArrayList<String>  al = new ArrayList<>();
        try{
        PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("select * from login where username=? and password=?");
           ps.setString(1 , username);
           ps.setString(2 , password);
           ResultSet rs = ps.executeQuery();
          
           if(rs.next())
           {
               al.add(rs.getString(3));
               al.add(rs.getString(4));
               al.add(rs.getString(5));
           }
           
        }
        catch(SQLException sq)
        {
            sq.printStackTrace();
        }
        
        return al;
    }
    
    public static boolean signup(String username , String password , String state , String city ,String usertype)
    {
        int result=0;
        try{
            PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("insert into login(username , password , state , city , type) values(?,?,?,?,?)");
            ps.setString(1, username);
            ps.setString(2 , password);
            ps.setString(3, state);
            ps.setString(4, city);
            ps.setString(5 , usertype);
            result = ps.executeUpdate();
        }
        catch(SQLException sq)
        {
            sq.printStackTrace();
        }
        return result==1;
    }
    public static ArrayList<LoginPojo> getAllByType(String type)
    {
        System.out.println("getAllByType Method: "+type);
        ArrayList<LoginPojo> al = new ArrayList<>();
        try
        {
            if(type.equals("customer"))
            {
                System.out.println("In The GetAllByType's customer");
                PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("select username , state , city , type from login where type=?");
                ps.setString(1, type);
                ResultSet rs = ps.executeQuery();
                while(rs.next())
                {
                    LoginPojo lp = new LoginPojo(rs.getString(1) , rs.getString(2) , rs.getString(3) , rs.getString(4));
                    System.out.println("Login Pojo : "+lp);
                    al.add(lp);
                    
                }
            }
            else
            {
                System.out.println("In The GetAllByType's supplier");
                PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("select username , state , city , type from login where type=?");
                ps.setString(1, type);
                ResultSet rs = ps.executeQuery();
                while(rs.next())
                {
                    LoginPojo lp = new LoginPojo(rs.getString(1) , rs.getString(2) , rs.getString(3) , rs.getString(4));
                    System.out.println("Login Pojo: "+lp);
                    al.add(lp);
                }
                
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println("Exception In The LoginDao's getAllByType Method");
        }
        return al;
    }
    public static boolean deleteUser(String username)
    {
        boolean result = false;
        try
        {
            PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("delete from login where username=?");
            ps.setString(1, username);
            int i = ps.executeUpdate();
            result = i==1;
            
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println("Delete User Method");
        }
        
        System.out.println("Got The Result: "+result);
        return result;
    }
    
    
    
    
    
    
}
