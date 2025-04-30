package br.com.fiap.locadora.model;

public class Cliente {
    private String nome;
    private String telefone;
    private String cnh;
    private double cpf;
    private Endereco endereco;

//    // Construtor
//    public Cliente(String nome, String telefone, String cnh, double cpf, Endereco endereco) {
//        this.nome = nome;
//        this.telefone = telefone;
//        this.cnh = cnh;
//        this.cpf = cpf;
//        this.endereco = endereco;
//    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
