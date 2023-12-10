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

public class Viva2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Register your password: ");
        String password = scanner.nextLine();
        isValid(password);
    }
    
    public static void isValid(String password){
        boolean valid = false;
        boolean length = false;
        boolean capital = false;
        boolean smallLetter = false;
        int digit =0;
        boolean special = false;
        
    if(password.length()>=8)
    {length = true;} 
    for (int i =0; i<password.length()-1;i++){
        char c = password.charAt(i);
    if (Character.isUpperCase(c)){
    capital =true;
    }
    if(Character.isLowerCase(c)){
    smallLetter =true;
    }
    if(Character.isDigit(c))
    {digit++;}
    if(!Character.isLetterOrDigit(c))
    special = true;
    }
    
    if(length&&capital&&smallLetter&&digit>2&&special){
    valid = true;
    }
    if(valid){System.out.println("true");}
    if(!valid) System.out.println("false");
}
    
    
    
    
}