package homework5.Advanced;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task1 {

    private static String incomes = "Incomes = ";
    private static String outcomes = "Outcomes = ";
    private static String separator = ", ";

    public static void main(String[] args) throws IOException {

        Random random = new Random(1);
        FileWriter fileWriter = new FileWriter("src\\homework5\\Advanced\\report_2.txt");
        String file = "src\\homework5\\Advanced\\report_2.txt";
        String result = "";

        for (int i = 0; i < 10; i++) {
            FinancialRecord financialRecord = new FinancialRecord(random.nextInt(10000), random.nextInt(10000));
            fileWriter.write(incomes + financialRecord.getIncomes() + separator + outcomes + financialRecord.getOutcomes() + "\n");
        }
        fileWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            result += line + separator;
        }
        bufferedReader.close();

        System.out.println("General Incomes = " + getGeneralIncomes(result) + separator + "General Outcomes = " + getGeneralOutcomes(result));
    }

    public static int getGeneralIncomes(String findAllIncomes) {
        int generalIncomes = 0;

        for (int i = 0; i < 10; i++) {
            String inc = findAllIncomes.substring(findAllIncomes.indexOf(incomes) + 10, findAllIncomes.indexOf(separator + outcomes));
            findAllIncomes = findAllIncomes.substring(findAllIncomes.indexOf(separator + outcomes) + 1);
            generalIncomes += Integer.parseInt(inc);
        }
        return generalIncomes;
    }

    // Тут скорее всего надо было сделать через регулярные выражения но пока не разобрался как
    public static int getGeneralOutcomes(String findAllOutcomes) {
        int generalOutcomes = 0;
        String cut = findAllOutcomes;

        for (int i = 0; i < 10; i++) {
            cut = cut.substring(cut.indexOf(outcomes));
            String out = cut.substring(cut.indexOf(outcomes) + 11, cut.indexOf(separator));
            cut = cut.substring(cut.indexOf(separator) + 1);
            generalOutcomes += Integer.parseInt(out);
        }
        return generalOutcomes;
    }
}
