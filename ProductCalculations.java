/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productcalculations;

/**
 *
 * @author Student
 */
// Interface for product calculations 
interface IProductCalculations {
    
    double SetVat();
    double GetCommission();
    double GetTotal();
    
}
public class ProductCalculations{ 

    private double price; 
    public ProductCalculations(double price) { 
        this.price = price; 
    } 

    public double GetVat() { 
        return price * 0.15; 
    } 

    public double GetCommission() { 
        return price * 0.05; 
    } 

    public double GetTotal() { 
        return price + GetVat() + GetCommission(); 
    } 
    
}
  