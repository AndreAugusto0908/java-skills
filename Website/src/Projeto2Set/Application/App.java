package Projeto2Set.Application;

import java.util.Scanner;

import Projeto2Set.Entities.Aluno;
import Projeto2Set.Entities.Curso;
import Projeto2Set.Entities.Professor;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Professor professor = new Professor(1, "Alex");

        Curso cursoA = new Curso("a", professor);
        Curso cursoB = new Curso("b", professor);
        Curso cursoC = new Curso("c", professor);

        cursoA.adicionarAluno(new Aluno(21, "Vitao"));
        cursoA.adicionarAluno(new Aluno(35, "Vitao"));
        cursoA.adicionarAluno(new Aluno(22, "Vitao"));
        cursoB.adicionarAluno(new Aluno(21, "Vitao"));
        cursoB.adicionarAluno(new Aluno(50, "Vitao"));
        cursoC.adicionarAluno(new Aluno(42, "Vitao"));
        cursoC.adicionarAluno(new Aluno(35, "Vitao"));
        cursoC.adicionarAluno(new Aluno(13, "Vitao"));

        System.out.println(professor.quantidadeDeAlunos());
        sc.close();
    }
}