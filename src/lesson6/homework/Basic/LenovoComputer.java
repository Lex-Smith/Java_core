package lesson6.homework.Basic;

public class LenovoComputer extends Computer {

    @Override
    public void loadSystem() {
        if(isOn) {
            System.out.println("Lenovo loading");
            isLoaded = true;
        } else System.out.println("please turn on your computer");
    }
}
