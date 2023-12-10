/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva2q3;

/**
 *
 * @author Lo
 */
public class Viva2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String [] array ={"0","a",".","-5E7","2e+8","2e2e"};
       boolean[] validity = isValid(array);
        
       
       
       System.out.print("{");
       for(int i=0;i<validity.length;i++){
           System.out.print(validity[i]);
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
