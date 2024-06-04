import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ResistorCalculatorDoSuboru {

    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\42194\\workspace\\Skusky_2024INF2\\src\\odpor.txt";
        String outputFileName = "C:\\Users\\42194\\workspace\\Skusky_2024INF2\\src\\odporVysledok.txt";
        Map<String, Integer> resistors = new HashMap<>();

        try (Scanner scanner = new Scanner(new File(inputFileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("R")) {
                    String[] parts = line.split(" ");
                    String resistor = parts[0];
                    int value = Integer.parseInt(parts[2]);
                    resistors.put(resistor, value);
                }
            }

            // Calculate O1 (parallel R1 and R2)
            double R1 = resistors.get("R1");
            double R2 = resistors.get("R2");
            double O1 = 1 / ((1 / R1) + (1 / R2));

            // Calculate O2 (parallel R3 and R4)
            double R3 = resistors.get("R3");
            double R4 = resistors.get("R4");
            double O2 = 1 / ((1 / R3) + (1 / R4));

            // Calculate O3 (series O1 and O2)
            double O3 = O1 + O2;

            // Write results to output file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
                writer.write("O1: " + O1 + " ohms\n");
                writer.write("O2: " + O2 + " ohms\n");
                writer.write("O3: " + O3 + " ohms\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

