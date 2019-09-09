package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String args[]){
        boolean again;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter the first number");
            double number1 = scanner.nextDouble();
            System.out.println("Enter the second number");
            double number2 = scanner.nextDouble();
            double sum = number1 + number2;
            System.out.println("The sum is "+sum);
            System.out.println("Would you like to start over"  );
            again = scanner.nextBoolean();

        } while (again);

    }
}
