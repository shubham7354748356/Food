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
public class RestuarantPojo 
{

    @Override
    public String toString() {
        return "RestuarantPojo "+this.restuarant_name+" "+this.description+" "+this.image;
    }

    public String getRestuarant_name() {
        return restuarant_name;
    }

    public void setRestuarant_name(String restuarant_name) {
        this.restuarant_name = restuarant_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setImage(String image)
    {
        this.image = image;
    }
    public String getImage()
    {
        return this.image;
    }
    private String restuarant_name;
    private String description;
    private String image;
    private String username;
    public RestuarantPojo(String restuarant_name , String description , String image)
    {
        this.restuarant_name = restuarant_name;
        this.description = description;
        this.image = image;
    }
    public RestuarantPojo(String restuarant_name , String decsription , String image , String username)
    {
        this.restuarant_name = restuarant_name;
        this.image = image;
        this.username = username;
        this.description= description;
        System.out.println("In the constructor : "+this.description);
        
    }
    public RestuarantPojo()
    {
        
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getUsername()
    {
        return this.username;
    }
    
}
