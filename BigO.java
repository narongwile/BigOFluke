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
public class BigO {
private static int N=100_000;
private static Random r = new Random();


    public static void main(String[] args) {
        Integer[]a1 = new Integer[N];
        Integer[]a2 = new Integer[N];
        Integer[]a3 = new Integer[N];
        intial(a1);
       
        
        System.arraycopy(a1,0,a2,0,a1.length);
        System.arraycopy(a1,0,a3,0,a1.length);
        
        long begin = System.currentTimeMillis();
        //InsertionSort.sort(a1);
        Arrays.sort(a1);
        System.out.println("Duration:" +(System.currentTimeMillis()-begin)+"millseconds");
        
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i]);
            
        }
    }
    private static void intial(Integer[] a1){
        for (int i = 0; i < a1.length; i++) {
            a1[i] = r.nextInt(N);
        }
    }

   
    
}
