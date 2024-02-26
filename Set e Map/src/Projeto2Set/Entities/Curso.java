package Projeto2Set.Entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Curso {

    private String nome;
    private Professor professor;
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome, Professor professor){
        this.nome = nome;
        this.professor = professor;
        professor.adicionarCurso(this);
    }

    public void adicionarAluno(Aluno a){
        alunos.add(a);
        a.adicionarCurso(this);
    }

    public void removerAluno(Aluno a){
        a.removerCurso(this);
        alunos.remove(a);
    }
    
    public Set<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome);
    }
    
}
