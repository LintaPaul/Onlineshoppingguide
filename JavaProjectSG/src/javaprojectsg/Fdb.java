/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectsg;

/**
 *
 * @author LINTA
 */
public class Fdb {
    private String name,brand,fd;
    private Double rtng;
    public Fdb(String Name,String Brand,String Fd,Double Pr){
        this.name=Name;
        
        this.brand=Brand;
        this.fd=Fd;
        this.rtng=Pr;
        
        
    }

    
    
    public String getName(){
        return name;
    }
    public String getBrand(){
        return brand;
    }
    public String getFeed(){
        return fd;
    }
    public Double getrtng(){
        return rtng;
    }
    
    
    
}

