package br.com.fiap.data.teste;

import br.com.fiap.data.model.Data;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        //Instanciar data
        Data data = new Data();

        //Scanner
        Scanner leitor = new Scanner(System.in);

        //Inserir valores
        System.out.println("Digite um dia: ");
        data.setDia(leitor.nextInt());

        System.out.println("Digite um mês: ");
        data.setMes(leitor.nextInt());

        System.out.println("Digite um ano: ");
        data.setAno(leitor.nextInt());

        System.out.println(data.escreverData());
    }
}