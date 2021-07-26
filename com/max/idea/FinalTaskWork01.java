/*
Итоговая задача №1
Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу. Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой. Пример для теста работы программы:

Курс доллара: 67,55
Количество рублей: 1000
Итого: 14,80 долларов
 */
package com.max.idea;
import java.util.Scanner;
public class FinalTaskWork01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара: ");
        double exRate = scanner.nextDouble();
        System.out.println("Введите количество рублей для конвертации: ");
        int sum = scanner.nextInt();
        scanner.close();
        double result = sum / exRate;
        System.out.print("Итого: ");
        System.out.printf("%.2f", result);
        System.out.print(" долларов");
    }
    }

