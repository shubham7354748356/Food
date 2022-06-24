/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoPackage;

import PojoPackage.DishPojo;
import connectionPackage.ConnectionClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author india
 */
public class DishDao 
{
    public static boolean addDish(String username , String dish_name , int price  , String description , String image )
    {
        boolean result = false;
        try
        {
            System.out.println("Just Going To Add Dish: DishDao");
            PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("insert into dish values(?,?,?,?,?)");
            ps.setString(1 , username);
            ps.setString(2 , dish_name);
            ps.setInt(3 , price);
            ps.setString(4 , description);
            ps.setString(5 , image);
            int i = ps.executeUpdate();
            result = (i==1);
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println("Exception in the addDish function");
        }
        System.out.println("Going to return the result : "+result);
        return result;
    }
    public static ArrayList<DishPojo> getAllDishByUsername(String username)
    {
        ArrayList<DishPojo> al = new ArrayList<>();
        try
        {
        PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("select dish_name , price , description , image from dish where username=?");
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            String dish_name = rs.getString(1);
            int price = rs.getInt(2);
            String description = rs.getString(3);
            System.out.println("description: "+description);
            String image = rs.getString(4);
            DishPojo dp = new DishPojo(rs.getString(1) , rs.getInt(2) , rs.getString(3) , rs.getString(4));
            System.out.println(dp);
            al.add(dp);
            
        }
        
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println("Exception in DiahDao 's getAllDishByUsername Method");
        }
        return al;
    }
    public static boolean deleteDish(String username , String dish_name)
    {
        boolean result=false;
        try
        {
                PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("delete from dish where username=? and dish_name=?");
                ps.setString(1, username);
                ps.setString(2 , dish_name);
                int i = ps.executeUpdate();
                result = (i==1);
                        
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println("Exception in the DishDao's DeleteDish Method!!!");
        }    
        return result;
           
    }
    
    public static DishPojo getDishByName(String dish)
    {
        try
        {
            PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("select * from dish where dish_name=?");
            ps.setString(1, dish);
            ResultSet rs = ps.executeQuery();
           rs.next();
            DishPojo dp = new DishPojo(rs.getString(2) , rs.getInt(3) , rs.getString(4) , rs.getString(5));
            System.out.println(dp);
            return dp;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
    public static int getPriceByDishName(String s)
    {
        try
        {
            PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("select price from dish where dish_name=?");
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getInt(1);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return 0;
    }
    
    
    
    
}
