package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Vestuario;
import br.com.fiap.loja.model.Eletronico;
import br.com.fiap.loja.model.Produto;

public class Main {
    public static void main(String[] args) {
        //Instanciar um produto
        Produto eletronico = new Eletronico(100, 1, "Neymar", 10);

        // Calcular e exibir o valor
        System.out.println(eletronico.calcularDesconto(10, true));
    }
}
