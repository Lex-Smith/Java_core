package lesson4.homework.Basic.Task1;

public class Task1 {
    //Базовый
    //Задача №1
    public static void main(String[] args) {

        //Дано (их менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String concatenatedString = (hi.trim() + world.toLowerCase() + newLine).repeat(3);
        System.out.print(concatenatedString);
    }

    //Создать из трех переменных единую строку,
    //Привести к правильному виду (Ниже), убрать лишние пробелы,
    //затроить (Можно вызвать тольку одну команду System.out.print())
    //
    //Результат вывода на экран:
    //Hello world!
    //Hello world!
    //Hello world!
}
