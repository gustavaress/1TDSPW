package br.com.fiap.loja.model;

public class Eletronico extends Produto{
    private float voltagem;

    // Construtor

    public Eletronico(double preco, int quantidade, String nome, float voltagem) {
        super(preco, quantidade, nome);
        this.voltagem = voltagem;
    }


    // Getters and Setters

    public float getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(float voltagem) {
        this.voltagem = voltagem;
    }
}
