package Lesson2.Basic;

public class Task3 {
    public static void main(String[] args) {

        boolean chicken = false;//Курица
        boolean vegetables = false;//Овощи
        boolean sour = true;//Соус
        boolean toast = false;//Хлеб
        boolean sausage = false;//Колбаса
        boolean eggs = true;//Яйца

        boolean caesarSalad = chicken && vegetables && sour && toast;
        boolean olivierSalad = vegetables && (sausage || chicken) && eggs;
        boolean vegSalad = vegetables;

        if (caesarSalad) {
            System.out.println("Caesar salad is ready");
        } else if (olivierSalad) {
            System.out.println("Olivier salad is ready");
        } else if (vegSalad) {
            System.out.println("Vegetables salsd is ready");
        } else System.out.println("There is not ingredients to make any salad");
    }
}
