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
public class LoginPojo 
{

    @Override
    public String toString() {
        return "LoginPojo{" + "username=" + username + ", state=" + state + ", city=" + city + ", type=" + type + '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public LoginPojo(String username , String state , String city , String type)
    {
        this.username =username;
        this.state = state;
        this.city = city;
        this.type = type;
        
    }
   private String username;
   private String state;
   private String city;
   private String type;
    
}
