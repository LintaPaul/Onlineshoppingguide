/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectsg;

/**
 *
 * @author sarath
 */
public class rating {
    public String brand;
    public double rtng;
    public rating(String brand,double rtng) {
        this.brand = brand; 
this.rtng= rtng;//To change body of generated methods, choose Tools | Templates.
    }
    public Double getrtng(){
        return rtng;
    }
    public String getBrand(){
        return brand;
    
}
}
