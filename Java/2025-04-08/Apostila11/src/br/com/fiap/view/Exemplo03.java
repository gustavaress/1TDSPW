package br.com.fiap.view;

import javax.swing.*;
import java.util.Set;
import java.util.HashSet;

public class Exemplo03 {

    public static void main(String[] args) {
        Set<String> registrosMatriculas = new HashSet<>();

        //Adicionar RM
        registrosMatriculas.add("RM562827");

        //Adicionar um RM repetido
        registrosMatriculas.add("RM562827");

        //Exibir a quantidade de RM
        System.out.println(registrosMatriculas.size());

        //Exibir todos os rms
        for (String churros : registrosMatriculas){
            System.out.println(churros);
        }
    }
}
