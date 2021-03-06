/*
Задача №5_ Операторы
Напишите простой калькулятор:

Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
 */
package com.max.idea;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        String operation;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число (a): ");
        double a = scanner.nextDouble();
        System.out.print("Введите число (b): ");
        double b = scanner.nextDouble();
        System.out.print("Введите символ (+, -, *, /): ");
        operation = scanner.next();
        scanner.close();
        if (operation.equals("+")) {
            System.out.println(a + b);
        }
        else if (operation.equals("-")) {
            System.out.println(a - b);
        }
        else if (operation.equals("*")) {
            System.out.println(a * b);
        }
        else if (b != 0 & operation.equals("/")) {
            System.out.println(a / b);
        }
        else if (b == 0) {
            System.out.println("Ошибка. На ноль делить нельзя");
        }
        else {
            System.out.println("Введён некорректный символ");
        }

    }
}



