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
class Compareproduct{
    

    private Double fprice,aprice;
    public Compareproduct(Double APrice,Double FPrice){
        this.aprice=APrice;
        this.fprice=FPrice;
        
        
    }

    
    
    public int getRes(){
        if(aprice<fprice)
            return 1;
        else
            return 0;
    }
    public double getAp(){
     return aprice;
    }
    public double getFp(){
        return fprice;
    }

}
