package lesson4.homework.Advanced.Task4;

import java.util.Locale;

public class Task4 {

    public static void main(String[] args) {

        String hw = "Hello world!";

        String formated = hw.replace("l", "r").toUpperCase(Locale.ROOT).substring(0, 8);
        System.out.println(formated);

        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов

    }
}
