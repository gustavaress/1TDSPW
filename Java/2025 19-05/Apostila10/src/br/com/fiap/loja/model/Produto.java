package br.com.fiap.loja.model;

public class Produto {
    private double preco;
    private int quantidade;
    private String nome;

    // Metodos
    public double calcularDesconto(int porcentagem){
        return preco - ((preco/100) * porcentagem);
    }

    // Se a quantidade for maior que 5%, desconto de 20%, senão 5% de desconto
    // Se a vista, tem mais 5% de desconto
    public double calcularDesconto(int quantidade, boolean parcelado){
        int porcentagem = 0;
        if(quantidade > 5){
            porcentagem = 20;
        } else {
            porcentagem = 5;
        }
        if (!parcelado){
            porcentagem += 5;
        }
        return calcularDesconto(porcentagem);
    }


    // Construtor
    public Produto(double preco, int quantidade, String nome) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
