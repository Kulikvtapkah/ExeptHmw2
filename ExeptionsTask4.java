/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

package ExeptHmw2;

import java.util.Scanner;

public class ExeptionsTask4 {
    public static void main(String[] args) throws InvalidInputExeption {
        Scanner sc = new Scanner(System.in);
        getData(sc);
        sc.close();
    }

    public static void getData(Scanner sc) throws InvalidInputExeption {
        while (true) {
            System.out.print("Введите данные >> ");
            String data = sc.nextLine();
            try {
                if (!data.equals("")) {
                    System.out.print("Супер! Данные получены)");
                    break;
                } else
                    // понимаю, что это сообщение не появится, пока есть catch
                    throw new InvalidInputExeption("строка не может быть пустой.");
            } catch (InvalidInputExeption e) {
                System.out.println("В пустой строке маловато данных( Добавьте что-нибудь!");
            }
        }
    }
}
