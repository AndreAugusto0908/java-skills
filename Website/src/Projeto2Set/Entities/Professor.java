package Projeto2Set.Entities;

import java.util.HashSet;
import java.util.Set;

public class Professor extends Usuario {

    private Set<Curso> cursos = new HashSet<>();
    
    public Professor(int id, String nome) {
        super(id, nome);
    }

    public void adicionarCurso(Curso c){
        cursos.add(c);
    }

    public void removerCurso(Curso c){
        cursos.remove(c);
    }

    public int quantidadeDeAlunos(){
        Set<Aluno> totalAlunos = new HashSet<>();

        for(Curso c : cursos){
            totalAlunos.addAll(c.getAlunos());
        }

        return totalAlunos.size();
    }
    
}
