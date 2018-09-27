/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttemp;
import java.util.Scanner;
/**
 *
 * @author theag
 */
public class ConvertTemp {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print(" Enter the temperature : ");
        Scanner keyboard = new Scanner(System.in);
        int num = Integer.parseInt(keyboard.next()) ;
        
            //Calc Fahrenheit
            double degreeF = (9.0 / 5.0 ) * num + 32;
            //Output the result
        System.out.print( " The temperature is :  " +degreeF + " F");
        }
    }
    
