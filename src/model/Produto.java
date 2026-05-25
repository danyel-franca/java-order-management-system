package model;

public class Produto {

    private int id;
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {

        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }

        if (preco > 0) {
            this.preco = preco;
        }
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {

        if (preco > 0) {
            this.preco = preco;
        }
    }
}