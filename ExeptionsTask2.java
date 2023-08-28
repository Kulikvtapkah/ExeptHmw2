/*Если необходимо, исправьте данный код 
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
Задание 2
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
*/

/*Честно говоря, не уверена, что правильно поняла задачу.
Не могу понять, что этот код должен делать. Как будто, это - некая синтетическая задача, созданная, чтобы бросаться исключениями.
Но в таких штуках чертовски важно понимать, где заканчивается "синтетика" и начинается адекват.
 * Есть восьмой элемент неведомого массива, который делится на число... явно прописанное равным 0.
 * 
 * Если мы намеренно делим на 0, значит нам вообще не нужна строка System.out.println("catchedRes1 = " + catchedRes1),
 * которая никогда не наступит (это ли надо править?).
 * А если 0 не настоящий, а гипотетический, тогда в строке есть какой-то смысл.
 * 
 * В общем, предположила, что данный код - это некий метод, который выдает результат деления элемента
 * массива с заданным индексом на число (вероятно, это должно проходить без "падений").
 * 
 * Раз тема "Исключения", то любое деление чревато делением на 0, а поиск элемента по индексу чреват выходом за границы.
 * Так же на семинаре говорилось, что от TRY лучше избавиться, это вполне возможно.
 *  
 * Прошу прощения за кучу текста.
 *  Надеюсь, мой "полет фантазии" хоть примерно в нужном направлении)
 */

package ExeptHmw2;

public class ExeptionsTask2 {
    public static void main(String[] args) {
        int[] intArray = { 4, -62, 58, 0, 17 };
        int d = 4;
        int i = 11;
        arrayItemDivider(intArray, i, d);
        d = 0;
        i = 4;
        arrayItemDivider(intArray, i, d);
        d = 5;
        i = 1;
        arrayItemDivider(intArray, i, d);

    }

    public static void arrayItemDivider(int[] intArray, int index, int divider) {
        if (divider == 0) {
            System.out.println(
                    "Невозможно выполнить операцию. При делении на 0 получим бесконечность...\nСлишком масштабно для обычной арифметики");
        } else if (index < 0 || index >= intArray.length) {
            System.out.printf(
                    "Невозможно выполнить операцию. Элемент с индексом %s в массиве не существует\nДелиться чем-то несуществующим - сомнительная щедрость)\n",
                    index);
        } else {
            System.out.printf("Ура, победа! результат операции %s\n", (double) intArray[index] / divider);
        }
        System.out.println("");

    }

}
