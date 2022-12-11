package homework5.basic.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {

        String firstLine = "My grandmother";
        String secondLine = "reading the newspaper life";

        String file = "src\\homework5\\basic\\task1\\babushka.txt";
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(firstLine + "\n" + secondLine);
        fileWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String result = "";
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            result += line + " ";

        }
        System.out.println(result.trim());
        bufferedReader.close();
    }
}
