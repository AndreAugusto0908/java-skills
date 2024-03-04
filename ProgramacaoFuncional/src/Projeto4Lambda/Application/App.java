package Projeto4Lambda.Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Projeto4Lambda.Entities.Employee;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String path = "D:\\André\\Programação modular\\java-skills\\ProgramacaoFuncional\\src\\Projeto4Lambda\\Application\\employee.txt";
        List<Employee> list = new ArrayList<>();

        try(BufferedReader b = new BufferedReader(new FileReader(path))){

          String line = b.readLine();

          while (line != null) {
            String[] parts = line.split(",");
            list.add(new Employee(parts[0], parts[1], Double.parseDouble(parts[2])));
            line = b.readLine();
          }

          System.out.println("Digite um valor: ");
          Double menorQue = sc.nextDouble();

          List<String> email = list.stream()
          .filter(e -> e.getSalary() > menorQue)
          .map(Employee::getEmail)
          .sorted()
          .collect(Collectors.toList());

          for (String s : email){
            System.out.println(s);
          }

          System.out.println("============================================");

          Double soma = list.stream()
          .filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
          .mapToDouble(Employee::getSalary)
          .sum();
          

          System.out.println("Funcionarios com a Letra M: ");
          System.out.println(soma);

        }catch(IOException e){
          System.out.println("Error: " + e.getMessage());
        }finally{
          sc.close();
        }
        
    }
}

