package Projeto1Lambda.Entities;

public class Product {
    
    private String nome;
    private int valor;

    public Product(String nome, int valor){
        this.nome = nome;
        this.valor = valor;
    }

    public boolean ehMaior(){
        return valor >= 100;
    }

    @Override
    public String toString(){
        return "Nome: " + nome;
    }

}
