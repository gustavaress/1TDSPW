package br.com.fiap.view;

import java.util.ArrayList;
import java.util.List;

public class Exemplo01 {

    public static void main(String[] args) {
        List<String> alunos = new ArrayList();
        alunos.add("Pedro Lemori");
        alunos.add("Gabriel Maciel");
        alunos.add("MDS");

        //Adicionar 1 aluno na segunda posição da lista
        alunos.add(1, "Cabron");

        //Exibir a quantidade de alunos na lista
        System.out.println("Quantidade de alunos: " + alunos.size());

        //Exibir aluno da posição 1
        System.out.println("Aluno 1: " + alunos.get(0));

        //Exibir todos os alunos
        for (int i = 0; i < alunos.size(); i++){
            System.out.println(i + "- " + alunos.get(i));
        }
    }


}
