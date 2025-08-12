package br.com.fiap.view;

import javax.swing.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exemplo04 {

    public static void main(String[] args) {
        //Criar um mapa de estados (Chave: Sigla, Valor: Nome)
        Map<String, String> estado = new HashMap<>();

        //Adicionar 4 estados
        estado.put("SP", "São Paulo");
        estado.put("RS", "Rio Grande do Sul");
        estado.put("RN", "Rio Grande do Norte");
        estado.put("AC", "Acre");

        //Exibir a quantidade de estados
        System.out.println(estado.size());

        //Exibir a sigla e o nome de todos os estados mapeados
        Set<String> chaves = estado.keySet();

        //Laço para percorrer todas as chaves
        for (String sigla : chaves){
            String nome = estado.get(sigla);
            
            //Exibir a chave do valor
            System.out.println(sigla + " - " + nome);
        }
    }
}
