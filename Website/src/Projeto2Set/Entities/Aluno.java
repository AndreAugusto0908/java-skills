package Projeto2Set.Entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Aluno extends Usuario {

    private Set<Curso> cursos = new HashSet<>();
    
    public Aluno(int id, String nome) {
        super(id, nome);
    }

    public void adicionarCurso(Curso c){
        cursos.add(c);
    }

    public void removerCurso(Curso c){
        cursos.remove(c);
    }

        
}
