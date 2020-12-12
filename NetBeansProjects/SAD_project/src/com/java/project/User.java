/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.project;

/**
 *
 * @author ASUS
 */
public class User {
    private String fullName;
    private String email;
        private String username;//="admin";
    private String password;//=//"123";

    public User(String fullName, String email, String username, String password) {
        this.fullName = fullName;
        this.email = email;
        this.username = username;
        this.password = password;
       
    }
    
      public User(){
          throw new UnsupportedOperationException("Not suported yet,");
      }      

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
            
           
    public boolean checkUser(String user,String pass){
        if(username.equals(user)&& password.equals(pass))
            return true;
      else
            return false;
    }
    
}
