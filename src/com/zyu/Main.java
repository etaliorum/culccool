package com.zyu;

import java.util.Scanner;

public class Main {

    public void initialization(){

    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator("Culc run!");

        while (true) {

            System.out.print("Operand a: ");
            calc.operand1 = scanner.nextFloat();

            System.out.print("Operation: ");
            calc.operation = scanner.next();

            System.out.print("Operand b: ");
            calc.operand2 = scanner.nextFloat();

            if(calc.operation.equals("+")) {
                System.out.println(calc.plus(calc.operand1, calc.operand2));
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.initialization();

        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String s = scanner.nextLine();*/

        main.run();
    }
}
