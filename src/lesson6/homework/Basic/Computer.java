package lesson6.homework.Basic;

public class Computer extends Electronic {

    boolean isLoaded = false;

    public void loadSystem() {
        if(isOn) {
            System.out.println("computer loading");
            isLoaded = true;
        } else System.out.println("please turn on your computer");
    }

    public void work() {
        if (isLoaded) {
            System.out.println("calculations are performed");
        } else if(isOn) {
            System.out.println("please load your computer");
        } else System.out.println("please turn on your computer");
    }



//    @Override
//    public void on() {
//
//    }
//
//    @Override
//    public void off() {
//
//    }
}
