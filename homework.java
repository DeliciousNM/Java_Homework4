package homework4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class homework {

    /*
     * 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
     * 
     * 2 *. Реализуйте очередь с помощью LinkedList со следующими методами:
     * 
     * enqueue() - помещает элемент в конец очереди,
     * dequeue() - возвращает первый элемент из очереди и удаляет его,
     * first() - возвращает первый элемент из очереди, не удаляя.
     * Это задание повышенной сложности, для решения задачи потребуется создать класс-обертку над LinkedList, например:
     * 
     * class MyQueue {
     *      private LinkedList elements = new LinkedList();
     * 
     *      public MyQueue() { }
     *      public MyQueue(LinkedList linkedList) {
     *          this.elements = linkedList;
     *      }
     * 
     *          .........
     * 
     * }
     * 
     * 3. В калькулятор (урок 1 и 2) добавьте возможность отменить последнюю операцию.
     */

    public static Scanner scanner = new Scanner(System.in);

    public static void reversedList(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println(reversedList);
    }
    public static LinkedList reverseLinkedList(LinkedList list) {
        Collections.reverse(list);
        return list;
    }

        public static void calculator() {
            double num1 = getInt();
            double num2 = getInt();
            char operation = getOperation();
            double result = calc(num1,operation,num2);
            System.out.printf("Ответ: %.2f %c %.2f = %.2f\n", num1, operation, num2, result);
        }
     
        public static double getInt(){
            System.out.print("Введите число: ");
            double num;
            if(scanner.hasNextInt()){
                num = scanner.nextInt();
            } else {
                scanner.next();
                num = getInt();
            }
            return num;
        }
     
        public static char getOperation(){
            System.out.print("Введите операцию + - * / : ");
            char operation;
            if(scanner.hasNext()){
                operation = scanner.next().charAt(0);
            } else {
                scanner.next();
                operation = getOperation();
            }
            return operation;
        }
     
        public static double calc(double num1, char operation, double num2){
            double result;
            switch (operation){
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    result = num1/num2;
                    break;
                default:
                    result = calc(num1, getOperation(), num2);
            }
            return result;
        }


    public static void main(String[] args) {
    boolean f = true;
    while (f) {
        System.out.println("Укажите номер задачи:");
        System.out.println("1 Перевёрнутый список");
        System.out.println("2 Калькулятор");
        System.out.println("0 завершение работы");
        System.out.print("Введите номер задачи: ");
        int no = Integer.parseInt(scanner.nextLine());

            if (no == 1) {
                reversedList();
                System.out.println();
            } else if (no == 2) {
                calculator();
                System.out.println();
            } else if (no == 0) {
                f = false;
                System.out.print("Завершение работы");
            }
        
        }
    }
    }

