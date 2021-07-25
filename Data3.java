package com.max.idea;
import java.util.Scanner;
public class Data3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст на кириллице и латинице + цифры:");
        String str = scanner.nextLine();
        scanner.close();
        int countWords = 0;
        String[] words = str.split("\\s+");
        System.out.println("Слова только на латинице:");
        for (String myStr : words) {
            if (myStr.matches("^[a-zA-Z]+$")) {
                System.out.print(myStr + " ");
                countWords++;
            }
        }
        System.out.println();
        System.out.println("Количество слов только на латинице: " + countWords);
    }
}


