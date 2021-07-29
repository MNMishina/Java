/*
Итоговая задача №4
Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”. Ответ: “Заархивированный вирус”.
У пользователя есть 3 попытки, чтобы отгадать загадку.
Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны. Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку. Если на 2 и 3, вывести “Подсказка уже недоступна”.
Если пользователь, использовавший подсказку, ошибется,
вывести “Обидно, приходи в другой раз” и завершить работу.
 */
package com.max.idea;
import java.util.Scanner;
public class FinalTaskWork04 {
    public static void main(String[] args) {
        boolean hint = false;                     // Использование подсказки: по умолчанию не использована
        String rightAnswer = "Заархивированный вирус";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Отгадайте загадку за 3 попытки (в 1ой попытке можно попросить Подсказку):\nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.");
        String userAnswer = scanner.nextLine();
        for (int i = 0; i < 3; i++) {
            if (userAnswer.equalsIgnoreCase(rightAnswer)) {
                System.out.println("Правильно!");
                    return;
            } if (userAnswer.equalsIgnoreCase("Подсказка") && i == 0) {
                hint = true;
                System.out.println("Подсказка: 'Угроза для компа'. 2 оставшиеся попытки уже недоступны.");
                userAnswer = scanner.nextLine();
            } else if (userAnswer.equalsIgnoreCase("Подсказка") && i == 1) {
                System.out.println("Подсказка уже недоступна");
                userAnswer = scanner.nextLine();
                i--;
            } else if (userAnswer.equalsIgnoreCase("Подсказка") && i == 2) {
                System.out.println("Подсказка уже недоступна");
                userAnswer = scanner.nextLine();
                i--;
            } else if (hint) {                                           // Подсказка не использована, ответ юзера не совпал с верным ответом
                System.out.println("Обидно, приходи в другой раз.");
                return;
            } else if (i == 2) {                                   // Выход из программы
                break;
            } else {
                System.out.println("Подумай еще!");
                userAnswer = scanner.nextLine();
            }
            }
            System.out.println("Обидно, приходи в другой раз.");
            scanner.close();
        }
    }



















     //   scanner.close();











  /*      //for (int i = 0; i < 3; i++) {

            if () {
                //i++;
                System.out.println("Правильно !");
            }
            else{
                System.out.println("Попробуй еще");
            }
        }
    }
}

*/