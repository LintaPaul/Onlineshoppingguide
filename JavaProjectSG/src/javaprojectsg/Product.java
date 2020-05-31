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
    private String name,category,brand;
    private Double mrp,fp,amz;
    public Product(String Name,String Category,String Brand,Double Mrp,Double Fp,Double Am){
        this.name=Name;
        this.category=Category;
        this.brand=Brand;
        this.mrp=Mrp;
        this.fp=Fp;
        this.amz=Am;
        
    }

    Product(String brand) {
        this.brand = brand; //To change body of generated methods, choose Tools | Templates.
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
    
}
