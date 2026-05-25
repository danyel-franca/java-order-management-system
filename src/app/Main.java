package app;

import model.Cliente;
import model.ItemPedido;
import model.Pedido;
import model.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Pedido> pedidos = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            mostrarMenu();

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    criarPedido();
                    break;

                case 2:

                    listarPedidos();
                    break;

                case 3:

                    System.out.println("\nEncerrando sistema...");
                    scanner.close();
                    return;

                default:

                    System.out.println("\nOpção inválida!");
            }
        }
    }

    public static void mostrarMenu() {

        System.out.println("\n===== SISTEMA DE PEDIDOS =====");

        System.out.println("1 - Criar pedido");
        System.out.println("2 - Listar pedidos");
        System.out.println("3 - Sair");

        System.out.print("\nEscolha uma opção: ");
    }

    public static void criarPedido() {

        System.out.print("\nNome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Email do cliente: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(nome, email);

        Pedido pedido = new Pedido(cliente);

        while (true) {

            System.out.print("\nNome do produto: ");
            String nomeProduto = scanner.nextLine();

            System.out.print("Preço do produto: ");
            double preco = scanner.nextDouble();

            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            Produto produto = new Produto(nomeProduto, preco);

            ItemPedido item = new ItemPedido(produto, quantidade);

            pedido.adicionarItem(item);

            System.out.println("\nProduto adicionado com sucesso!");

            String continuar;

            while (true) {

                System.out.print("\nDeseja adicionar outro produto? (sim/nao): ");

                continuar = scanner.nextLine()
                        .trim()
                        .toLowerCase();

                if (continuar.equals("s") ||
                        continuar.equals("sim") ||
                        continuar.equals("y") ||
                        continuar.equals("yes")) {
                    break;
                }

                if (continuar.equals("n") ||
                        continuar.equals("nao") ||
                        continuar.equals("não") ||
                        continuar.equals("no")) {
                    break;
                }

                System.out.println("\nOpção inválida!");
            }

            if (continuar.equals("n") ||
                    continuar.equals("nao") ||
                    continuar.equals("não") ||
                    continuar.equals("no")) {
                break;
            }
        }

        cliente.adicionarPedido(pedido);

        pedidos.add(pedido);

        System.out.println("\nPedido criado com sucesso!");
    }

    public static void listarPedidos() {

        if (pedidos.isEmpty()) {

            System.out.println("\nNenhum pedido cadastrado.");
            return;
        }

        System.out.println("\n===== LISTA DE PEDIDOS =====");

        for (Pedido pedido : pedidos) {

            System.out.println("\nCliente: " + pedido.getCliente().getNome());

            System.out.println("Email: " + pedido.getCliente().getEmail());

            System.out.println("\nProdutos:");

            for (ItemPedido item : pedido.getItens()) {

                System.out.println(
                        "- " + item.getProduto().getNome()
                                + " | Quantidade: "
                                + item.getQuantidade()
                                + " | Subtotal: R$ "
                                + item.calcularSubtotal());
            }

            System.out.println("\nTotal do Pedido: R$ " + pedido.calcularTotal());

            System.out.println("Status: " + pedido.getStatus());

            System.out.println("Data: " + pedido.getData());

            System.out.println("-----------------------------------");
        }
    }
}