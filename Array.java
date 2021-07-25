package com.max.idea;

public class Array {
    public static void main(String[] args) {
        int[] myArray = {1, 10, 3, 20, 2};
        int lastElement = myArray[myArray.length-1];
        myArray[myArray.length-1] = myArray[0];
        myArray[0] = lastElement;
        int middleElement = myArray[myArray.length-3];
        myArray[3] = middleElement;
        System.out.println("Первый элемент массива после замены: " + myArray[0]);
        System.out.println("Последний элемент массива после замены: " + myArray[myArray.length - 1]);
        System.out.println("Средний элемент массива: " + myArray[3]);
        System.out.println("Сумма первого и среднего элемента массива: " +(myArray[0]+myArray[3]));
    }
}

/* Задача №3_ Массивы
Выполните следующие действия с массивом:

Задайте массив из 5 любых целых чисел.
Поменяйте местами первый и последний элемент в массиве.
Вывести в консоль результат суммы первого и среднего элемента.
Примечание : Для получения последнего и среднего элементов в массиве используйте свойство length.


