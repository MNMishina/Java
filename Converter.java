package com.max.idea;
import java.lang.System;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - фунт, 4 - унция");
        } else if (a == 2){
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        }
        int b = scanner.nextInt();

        System.out.println("Введите число:");
        int number = scanner.nextInt();
        scanner.close();

        if (a == 1) {
            switch (b) {
                case 1:
                    System.out.println("Результат:\nГраммы:" + number + "\nКилограммы:" + number / 1000 + "\nФунты:" + number * 0.0022046 + "\nУнции:" + number * 0.035274);
                    break;
                case 2:
                    System.out.println("Результат:\nГраммы:" + number * 1000 + "\nКилограммы:" + number + "\nФунты:" + number * 2.2046 + "\nУнции:" + number * 35.274);
                    break;
                case 3:
                    System.out.println("Результат:\nГраммы:" + number / 0.0022046 + "\nКилограммы:" + number / 2.2046 + "\nФунты:" + number + "\nУнции:" + number * 16);
                    break;
                case 4:
                    System.out.println("Результат:\nГраммы:" + number / 0.035274 + "\nКилограммы:" + number / 35.274 + "\nФунты:" + number * 0.0625 + "\nУнции:" + number);
                    break;
            }
        } else if (a == 2) {
            switch (b) {
                case 1:
                    System.out.println("Результат:\nМетры:" + number + "\nМили:" + number * 0.00062 + "\nЯрды:" + number * 1.09 + "\nФуты:" + number * 3.2808);
                    break;
                case 2:
                    System.out.println("Результат:\nМетры:" + number / 0.00062 + "\nМили:" + number + "\nЯрды:" + number * 1760 + "\nФуты:" + number * 5280);
                    break;
                case 3:
                    System.out.println("Результат:\nМетры:" + number * 0.914 + "\nМили:" + number * 0.00062 + "\nЯрды:" + number + "\nФуты:" + number * 3);
                    break;
                case 4:
                    System.out.println("Результат:\nМетры:" + number / 3.2808 + "\nМили:" + number * 0.0002 + "\nЯрды:" + number * 0.33 + "\nФуты:" + number);
                    break;
            }
        }
    }
}
