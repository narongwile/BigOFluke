/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author int320
 */
class InsertionSort { 
    /*Function to sort array using insertion sort*/
    private static Integer N=100000;
    private static Random r = new Random();
    
    static void sort(Integer arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
  
    /* A utility function to print array of size n*/
    static void printArray(Integer arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
    private static void intial(Integer[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(N);
        }
    }
  
    // Driver method 
    public static void main(String args[]) { 
        Integer []arr = new Integer[N];
        intial(arr);
       // int arr[] = { 12, 11, 13, 5, 6 }; 
  
        InsertionSort ob = new InsertionSort(); 
        long begin = System.currentTimeMillis();
        ob.sort(arr); 
        System.out.println("Duration:" +(System.currentTimeMillis()-begin)+"millseconds");
        
  
        printArray(arr); 
    } 

    
} /* This code is contributed by Rajat Mishra. */
