package main.java;

import java.util.Scanner;

public class Calculator {
    private static float[] readInformation(){

        // Initializing variables
        Scanner scanner = new Scanner(System.in);
        String operat;
        float firstOperand, secondOperand,res = 0;
        int op = 0;


        System.out.println("Enter arithmetic operator (+,-,/,*):");


        // Defining operation
        while(true){
            operat = scanner.next();
            if(operat.equals("+") || operat.equals("-") || operat.equals("/") || operat.equals("*")){
                if (operat.equals("-"))
                    op = 1;
                if (operat.equals("/"))
                    op = 2;
                if (operat.equals("*"))
                    op = 3;
                break;
            }
            System.out.println("The answer was wrong. Please Try again.");
        }

        // Getting operands
        System.out.println("Enter first number:");
        firstOperand = scanner.nextFloat();
        System.out.println("Enter second number:");
        secondOperand = scanner.nextFloat();

        return new float[] {(float) op, firstOperand, secondOperand};
    }

    /**
     *
     * @param op is used for defining operation.
     * @param firstOperand is first operand, which will be used in evaluating.
     * @param secondOperand is second operand, which will be used in evaluating.
     */
    private static void outputResult( int op, float firstOperand, float secondOperand){
        float res = 0;
        // Evaluation of the expression
        if(op == 0)
            res = firstOperand + secondOperand;
        if(op == 1)
            res = firstOperand - secondOperand;
        if(op == 2)
            res = firstOperand * secondOperand;
        if(op == 3)
            res = firstOperand / secondOperand;

        // Output of result
        System.out.printf("Res: %20.4f",res);
    }

    public static void main(String args[]) {

        // Evulationg operator and operands
        float[] mass = readInformation();
        outputResult( (int) mass[0],mass[1],mass[2]);


    }
}
