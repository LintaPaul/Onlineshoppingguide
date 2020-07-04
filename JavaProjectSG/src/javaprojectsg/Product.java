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
class Product {
    private String name,category,brand,avs;
    private double mrp,fp,amz;
    public Product(String Name,String Category,String Brand,double Mrp,String Avs){
        this.name=Name;
        this.category=Category;
        this.brand=Brand;
        this.mrp=Mrp;
        this.avs=Avs;
        
    }
     Product(String brand, double fp,double am) {
       this.brand=brand;
        this.fp=fp;
        this.amz=am;
        //To change body of generated methods, choose Tools | Templates.
    }
     Product(String b){
         this.brand=b;
     }
    

    
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public String getBrand(){
        return brand;
    }
    public Double getMrp(){
        return mrp;
    }
    public Double getFp(){
        return fp;
    }
    public Double getAm(){
        return amz;
    }
    public String getsite(){
        return avs;
       
    }

   
    
}
