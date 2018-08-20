/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3and5multiples;

/**
 *
 * @author chris
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int keepGoing = 1000;
        int sum = 0;
        boolean add = false; //This is a test
        while(keepGoing != 0){
            System.out.print(keepGoing);
            if(keepGoing % 3 == 0){
                add = true;
                System.out.print(" is a multiple of 3");
            }
            if(keepGoing % 5 == 0){
                if(add == true){
                    System.out.print(" and");
                }
                add = true;
                System.out.print(" is a multiple of 5");
            }
            
            if(add){
                sum += keepGoing;
                System.out.print(", for a total of " + sum);
            }
            System.out.println();
            add = false;
            keepGoing--;
        }
        
        System.out.println("The total is " + sum);
        
    }
    
}
