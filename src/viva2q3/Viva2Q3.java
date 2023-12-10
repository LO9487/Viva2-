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
        
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a set of 6 numerical value:");
      String string = scanner.nextLine();      
      String str = string.replaceAll("[\"\"]", "");
      String s1 = str.substring(1, str.length()-1);
        
     String [] array = s1.split(",");
     String [] array = str.split(",");
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

