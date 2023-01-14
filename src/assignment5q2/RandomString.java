/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5q2;
/*
Arvind Dhaliwal, February 13,2022, Assignment 5 Q2
This code creates a random string
 */

public class RandomString {

     static String nextString(int n) {
        String patt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; //contains all entire alphabet and number form 0-9
        String fDigit = "BCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder string = new StringBuilder(); //setup for later
        for (int k = 0; k < n; k++) { //for loop
            if (k == 0) { //must be character of alphabet
                int index = (int) (fDigit.length() * Math.random()); //takes random letter
                string.append(fDigit.charAt(index));
                string.lastIndexOf(".");
            }
            int index = (int) (patt.length() * Math.random()); //takes random chracter including numbers
            
            
            string.append(patt.charAt(index));
        }
        return string.toString();

    }
public static void main(String[] args){ //main method
  String test = nextString(15);
  System.out.println(test);
}
}
