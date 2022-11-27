package lesson6.homework.Basic;

public class Task2 {
    public static void main(String[] args) {

        CargoVehicle cargoVehicle = new CargoVehicle("Kamaz");
        CargoVehicle cargoVehicle1 = new CargoVehicle("Volvo");
        PassengerVehicle passengerVehicle = new PassengerVehicle("KIA");
        PassengerVehicle passengerVehicle1 = new PassengerVehicle("volkswagen");
        Vehicle[] carPark = {cargoVehicle, cargoVehicle1, passengerVehicle, passengerVehicle1};
        for (Vehicle vehicle: carPark) {
            System.out.println(vehicle.brand);
        }
    }

    //Задание №2
    //Создать два класса машин, создать 4 экземпляра и положить их в один массив
}
