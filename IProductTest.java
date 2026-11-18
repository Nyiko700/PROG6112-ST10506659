/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.productsalesreport;

import org.junit.jupiter.api.Test; 

import static org.junit.jupiter.api.Assertions.*; 

 

public class IProductTest { 

 

    // Test whether total sales are calculated correctly 
    @Test 
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() { 
       String[] names = { 
            "Cozy Nights Monarch mattress", 
            "Restonic Barbados mattress", 
            "Sealy Phuket mattress" 
        }; 

        // Sample sales data for three months 
        int[][] sales = { 
            {25, 18, 20}, 
            {15, 10, 12}, 
            {18, 15, 20} 
        }; 

        // Create Product object 
        Product product = new Product(names, sales); 

        // Check if total sales equal 153 
        assertEquals(153, product.GetTotalProductsSold()); 

    } 

 

    // Test whether average sales are calculated correctly 
    @Test 
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() { 
        String[] names = { 
            "Cozy Nights Monarch mattress", 
            "Restonic Barbados mattress", 
            "Sealy Phuket mattress" 
        }; 

 

        int[][] sales = { 
            {25, 18, 20}, 
            {15, 10, 12}, 
            {18, 15, 20} 
        }; 

        // Create Product object 
        Product product = new Product(names, sales); 
        
        // Check if average sales equal 17 
        assertEquals( 
                17.0, 
                product.GetAverageProductsSold(), 
                0.01 
        ); 

    } 

} 

 