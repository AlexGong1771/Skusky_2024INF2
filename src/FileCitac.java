import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileCitac {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\42194\\workspace\\Skusky_2024INF2\\src\\odpor.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
           String line;
            while ((line = br.readLine()) != null) {

                    System.out.println(line.toString());

            }
        }  catch (IOException e) {
        e.printStackTrace();
    }
    }
}
