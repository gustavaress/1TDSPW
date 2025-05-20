package br.com.fiap.loja.model;

public class Vestuario extends Produto{
    private String tamanho;

    // Construtor

    public Vestuario(double preco, int quantidade, String nome, String tamanho) {
        super(preco, quantidade, nome);
        this.tamanho = tamanho;
    }


    // Getters and Setters

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
