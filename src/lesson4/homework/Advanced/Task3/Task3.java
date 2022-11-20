package lesson4.homework.Advanced.Task3;

import java.sql.Array;

public class Task3 {
    public static void main(String[] args) {
        int firstArray[] = {1, 2, 5, 7, 10};
        int secondArray[] = {2, 3, 2, 17, 15};

        int array[] = new int[firstArray.length * 3];

        for (int i = 0; i < firstArray.length * 3; i++) {
            if (i < firstArray.length) {
                array[i] = firstArray[i];
                continue;
            }
            if (i < firstArray.length + secondArray.length) {
                array[i] = secondArray[i - firstArray.length];
                continue;
            } else
                array[i] = array[i] = firstArray[i - (firstArray.length * 2)] * secondArray[i - (secondArray.length * 2)];

        }

        // как вариант через кучу циклов

//            for (int i = 0; i < firstArray.length; i++) {
//                array[i] = firstArray[i];
//            }
//
//            for (int i = 0; i < secondArray.length; i++) {
//                array[i + firstArray.length] = secondArray[i];
//            }
//
//            for (int i = 0; i < secondArray.length; i++) {
//                array[i + firstArray.length + secondArray.length] = firstArray[i] * secondArray[i];
//            }

        String arrayStr = "";

        for (int param : array) {
            arrayStr += param + ",";
        }

        System.out.println(arrayStr.substring(0, arrayStr.length() - 1));

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
    }
}
