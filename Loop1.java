package com.max.idea;
import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        int x = 3;
        int y = 7;
        int z = 15;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите данные в массив");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == x || array[i] == y || array[i] == z) {
            System.out.println("Данное значение имеется в константах");
            }
        }
    }
}






//System.out.print("Введённые данные в массив:");
//        for (int i = 0; i < size; i++) {
//        System.out.print(" " + array[i]);
//        }




