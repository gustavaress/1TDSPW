package br.com.fiap.model;

public class Disciplina {

    private String nome;
    private String categoria;
    private int cargaHoraria;

    public Disciplina(String nome, String categoria, int cargaHoraria) {
        this.nome = nome;
        this.categoria = categoria;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return nome + " - " + categoria + " - " + cargaHoraria + " horas";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
