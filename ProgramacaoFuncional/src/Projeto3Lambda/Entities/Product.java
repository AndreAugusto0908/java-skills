package Projeto3Lambda.Entities;

public class Product {
    
    private String nome;
    private Double valor;

    public Product(String nome, Double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome(){
        return this.nome;
    }

    public Double getValor(){
        return this.valor;
    }


    @Override
    public String toString(){
        return "Nome: " + nome + " " + valor;
    }

}