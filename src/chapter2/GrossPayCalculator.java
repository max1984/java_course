package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]) {
        System.out.println("Enter number of hours that employee worked");
        Scanner scanner = new Scanner(System.in);
        int hourse = scanner.nextInt();
        System.out.println("Enter the employee pay rate");
        double rate = scanner.nextDouble();
        scanner.close();
        double grossPay = hourse * rate;
        System.out.println("Employee gross incom is " + grossPay);
    }
}
