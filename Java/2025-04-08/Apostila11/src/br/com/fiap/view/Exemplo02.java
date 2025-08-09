package br.com.fiap.view;
import br.com.fiap.model.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {

    public static void main(String[] args) {
        //Criar uma lista de disciplinas
        List<Disciplina> disciplinas = new ArrayList<>();

        int opcao = -1;
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n 1 - Cadastrar \n 2 - Exibir lista \n 3 - Sair"));;

        while (opcao < 0){
            if (opcao == 1){
                //Ler do usuario os valores dos atributos da disciplina
                String nome = JOptionPane.showInputDialog("Digite o nome da disciplina");
                String categoria = JOptionPane.showInputDialog("Digite a categoria da disciplina");
                int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária"));


                //Instanciar uma disciplica com os valores informados
                Disciplina disciplina = new Disciplina(nome, categoria, cargaHoraria);

                //Adicionar uma disciplina na lista
                disciplinas.add(disciplina);
            } else if (opcao == 2) {

                //Exibir todas as disciplinas da lista
                for (int i = 0; i < disciplinas.size(); i++){
                    System.out.println(disciplinas.get(i));
                } //for
            }// else

        }//while
        JOptionPane.showMessageDialog(null, "Finalizando o sistema");
    }
}
