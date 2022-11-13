package Lesson_2.Basic;

public class Task_2 {
    public static void main(String[] args) {
        int ageChildren = 30;

        if (ageChildren < 6) {
            System.out.println("Child goes to kindergarten");
        } else if (ageChildren < 11) {
            System.out.println("Child goes to primary school");
        } else if (ageChildren < 17) {
            System.out.println("Child goes to high school");
        } else if (ageChildren < 30) {
            System.out.println("Child goes to university");
        } else System.out.println("It's never too late to learn");
    }
}
