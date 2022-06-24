/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoPackage;

import PojoPackage.RestuarantPojo;
import connectionPackage.ConnectionClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author india
 */
public class RestuarantDao
{
    public static int isRestuarantPresent(String username)
    {
        int  result = -1;
        try{
       PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("select status from restuarant where username=?");
       ps.setString(1, username);
       ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            System.out.println("In The If Of The ResultSet");
            result = rs.getInt(1);
            System.out.println("Result: "+result);
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Going To Return The Value: "+result);
         return result;
    }
    public  static boolean addRestuarant(String username , String restuarant_name , String description , String image)
    {
        try{
            Statement st = ConnectionClass.getConnection().createStatement();
            ResultSet rs = st.executeQuery("select max(restuarant_id) from restuarant");
            System.out.println("Got The Restuarant REesultSet for Ids");
            String id="";
            if(rs.next())
            {
                String g = rs.getString(1);
                System.out.println("We Got The G as "+g);
                if(g==null)
                {
                    id="R-101";
                }
                else
                {
                    int i = Integer.parseInt(g.substring(g.indexOf("-")+1));
                    i = i+1;
                    id = "R-"+i;
                }
               
            }
           System.out.println("Generated id:"+id);
            System.out.println("Got The Id:"+id);
            PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("insert into restuarant values(?,?,?,?,?,?)");
            ps.setString(1, username);
            ps.setString(2 , id);
            ps.setString(3, restuarant_name);
            ps.setString(4 , description);
            ps.setInt(5, 0);
            ps.setString(6, image);
            System.out.println("All The PlaceHolders Are Setted Successfully");
            return ps.executeUpdate()==1;
            
                    
            
        }
        catch(Exception ex)
        {
            System.out.println("Exception IN The Restuarant Dao");
            ex.printStackTrace();
        }
      return false;
        
    }
    
    public static RestuarantPojo getRestuarantByUsername(String username)
    {
        try
        {
        PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("select restuarant_name , description , image from restuarant where username=?");
        ps.setString(1 ,  username);
        ResultSet rs = ps.executeQuery();
        rs.next();
        RestuarantPojo rp = new RestuarantPojo(rs.getString(1) , rs.getString(2) , rs.getString(3));
        System.out.println(rp);
        return rp;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println("exception in the RestuarantDao's getRestuarantByUsername Method");
        }
        return null;
    }
    
    public static ArrayList<RestuarantPojo> getAllRestuarant()
    {
        ArrayList<RestuarantPojo> al=new ArrayList<>();
         try{
        PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("select restuarant_name , description , image , username from restuarant where status=0");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                RestuarantPojo rp = new RestuarantPojo();
                String restuarant_name = rs.getString(1);
                String description = rs.getString(2);
                String image = rs.getString(3);
                String username = rs.getString(4);
                rp.setImage(image);
                rp.setDescription(description);
                rp.setRestuarant_name(restuarant_name);
                rp.setUsername(username);
                
                System.out.println(rs.getString(2)+"Got The Rp as: "+rp);
                al.add(rp);
            }
        
         }
         catch(Exception ex)
         {
             System.out.println("Exception in RestuarantDao,s getAllRestuarant");
             ex.printStackTrace();
         }
         return al;
    }
    public static boolean verifyRestuarant(String username)
    {
        try
        {
            PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("update restuarant set status=1 where username=?");
            ps.setString(1, username);
            int i = ps.executeUpdate();
            System.out.println("the value of i=> "+i);
            return i==1;
        }
        catch(Exception ex)
        {
            System.out.println("Exception in the verify method");
            ex.printStackTrace();
        }
        return false;
    }
    public static ArrayList<RestuarantPojo> getAllRestuarantByStateAndCity(String state , String city)
    {
        ArrayList<RestuarantPojo> al = new ArrayList<>();
        try
        {
            PreparedStatement ps=  ConnectionClass.getConnection().prepareStatement("select username , restuarant_name , description , image from restuarant where restuarant.username in (select username from login where state=? and city=? and type='Supplier')");
            ps.setString(1, state);
             ps.setString(2, city);
             ResultSet rs = ps.executeQuery();
             while(rs.next())
             {
                 RestuarantPojo rp = new RestuarantPojo();
                 rp.setUsername(rs.getString(1));
                 rp.setDescription(rs.getString(3));
                 rp.setImage(rs.getString(4));
                 rp.setRestuarant_name(rs.getString(2));
                 System.out.println(rp);
                 al.add(rp);
             }
            
        }
        catch(Exception ex)
        {
            System.out.println("Exception In the getAll by state and city");
            ex.printStackTrace();
            
        }
        return al;
    }
    public static String getRestuarantNameByUsername(String username)
    {
        try
        {
            PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("select restuarant_name from restuarant where username=?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getString(1);
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
    
    
    
    
}
