package lesson4.homework.Advanced.Task1;

public class Task1 {
    public static void main(String[] args) {

        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:


        double increment = 0.01123; //0.01123
        double result = 0;
        int iterations = 0;

        while (result < 1_000_000) {
            if (increment < 0) {
                break;
            } else {
                result += increment;
                iterations++;
            }
        }

        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.

        System.out.println("iterations - " + iterations);

        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.

        //System.out.println("result - " + result);
        //почему результат получается
        //1000000.00891249
        // а если на калькуляторе число 0.01123 умножить на кол-во итераций 89047196 получается
        //1000000,01108000
    }
}
