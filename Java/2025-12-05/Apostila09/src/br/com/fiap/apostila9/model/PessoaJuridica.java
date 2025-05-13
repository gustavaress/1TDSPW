package br.com.fiap.apostila9.model;

public class PessoaJuridica extends Pessoa{
    private String cpnj;
    private boolean ativo;

    // Getters and Setters
    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
