package br.com.fiap.locadora.model;

public class Veiculo {
    private String modelo;
    private String cor;
    private int anoFabricacao;
    private double diaria;
    private boolean disponivel;

//    // Construtor
//    public Veiculo(int anoFabricacao, String modelo, String marca, Cor cor, double diaria, boolean disponivel) {
//        this.anoFabricacao = anoFabricacao;
//        this.modelo = modelo;
//        this.marca = marca;
//        this.cor = cor;
//        this.diaria = diaria;
//        this.disponivel = disponivel;
//    }

    // Getters e Setters

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

