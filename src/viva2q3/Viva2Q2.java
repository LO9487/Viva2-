/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva2q3;

/**
 *
 * @author Lo
 */
import java.util.*;
public class Viva2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] array1 = {5.2,2.1,17.2};
        double[] array2 = {1.3,2.4,2.1,11.1};
        
      
//    double median = getMedian(array1,array2);        
//        System.out.printf("%.3f",median);
     
    }
    
    public static double getMedian(double[]array1, double[]array2){
        double median =0;
    int a1= array1.length;
    int a2= array2.length;
    int a3 = a1+a2;
    
    double[] array3 = new double[a3];
    for(int i =0 ; i<a1; i++  ){
    array3[i]= array1[i];
    }
    for(int i =0 ; i<a1; i++  ){
    array3[a1+i]= array2[i];
    }
    Arrays.sort(array3);
   
    if(a3%2==0){
    median = (array3[a3/2]+array3[a3/2+1]);
    }
    else
        
    {median= array3[a3/2+1];}
    
    
    return median;
    }
}
