package homework5.Basic.task2;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

    public static void main(String[] args) throws IOException {

        FinancialRecor financialRecor = new FinancialRecor(500, 300);

        FileWriter fileWriter = new FileWriter("src\\homework5\\Basic\\task2\\report.txt");
        fileWriter.write("Incomes = " + financialRecor.getIncomes() + ", Outcomes = " + financialRecor.getOutcomes());
        fileWriter.close();
    }
}
