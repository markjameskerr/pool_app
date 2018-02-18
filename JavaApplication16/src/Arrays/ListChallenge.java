/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author markk
 */
public class ListChallenge {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        int num = 0;
        
        while (num != -1){
            System.out.println("Please enter a value to add to the list");
            num = s.nextInt();
            numbers.add(num);
        }
        
        for(int i = 0; i < numbers.size(); i++ )
        {
            System.out.println(numbers.get(i));
        }
        
    }
    
    
}
