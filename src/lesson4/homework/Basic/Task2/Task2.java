package lesson4.homework.Basic.Task2;

public class Task2 {
    public static void main(String[] args) {

        String result = "";

        for (int i = 1; i < 101; i++) {
            result += i + "a ";
        }

        System.out.println(result.trim());

        // Задание №2 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
    }
}
