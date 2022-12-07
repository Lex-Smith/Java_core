package homework4.basic;

public class Airplane implements Flying {

    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void Fly() throws FlyException {

        if (countPassengers < 0) {
            throw new FlyException("Error: Count of passengers is less than zero");
        } else {
            System.out.println("Airplane is flying");
        }
    }
}
