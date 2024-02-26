package Projeto1Set.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import Projeto1Set.Entities.Users;

import java.time.Instant;

public class App {

    public static void main(String[] args) {
        String path = "D:\\André\\Programação modular\\java-skills\\Set e Map\\src\\Projeto1Map\\Application\\in.txt";
        Set<Users> set = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                String[] parts = line.split(" ");
                Date date = Date.from(Instant.parse(parts[1]));
                set.add(new Users(parts[0], date));
                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
