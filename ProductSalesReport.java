/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */
import java.util.Scanner; 

// Interface containing methods for product sales 
interface IProduct { 
    
    int GetTotalProductsSold(); 
    double GetAverageProductsSold(); 
    String GetMostPopularProduct(); 

} 

// Product class implements the IProduct interface 
class Product implements IProduct { 

    // One-dimensional array for product names 
    private String[] productNames; 

    // Two-dimensional array for monthly sales 
    private int[][] sales; 

    // Constructor to receive product names and sales 
    public Product(String[] productNames, int[][] sales) { 
        this.productNames = productNames; 
        this.sales = sales; 

    } 

    // Method to calculate total products sold 
    public int GetTotalProductsSold() { 
        int total = 0; 

        // Loop through all products 
        for (int i = 0; i < sales.length; i++) { 

            // Loop through the three months 
            for (int j = 0; j < sales[i].length; j++) { 
                total += sales[i][j]; 

            } 

        } 

        return total; 

    } 

    // Method to calculate average products sold 
    public double GetAverageProductsSold() { 

        // Divide total sales by number of sales entries 
        return (double) GetTotalProductsSold() 
                / (sales.length * sales[0].length); 

    } 

    // Method to find the most popular product 
    public String GetMostPopularProduct() { 
        int highest = 0; 
        int index = 0; 

        // Calculate total sales for each product 
        for (int i = 0; i < sales.length; i++) { 
            int total = 0; 
            for (int j = 0; j < sales[i].length; j++) { 
                total += sales[i][j]; 

            } 

            // Check which product has the highest sales 
            if (total > highest) { 
                highest = total; 
                index = i; 

            } 

        } 

        // Return product name and total sales 
        return productNames[index] + " (" + highest + ")"; 
    } 

} 

// Main class of the application 
public class ProductSalesReport { 
    public static void main(String[] args) { 

        // Scanner to receive user input 
        Scanner input = new Scanner(System.in); 

        // Store the three product names 
        String[] products = { 
            "Cozy Nights Monarch mattress", 
            "Restonic Barbados mattress", 
            "Sealy Phuket mattress" 
        }; 

 

        // Two-dimensional array for three months 
        int[][] sales = new int[3][3]; 

        // Ask the user to enter monthly sales 
        for (int i = 0; i < products.length; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print("Enter number of sales for month " 
                    + (j + 1) + " for " 
                    + products[i] + ": " 
                ); 
                
                // Store the entered sales 
                sales[i][j] = input.nextInt(); 

            } 
            
        } 

        // Create Product object 
        Product product = new Product(products, sales); 

        // Display the sales report 
        System.out.println("\nPRODUCT SALES REPORT - 2026"); 
        System.out.println("********************************"); 

        // Display total products sold 
        System.out.println("TOTAL PRODUCT SALES: " 
            + product.GetTotalProductsSold() 
        ); 

        // Display average products sold 
        System.out.println("AVERAGE PRODUCT SALES: " 
            + product.GetAverageProductsSold() 
        ); 
        
        // Display the most popular product 
        System.out.println("MOST POPULAR PRODUCT: " 
            + product.GetMostPopularProduct() 
        ); 

        // Close Scanner 
        input.close(); 

    } 

}