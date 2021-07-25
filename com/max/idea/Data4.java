/*
Задача №14_ Работа с данными
Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
Выведите максимальный и минимальный элемент массива.
Из максимального и минимального значения выведите наибольшее по модулю.
 */
package com.max.idea;
import java.util.Random;
public class Data4 {
        public static void main(String[] args) {
            Random random = new Random();
            int[] array = new int[15];
            for (int i = 0; i < array.length; i++) {
                array[i] = (random.nextInt(41) - 20);
            }
            int max = 0;
            int min = 0;
            for (int i = 0; i < array.length; i++) {
                max = Math.max(max, array[i]);
                min = Math.min(min, array[i]);
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            System.out.println("Максимальный элемент массива " + max);
            System.out.println("Минимальный элемент массива " + min);
            if (Math.abs(max) > Math.abs(min)) {
                System.out.println("Из них наибольшее значение по модулю: " + Math.abs(max));
            }
            else {
                System.out.println("Из них наибольшее значение по модулю: " + Math.abs(min));
            }
        }
}
