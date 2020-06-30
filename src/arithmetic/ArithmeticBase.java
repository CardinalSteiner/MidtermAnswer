/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * date 30/20
 */
public class ArithmeticBase 
{
    public enum operationType{PLUS, MINUS, TIMES, DIVIDE, ASHUTOSH_TYPE}
 public double x,y;
    double calculate(double x, double y)
            
        {
        Scanner sc =new Scanner(System.in);
        System.out.println("Choose arithmetic operation to Perform: ");
        operationType s;
        s = sc.next();
        switch (operationType.values()) 
        {
            case "PLUS":
                return x + y;
            case "MINUS":
                return x - y;
            case "TIMES":
                return x * y;
            case "DIVIDE":
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
