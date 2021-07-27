/*
Задача №11_Работа с данными
Напишите программу:
Ввести первое  число с клавиатуры и записать его в строковую переменную.
Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
Сравнить 2 числа и вывести большее на экран .
Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
 */
package com.max.idea;
import java.util.Scanner;
public class Data1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        str = Integer.toString(a);
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int resultInt = Math.max(Integer.parseInt(str), b);
        System.out.println("Большее число: " + resultInt);

        double resultDouble = Math.min(Double.parseDouble(str), b);
        System.out.println("Меньшее число: " + resultDouble);
    }
}


