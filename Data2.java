package com.max.idea;
import java.util.Scanner;
public class Data2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите: I like Java!!!");
        String str = scanner.nextLine();
        scanner.close();
        boolean result, result1, result2;
        result = str.contains("Java");
        result1 = str.startsWith("I like");
        result2 = str.endsWith("!!!");

        if(result==true && result1==true && result2==true){
            String str1 = str.toUpperCase();
            System.out.println(str1);
        }else{
            System.out.println("Вы ввели неверный текст");
        }
        String value= "I like Java!!!".replaceAll("a", "o"); //для исключения ошибки после ввода некорректного текста, указала "I like Java!!!", а не str
        System.out.println(value.substring(7,11));
}
}

