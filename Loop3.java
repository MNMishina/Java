/*
Задача №9_ Циклы
Напишите программу:
Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
Посчитайте среднее арифметическое элементов массива.
После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
 */
package com.max.idea;
import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = input.nextInt();
        double[] array = new double[size];
        System.out.println("Введите данные в массив");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
        }
        double average = 0;
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        average = sum / size;
        System.out.println("Среднее арифметическое элементов массива " + average);
        System.out.print("Введённые данные в массив, умноженные на их среднее арифметическое: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i] * average);
        }
    }
}
