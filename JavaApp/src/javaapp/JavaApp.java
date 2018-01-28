/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;
import java.util.Scanner;
/**
 *
 * @author markk
 */
public class JavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int gamemode;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter which game mode you want to play? ");
        
        gamemode = s.nextInt();
        
        System.out.println("Thank you for selecting game mode " + gamemode);
       
        
    }
    
}
