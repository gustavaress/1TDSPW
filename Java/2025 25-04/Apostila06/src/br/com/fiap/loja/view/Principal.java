package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Cliente;

public class Principal {

    public static void main(String[] args) {
        // Instanciar o Cliente
        Cliente cliente = new Cliente("Cabron", 69);

        // Exibir os dados do cliente
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Vip: " + cliente.isVip());
    }
}
