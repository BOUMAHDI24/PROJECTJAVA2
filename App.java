import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App 
{
    public static void main(String[] args) 
    {
        String file = "src\\Fichier csv.csv";
        int totalMeasures = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) 
        {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                System.out.println(row[0] + " : " + row[1]);
                
                if (row.length > 1) {
                    totalMeasures += Integer.parseInt(row[1].trim());
                }

            }

            System.out.println("Somme totale des mesures : " + totalMeasures);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}











