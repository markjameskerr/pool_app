/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author markk
 */
public class ArraysChallenge {


    public static void main(String[] args) {
        
        int numbers [] = new int [10];
        int num;
        
        System.out.println("you will be asked to enter 10 numbers in total");
        
        for (int i = 0; i < numbers.length; i++){
            Scanner s = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            num = s.nextInt();
            numbers[i] = num;
        }
        
        System.out.println("\n");
        
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Original Order " + numbers[i]);
        }
        
        Arrays.sort(numbers);
        System.out.println("\n");
        
        for(int i = 0; i < numbers.length; i++){
            System.out.println("In order " + numbers[i]);
        }
        
        
    }
    
}
