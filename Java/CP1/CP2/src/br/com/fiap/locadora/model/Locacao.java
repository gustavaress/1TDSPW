package br.com.fiap.locadora.model;

public class Locacao {
    private Cliente cliente;
    private Veiculo veiculo;
    private int diasAlugados;

    // Métodos
    public double valorLocacao(){
        return diasAlugados * veiculo.getDiaria();
    }

    // Getters e Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getDiasAlugados() {
        return diasAlugados;
    }

    public void setDiasAlugados(int diasAlugados) {
        this.diasAlugados = diasAlugados;
    }
}
