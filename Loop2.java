/*
Задача №8_ Циклы
Напишите программу, где пользователь вводит любое целое положительное число n. А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
 */
package com.max.idea;
import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i = i+2) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }


