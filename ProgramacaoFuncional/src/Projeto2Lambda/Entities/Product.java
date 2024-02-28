package Projeto2Lambda.Entities;

public class Product {
    
    private String nome;
    private int valor;

    public Product(String nome, int valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome(){
        return this.nome;
    }

    public int getValor(){
        return this.valor;
    }


    @Override
    public String toString(){
        return "Nome: " + nome + " " + valor;
    }

}
