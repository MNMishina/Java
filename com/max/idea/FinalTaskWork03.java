/*
Итоговая задача № 3
Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки. Среди данных строк найти строку с максимальным количеством различных символов. Если таких строк будет много, то вывести первую.
Пример для теста работы программы:
Количество строк: 3
Строка 1: привет
Строка 2: анализ
Строка 3: 111111111111
Ответ: привет
*/
package com.max.idea;
import java.util.Scanner;
public class FinalTaskWork03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }
        scanner.close();
        int currentDf = 0; //Текущая строка с различными символами
        int maxDf = 0;     //Строка с максимальным количеством различных символов
        int indexDf = 0;   //Индекс строки с максимальным количеством различных символов
        for (int i = 0; i < n; i++) {
            currentDf = Math.toIntExact(array[i].chars().distinct().count());  // Получаем кол-во уникальных символов в строке (из нашего массива) и приводим строку к типу int
            if (currentDf > maxDf) {
                maxDf = currentDf; //Работает на получение строки с максимальным количеством различных символов
                indexDf = i;
            } else if (currentDf == maxDf) {
                //Ничего не делает
            } else if (currentDf < maxDf) {
                //Ничего не делает
            }
        }
        System.out.print("Ответ: " + array[indexDf]);  //Вывод строки с максимальным количеством различных символов
    }
}



