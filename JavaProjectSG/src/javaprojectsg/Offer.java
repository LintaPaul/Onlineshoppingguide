/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectsg;



/**
 *
 * @author Asus
 */
class Offer {
    private String cgryname,site;
    private int discountpct;
    public Offer(String cgryname, Integer discountpct,String site)
    {
        this.cgryname=cgryname;
        this.discountpct=discountpct;
        this.site=site;
    }
    public int getdiscountpct(){
        return discountpct;
    }
    public String getcgryname(){
        return cgryname;
    }
    public String getsite(){
        return site;
    }
    
}

