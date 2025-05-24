package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Vestuario;
import br.com.fiap.loja.model.Eletronico;
import br.com.fiap.loja.model.Produto;

public class Main {
    public static void main(String[] args) {
        //Instanciar um eletronico
        Produto produto = new Produto("Mouse Gamer RGB RTX3090", 100, 100);
        Vestuario vestuario = new Vestuario("Rezendeevil", 100, 100, "G");
        Eletronico eletronico = new Eletronico("AuthenticGames", 100, 100, 20);

        // Calcular e exibir o valor
        // System.out.println(produto.calcularDesconto(10, true));

        //Calcular e exibir o valor de 5 itens pagos a vista
        // System.out.println(produto.calcularDesconto(6, false));

        //Calcular e exibir o valor do produto com desconto BEMVINDO
        // System.out.println(produto.calcularDesconto("BEMVINDO"));

        //Teste metodo de desconto vestuario
        System.out.println("Valor vestuário: " + (vestuario.calcularDesconto(3, false)));

        System.out.println(" ");

        //Teste metodo de desconto cupom eletronico ELETRO15
        System.out.println("Valor eletronico: " + (eletronico.calcularDesconto("ELETRO15")));
    }
}
