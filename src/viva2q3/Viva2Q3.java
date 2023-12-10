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
public class Viva2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] array = new String[6];
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a set of 6 numerical value:");
       for(int i=0;i<6;i++){
        array[i]= scanner.next();}
    
       boolean[] validity = isValid(array);
        
       
       
       System.out.print("{");
       for(int i=0;i<validity.length;i++){
           if (validity[i]==true){System.out.print("True");}
           else System.out.print("False");;
           if(i==validity.length-1){break;}
           System.out.print(", ");
           }
        System.out.println("}");
    }
    
    public static boolean[] isValid(String array[]){
    boolean[] validity = new boolean[array.length];
    for(int i=0; i<array.length;i++){
    try{ double a = Double.parseDouble(array[i]);
         validity[i]= true;
            }
    catch(Exception e){validity[i]=false;}
    }    
        return validity;
    }
    
}
