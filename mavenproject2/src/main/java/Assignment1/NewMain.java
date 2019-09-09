/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.io.IOException;
import static java.lang.Math.floor;
import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sheeplove
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 9;
        
        int[] intarr = {-4, 2, 15, 24, 3};
        
        printer(a, b, c);
        betterPrinter(intarr);
    }
    
    // Basic printer method, takes three ints and prints min, max and average
    public static void printer(int a, int b, int c){
        // Finds the minimum int
        int minimum = min(a, min(b, c));
        // Finds the maximum int
        int maximum = max(a, max(b, c));
        // Computes the average
        int avg = (a + b + c)/3;
        // This is integer division so the result is floored
        
        // Prints the results
        System.out.println("Minimum is: " + minimum);
        System.out.println("Maximum is: " + maximum);
        System.out.println("Average is: " + avg);
    }
    
    // More advanced printer method, takes an array of ints and prints the smallest
    // element, the largest element and the average of all the elements
    public static void betterPrinter(int[] arr){
        // Sort the array for easier computation
        Arrays.sort(arr);
        // Saves the smallest element, since the array was sorted
        int minimum = arr[0];
        // Saves the largest element, since the array was sorted
        int maximum = arr[arr.length-1];
        // Initialize the average
        int avg = 0;
        
        // Adds all the elements in the array together
        for(int i = 0; i<arr.length; i++){
            avg += arr[i];
        }
        
        // Computes the average by dividing the summed elements with the number of
        // elements
        avg /= arr.length;
        // This is integer division, so the result is floored
        
        // Prints the results
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
        System.out.println("Average: " + avg);
    }
}
