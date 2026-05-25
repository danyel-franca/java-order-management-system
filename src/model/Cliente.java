package model;

import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nome;
    private String email;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nome, String email) {

        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }

        if (email != null && email.contains("@")) {
            this.email = email;
        }

        this.pedidos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

}
