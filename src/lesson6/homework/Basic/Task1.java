package lesson6.homework.Basic;

public class Task1 {

    public static void main(String[] args) {

        Computer computer = new Computer();
        LenovoComputer lenovoComputer = new LenovoComputer();

        computer.on();
        lenovoComputer.on();
        computer.loadSystem();
        lenovoComputer.loadSystem();
        System.out.println("__________");
        computer.work();
        lenovoComputer.work();

    }
}

// Задание №1
// Создать следующие классы
// 1. Electronic (имеет метод on и off - включает/выключает электрический прибор,
// подумать, какой нужен атрибут для этого метода, имеет метод без реализации - work)
// 2. Computer (имеет метод loadSystem - выводит в консоль сообщение "загрузка компьютера")
// 3. LenovoComputer (имеет метод loadSystem - выводит в консоль сообщение "загрузка Lenovo").
// Метод work у компьютера выводит в консоль "выполняет вычисления".
//Подумать какие классы и методы являются абстрактными, к каким методам нужна надпись @Override
