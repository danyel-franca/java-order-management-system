package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

    private int id;
    private Cliente cliente;
    private ArrayList<ItemPedido> itens;
    private StatusPedido status;
    private LocalDate data;

    public Pedido(Cliente cliente) {

        if (cliente != null) {
            this.cliente = cliente;
        }

        this.status = StatusPedido.PENDENTE;
        this.data = LocalDate.now();
        this.itens = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public LocalDate getData() {
        return data;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {

        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}