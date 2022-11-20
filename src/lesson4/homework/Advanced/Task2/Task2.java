package lesson4.homework.Advanced.Task2;

public class Task2 {

    public static void main(String[] args) {

        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
            }
        }

        for (int param : array) {
            System.out.print(param + " ");
        }
        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый
        // нечетный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
    }
}
