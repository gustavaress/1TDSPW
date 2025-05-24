package br.com.fiap.loja.model;

public class Vestuario extends Produto{
    private String tamanho;

    // Metodo - Se for maior que 2, desconto de 30%.
    //Pagamento a vista tem 10%
    public double calcularDesconto(int quantidade, boolean parcelado){
        int desconto = 0;
        if (quantidade > 2){
            desconto = 30;
        } else {
            desconto = 0;
        }
        if(!parcelado){
            desconto += 10;
        }
        return calcularDesconto(desconto);
    }

    // Construtor

    public Vestuario(String nome, double preco, int quantidade, String tamanho) {
        super(nome ,preco, quantidade);
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
