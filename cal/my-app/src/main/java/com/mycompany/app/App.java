package com.mycompany.app;

import java.util.Scanner;
public class App extends Function
{
    public static void main( String[] args )
    {
    	Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");
        // nextDouble() reads the next double from the keyboard
        double first = reader.nextDouble();
        System.out.print("Enter number: ");
        double second = reader.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);
        App a=new App();
        switch(operator)
        {
            case '+':
            	System.out.printf("%.1f %c %.1f = ", first, operator, second);
            	System.out.println(+a.add(first,second));
                break;
            case '-':
            	System.out.printf("%.1f %c %.1f = ", first, operator, second);
            	System.out.println(+a.sub(first,second));
                break;
            case '*':
            	System.out.printf("%.1f %c %.1f = ", first, operator, second);
            	System.out.println(+a.mul(first,second));
                break;
            case '/':
            	System.out.printf("%.1f %c %.1f = ", first, operator, second);
            	System.out.println(+a.div(first,second));
                break;
            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }
    }
}
