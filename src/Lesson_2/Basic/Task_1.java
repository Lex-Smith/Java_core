package Lesson_2.Basic;

public class Task_1 {
    public static void main(String[] args) {
        double height = 1.78; //in meters
        double weight = 103; //in kilograms
        double bodyMassIndex = weight / (height * height);

        System.out.println(bodyMassIndex);
    }
}

