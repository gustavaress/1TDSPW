package br.com.fiap.view;

import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {

    public static void main(String[] args) {
        //Criar uma lista de disciplinas
        List<String> disciplinas = new ArrayList<>();
        disciplinas.add("Java");
        disciplinas.add("Python");

        //Adicionar uma disciplina
        disciplinas.add("Jython");

        //Exibir lista
        for (int i = 0; i < disciplinas.size(); i++){
            System.out.println(i + "- " + disciplinas.get(i));
        }
    }
}
