import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  {

        String path = "D:\\André\\Programação modular\\java-skills\\Files\\Exercicio\\Read.txt";
        String outPath = "D:\\André\\Programação modular\\java-skills\\Files\\Exercicio\\VaiSerEscrito.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                Double number = Double.parseDouble(parts[1]);
                int qtd = Integer.parseInt(parts[2]);
    
                System.out.println(parts[0] + "," + number * qtd);
                bw.write(parts[0] + "," + number * qtd);
                bw.newLine();  
            }
            
            
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    
    }

    
}
