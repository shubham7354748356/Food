/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PojoPackage;

/**
 *
 * @author india
 */
public class DishPojo 
{

    public String getDish_name() {
        return dish_name;
    }

   
    public String getDescription() {
        return description;
    }

  

    public String getImage() {
        return image;
    }

    
    public int getPrice() {
        return price;
    }
    private String dish_name;
    private String description;
    private String image;
    private int price;
    public DishPojo(String dish_name , int price , String description , String image)
    {
        this.dish_name = dish_name;
        this.price = price;
        this.description = description;
        System.out.println("In the constructor we are setting"+description+" "+this.description);
        this.image = image;
    }
    public String toString()
    {
        return "DishPojo: "+this.dish_name+" "+this.price+" "+this.description+" "+this.image;
    }
    
    
    
}
