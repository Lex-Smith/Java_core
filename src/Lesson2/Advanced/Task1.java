package Lesson2.Advanced;

public class Task1 {
    public static void main(String[] args) {
        String num = "234";
        String text = "some_text";
        int number = Integer.valueOf(num);
        int summ = number + text.length();
        System.out.println(summ);
    }
}
