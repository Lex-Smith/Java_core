package homework4.basic;

public class Duck implements Flying {

    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void Fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Error: Duck is injured");
        } else {
            System.out.println("Duck is flying");
        }
    }
}
