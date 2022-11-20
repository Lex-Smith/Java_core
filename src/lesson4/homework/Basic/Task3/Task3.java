package lesson4.homework.Basic.Task3;

public class Task3 {
    public static void main(String[] args) {

        //Этого в задании нет, сделал что-бы проверить работают классы или нет

        Panda panda = new Panda("po", 0.1);
        panda.setName("Po");
        panda.setWeight(115.5);

        Hedgehog hedgehog = new Hedgehog("sonic", 0.78);
        hedgehog.setName("Sonic");
        hedgehog.setWeight(34.8);

        System.out.println("Panda\nName: " + panda.getName() + "\n" + "Weight " + panda.getWeight() + " kg.");
        System.out.println("__________");
        System.out.println("Hedgehog\nName: " + hedgehog.getName() + "\n" + "Weight " + hedgehog.getWeight() + " kg.");
        // Задание №3
        // Создать два класса, которые описывают виды животных (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Например: класс Кот, класс Собака
    }
}
