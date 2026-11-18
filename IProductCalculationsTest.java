/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.productcalculations;

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*; 

public class IProductCalculationsTest { 

    // Test whether VAT is calculated correctly 

    @Test 
    public void GetVat_WithValidData_ReturnsCorrectValue() { 

        // Create calculation object with price of R3500 
        ProductCalculations product = 
                new ProductCalculations(3500); 

        // Check if VAT equals R525 
        assertEquals(525.0, product.GetVat(), 0.01); 
    } 

    // Test whether total sale amount is calculated correctly 
    @Test 
    public void GetTotal_WithValidData_ReturnsCorrectValue() { 

        // Create calculation object with price of R3500 
        ProductCalculations product = 
                new ProductCalculations(3500); 

        // Check if total equals R4200 
        assertEquals(4200.0, product.GetTotal(), 0.01); 

    } 

} 