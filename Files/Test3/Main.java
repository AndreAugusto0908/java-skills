package Test3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        String[] lines = {"André", "Vitor", "oc"};

        String path = "D:\\André\\Programação modular\\java-skills\\Files\\Test3\\text.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }



    }
}
