package br.com.fiap.loja.model;

public class Cliente {

    // Atributos
    private String nome;
    private int idade;
    private String telefone;
    private boolean vip;

    // Construtor
    public Cliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
