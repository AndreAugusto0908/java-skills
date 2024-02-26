package Projeto2Set.Entities;

import java.util.Objects;

public abstract class Usuario {
    
    protected Integer id;
    protected String nome;

    public Usuario(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    @Override
    public int hashCode(){
        return id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }
}
