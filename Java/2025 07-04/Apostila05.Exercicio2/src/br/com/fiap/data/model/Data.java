package br.com.fiap.data.model;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public String escreverData(){
        return "A data é: " + dia + "/" + mes + "/" + ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia < 1 || dia > 31){
          this.dia = 1;
        } else {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes < 1 || mes > 12){
            this.mes = 1;
        } else {
            this.mes = mes;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano < 0){
            this.ano = 2023;
        } else {
            this.ano = ano;
        }
    }
}
