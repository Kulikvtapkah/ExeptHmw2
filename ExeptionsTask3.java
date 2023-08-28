/*Дан следующий код, исправьте его там, где требуется 
(задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
Задание 3

public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

*/

/*
 * Снова не до конца понимаю, до каких пределов можно/нужно менять код
 * Снова предположила, что все вводные откуда-то поступают и могут меняться
 * Если кардинально не менять структуру, как минимум строка catch (Throwable ex)
 * должна быть с конце блока catch, т.к. она ловит все; остальные варианты бесполезны;
 * а также printSum, вероятно, должна кидаться не FileNotFoundException-ами, а NullPointerException-ами.
 * 
 * Если попытаться понять, что код вообще делает, получается так:
 * нужно выполнить 3 разных операции с данными. Данные, вероятно, приходят из какого-то предыдущего кода.
 * Т.к. в примере значения "вбиты", предположу, что данные валидные 
 * (т.е. где написано "int" точно не строка, null или черепашка какая-нибудь)
 * 
 */

package ExeptHmw2;

public class ExeptionsTask3 {
    public static void main(String[] args) {
        int[] abc = { 1, 2 };
        setByIndex(abc, 3, 9);

        int a = 90;
        int b = 3;
        printQuotient(a, b);


        printSum(23, 234);
        printSum(22, null);

    }

    public static void printSum(Integer a, Integer b) {
        if (a != null && b != null)
            System.out.println(a + b);
        else
            System.out.println("Указатель не может иметь значение null!");
    }

    public static void printQuotient(int a, int divider) {
        if (divider != 0)
            System.out.println(a / divider);
        else
            System.out.println("Делить на 0 не так просто");
    }

    public static void setByIndex(int[] arr, int index, int newValue) {
        if (index >= 0 && index < arr.length)
            arr[index] = newValue;
        else
            System.out.println("Индекс за пределами размеров массива!");
    }

}
