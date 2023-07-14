package homework4;

import java.util.LinkedList;
import java.util.Scanner;

public class calculator {
        public static Scanner scanner = new Scanner(System.in);

        public static LinkedList calculator() {
        System.out.println("Введите первое число: ");
        double a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        double b = scanner.nextInt();
        System.out.println("Введите операцию + - * /: ");
        char operation = scanner.next().charAt(0);
        LinkedList<String> resultsArray = new LinkedList<>();

        if (operation == '+') {
            double result = a + b;
            System.out.printf("Ответ: %.2f + %.2f = %.2f\n", a, b, result);
            String aStr = String.valueOf(a);
            String bStr = String.valueOf(b);
            String resultStr = String.valueOf(result);
            String operationStr = String.valueOf(operation);
            resultsArray.add(aStr);
            resultsArray.add(operationStr);
            resultsArray.add(bStr);
            resultsArray.add(resultStr);
        }
        else if (operation == '-') {
            double result = a - b;
            System.out.printf("Ответ: %.2f - %.2f = %.2f\n", a, b, result);
            String aStr = String.valueOf(a);
            String bStr = String.valueOf(b);
            String resultStr = String.valueOf(result);
            String operationStr = String.valueOf(operation);
            resultsArray.add(aStr);
            resultsArray.add(operationStr);
            resultsArray.add(bStr);
            resultsArray.add(resultStr);
        }
        else if (operation == '*') {
            double result = a * b;
            System.out.printf("Ответ: %.2f * %.2f = %.2f\n", a, b, result);
            String aStr = String.valueOf(a);
            String bStr = String.valueOf(b);
            String resultStr = String.valueOf(result);
            String operationStr = String.valueOf(operation);
            resultsArray.add(aStr);
            resultsArray.add(operationStr);
            resultsArray.add(bStr);
            resultsArray.add(resultStr);
        }
        else if (operation == '/') {
            double result = a / b;
            System.out.printf("Ответ: %.2f / %.2f = %.2f\n", a, b, result);
            String aStr = String.valueOf(a);
            String bStr = String.valueOf(b);
            String resultStr = String.valueOf(result);
            String operationStr = String.valueOf(operation);
            resultsArray.add(aStr);
            resultsArray.add(operationStr);
            resultsArray.add(bStr);
            resultsArray.add(resultStr);
        }
        System.out.println(resultsArray);
        return resultsArray;
    }
    public static void main(String[] args) {
        while(true)
        calculator();
    }
}
