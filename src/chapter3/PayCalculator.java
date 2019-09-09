package chapter3;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

/*
If statement, all sales people receives $1000 if  */
public class PayCalculator {
    public static void main(String arg[]) {
        int salary = 1000;
        int bonus =250;
        int quota = 10;
        System.out.println("How many sales have employee this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        if(sales > quota){
            salary += bonus;
        }
        System.out.println("employee salary is $"+salary);
    }
}
