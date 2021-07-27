/*
Задача №4_Операторы
Написать программу, которая будет выполнять следующие действия:
Ввести три числа с клавиатуры x, y, z
Найти и вывести в консоль среднее арифметическое этих чисел.
Разделить среднее арифметическое на 2 и округлить в меньшую сторону
Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
*/
package com.max.idea;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число (x): ");
        float x = scanner.nextFloat();
        System.out.print("Введите число (y): ");
        float y = scanner.nextFloat();
        System.out.print("Введите число (z): ");
        float z = scanner.nextFloat();
        scanner.close();

            float average = (x + y + z) / 3;
            System.out.println("Среднее арифметическое: " + average);

            double average1 = Math.floor(average / 2);
            System.out.println("Среднее арифметическое/2, округленное в меньшую сторону: " + average1);

            if (average1 > 3) {
                System.out.println("Программа выполнена корректно");
            }
        }
    }


