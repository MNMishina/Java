/*
Итоговая задача №2
Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.  Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’. Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке. Нужно найти неизвестное.
Пример для теста работы программы:
Ввод: x+5=7
Вывод: 2
Ввод: 3-x=9
Вывод: -6
Ввод: 3-3=x
Вывод: 0
 */
package com.max.idea;
import java.util.Scanner;
public class FinalTaskWork02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод: ");
        String str = scanner.nextLine();
        scanner.close();
        int result = 0;
        int x = str.indexOf('x');        //возвращает индекс в данной строке 1-ого вхождения переменной х
        char[] math = str.toCharArray(); //преобразование строки в массив
        if (math.length == 5) {
            if (math[1] == '+') {
                    switch (x) {
                        case (0):
                            result = Character.getNumericValue(math[4]) - Character.getNumericValue(math[2]);
                            break;
                        case (2):
                            result = Character.getNumericValue(math[4]) - Character.getNumericValue(math[0]);
                            break;
                        case (4):
                            result = Character.getNumericValue(math[0]) + Character.getNumericValue(math[2]);
                            break;
                    }
                    System.out.println("Вывод: " + result);
                }
            else if (math[1] == '-') {
                    switch (x) {
                        case (0):
                            result = Character.getNumericValue(math[4]) + Character.getNumericValue(math[2]);
                            break;
                        case (2):
                            result = Character.getNumericValue(math[0]) - Character.getNumericValue(math[4]);
                            break;
                        case (4):
                            result = Character.getNumericValue(math[0]) - Character.getNumericValue(math[2]);
                            break;
                    }
                    System.out.println("Вывод: " + result);
            } else {
                    System.out.println("Вы ввели не + или -");
            }
            } else {
                System.out.println("Вы ввели уравнение неверно");
            }
        }
    }

















