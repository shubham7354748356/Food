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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author india
 */
public class OrdersDao 
{
    public static boolean placeOrder( String supplier , String customer , String date , HashMap<String , Integer> hm)
    {
        System.out.println("Place Order Method");
        System.out.println("Supplier name: "+supplier);
        System.out.println("Customer name: "+customer);
        System.out.println("Date: "+date);
        System.out.println(hm);
        try
        {
            Statement st = ConnectionClass.getConnection().createStatement();
                ResultSet rs = st.executeQuery("select count(distinct order_id) from orders");
                String id=null;
                rs.next();
                id = rs.getString(1);
                System.out.println("We Got In the result Set value: "+id);
                if(id.equals("0"))
                {
                    id = "o-1";
                }
                else
                {
                    int c = Integer.parseInt(id.substring(id.indexOf("-")+1));
                    id = "o-"+(c+1);
                }
            for(Map.Entry<String , Integer> set : hm.entrySet())
            {
                
                
                PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("insert into orders values(?,?,?,?,?,?,?)");
                    ps.setString(1 , customer);
                    ps.setString(2, supplier);
                    ps.setString(3, set.getKey() );
                    ps.setInt(4, set.getValue());
                    ps.setString(5, date);
                    ps.setInt(6 , 0);
                    ps.setString(7, id);
                    ps.executeUpdate();
            }
                    
        }
        catch(Exception ex)
        {
            System.out.println("Exception While Inserting Values:");
            ex.printStackTrace();
        }
     
        return true;
    }
    
    public static ArrayList<String> getAllOrdersIdByUsername(String username)
    {
        try
        {
            PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("select distinct order_id from orders where Customer=? order by order_id desc");
            ps.setString(1, username);
            ArrayList<String> al = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                al.add(rs.getString(1));
            }
            System.out.println("The ArrayList formed: "+al);
            return al;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static String getSupplierNameByOrder_Id(String supplier)
    {
        try
        {
                PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("select supplier from orders where order_id=?");
                ps.setString(1, supplier);
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
    
    public static int getStatusOfOrder(String order_id)
    {
        try
        {
            PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("select order_status from orders where order_id=?");
            ps.setString(1, order_id);
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
    public static ArrayList<HashMap<String , Integer>> getAllDishByOrderId(String order_id)
    {
       ArrayList<HashMap<String , Integer>> al = new ArrayList<>();
       try
       {
           PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("select dish_name , quantity from orders where order_id=?");
           ps.setString(1, order_id);
           ResultSet rs = ps.executeQuery();
           while(rs.next())
           {
               HashMap<String , Integer> hm = new HashMap<>();
               hm.put(rs.getString(1), rs.getInt(2));
               al.add(hm);
               
           }
          
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
       return al;
        
    }
    
    public static ArrayList<String> getAllOrderIdBySupplierName(String supplier)
    {
        ArrayList<String> al = new ArrayList<>();
        try
        {
            PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("select distinct order_id from orders where supplier=? order by order_id desc");
            ps.setString(1, supplier);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                al.add(rs.getString(1));
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        System.out.println("Going to Return Order_is As: "+al);
        return al;
    }
    public static boolean shipOrder(String order_id)
    {
        boolean b = false;
        try
        {
            PreparedStatement ps = ConnectionClass.getConnection().prepareStatement("update orders set order_status=1 where order_id=?");
            ps.setString(1, order_id);
            int i = ps.executeUpdate();
            b = i!=0;
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return b;
    }
    
    
    
}
