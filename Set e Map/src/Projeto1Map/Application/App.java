package Projeto1Map.Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        String path = "D:\\André\\Programação modular\\java-skills\\Set e Map\\src\\Projeto1Map\\Application\\votos.txt";
        Map<String, Integer> candidatos = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                String[] separacao = line.split(",");
                String nome = separacao[0];
                int votos = Integer.parseInt(separacao[1]);

                if (candidatos.containsKey(nome)) {
                    int votosAteAgora = candidatos.get(nome);
                    candidatos.put(nome, votosAteAgora + votos);

                } else {
                    candidatos.put(nome, votos);
                }

                line = br.readLine();

            }

            for (String key : candidatos.keySet()) {
                System.out.println(key + " : " + candidatos.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
