import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        char op;
        double result;


        while (true) {
            System.out.println("Velkommen til regnemaskinen");
            System.out.println(" + for addition ");
            System.out.println(" - for substraktion");
            System.out.println(" * for multiplikation");
            System.out.println(" / for division");
            System.out.println(" q for quit");
            op = input.next().charAt(0);

            if (op == 'q') break;
            num1 = inputDouble("write first number : ");
            num2 = inputDouble2("write first number : ");

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    result = num1 / num2;
                    break;

                default:
                    System.out.print("ugyldig oprator (regne tegn)");
                    input.nextLine();
                    continue;
            } //switch end
            System.out.print("RESULT = " + result);
            System.out.println();

        }// while løkke slut
    }//main

    static double inputDouble(String promt) {
        Scanner input = new Scanner(System.in);
        boolean ok;
        double num = 0;

        do {
            try {
                System.out.print(promt);
                num = input.nextDouble();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("wrong input, try again");
                ok = true;
            }
        } while (!ok);
        return num;
    }
    static double inputDouble2(String promt) {
        Scanner input = new Scanner(System.in);
        boolean ok;
        double num2 = 0;

        do {
            try {
                System.out.print(promt);
                num2 = input.nextDouble();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("wrong input, try again");
                ok = true;
            }
        } while (!ok);
        return num2;
    }
}
