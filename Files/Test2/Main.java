package Test2;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args)  {
        String path = "D:\\André\\Programação modular\\java-skills\\Files\\Test2\\read.txt";

        try (BufferedReader br = new BufferedReader (new FileReader(path))){
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}