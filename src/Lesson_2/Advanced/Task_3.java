package Lesson_2.Advanced;

public class Task_3 {
    public static void main(String[] args) {

        int repairsAmount = 0;
        int breakingcount = 0;
        String discount = "discount 0%";
        String repairedParts = "";

        boolean hasFuel = true;
        boolean hasElectricsProblem = true; //5000
        boolean hasMotorProblem = false; //10000
        boolean hasTransmissionProblem = true; //4000
        boolean hasWheelsProblem = false; //2000
        boolean hasProblems = hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem;

        if (hasFuel && !hasProblems) {
            repairedParts = "no repair or diagnostic neded\n";
        }

        if (!hasFuel && !hasProblems) {
            repairsAmount = 1000;
            discount = "diagnostic only\n";
            repairedParts = "no fuel, diagnostic - 1000\n";
        }
        if (hasMotorProblem) {
            repairsAmount += 10000;
            breakingcount += 1;
            repairedParts = "Motor repair - 10000\n";
        }
        if (hasElectricsProblem) {
            repairsAmount += 5000;
            breakingcount += 1;
            repairedParts = repairedParts + "Electrics repair - 5000\n";
        }
        if (hasTransmissionProblem){
            repairsAmount += 4000;
            breakingcount += 1;
            repairedParts = repairedParts + "Transmission repair - 4000\n";
        }
        if (hasWheelsProblem) {
            repairsAmount += 2000;
            breakingcount += 1;
            repairedParts = repairedParts + "Wheels repair - 2000\n";
        }
        if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
            repairsAmount = repairsAmount / 100 * 80;
            discount = "discount 20%\n";

        }else if (breakingcount > 1) {
            repairsAmount = repairsAmount / 100 * 90;
            discount = "discount 10%\n";
        }
        String check = "number of broken parts - " + breakingcount + " PCS\n"
                + repairedParts + discount + "\n" + "repair amount = " + repairsAmount;

        System.out.println(check);


        // Задание №3:
        // Дано:

        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // -Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // -Если у машины проблема с двигателем, то чинят и берут 10 000.
        // -Если у машины проблема с электрикой, то чинят и берут 5000.
        // -Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // -Если у машины проблема с колесами, то чинят и берут 2000.
        // -Если две детали сломаны, то на общий счет идет скидка 10%.
        // -Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // -Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.

    }
}
