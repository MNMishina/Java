package com.max.idea;
import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: строки, столбцы");
        int str = input.nextInt();
        int column = input.nextInt();
        int[][] twoDimArray = new int[str][column];
        System.out.println("Введите данные в матрицу");
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < column; j++) {
                twoDimArray[i][j] = input.nextInt();
            }
        }
        System.out.println("Элементы первой строки матрицы, умноженные на 3:");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(twoDimArray[i][j] * 3 + " ");
            }
        }
    }
}

