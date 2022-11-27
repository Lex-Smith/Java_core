package lesson6.homework.Basic;

public abstract class Electronic {

    boolean isOn = false;

//    public abstract void on();
//
//    public abstract void off();

    public void on() {
        isOn = true;
    }

    public void off() {
        isOn = false;
    }
}
