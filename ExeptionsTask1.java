/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

package ExeptHmw2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionsTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Ура! Получено число %s! ", getFloat(sc));
        sc.close();
    }

    public static float getFloat(Scanner sc) {
        float usersFloat = 0F;
        boolean test = false;
        while (test == false) {
            System.out.print("Введите число >> ");

            try {
                usersFloat = sc.nextFloat();
                test = true;
            } catch (InputMismatchException e) {
                System.out.println("Такое себе число... Попробуйте снова! ");
                sc.next();
            }

        }
        return usersFloat;

    }

}
