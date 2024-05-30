package calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = input.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = input.nextInt();
        System.out.print("Введите операцию над числами (+, -, *, /): ");
        char operation = input.next().charAt(0);
        Calculator calculator = new Calculator(num1, num2, operation);
        int result = 0;
        result = calculator.calculate();
        System.out.println("Итог: " + result);

    }
}