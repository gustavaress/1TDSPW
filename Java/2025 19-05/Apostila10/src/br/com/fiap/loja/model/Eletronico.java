package br.com.fiap.loja.model;

public class Eletronico extends Produto{
    private float voltagem;

    // Construtor
    public Eletronico(String nome, double preco, int quantidade, float voltagem) {
        super(nome, preco, quantidade);
        this.voltagem = voltagem;
    }


    //Metodo de desconto. Cupom ELETRO15 -> 15% de desconto
    public double calcularDesconto(String cupom) {
        if (cupom.equalsIgnoreCase("ELETRO15")){
            return calcularDesconto(15);
        }
        return super.calcularDesconto(cupom);

    }

    // Getters and Setters

    public float getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(float voltagem) {
        this.voltagem = voltagem;
    }
}
