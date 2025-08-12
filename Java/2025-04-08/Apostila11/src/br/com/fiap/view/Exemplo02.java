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

        while (opcao != 0){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n 1 - Cadastrar \n 2 - Exibir lista \n 3 - Remover disciplina \n 4 - Exibir total \n 0 - Sair"));;
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
            } else if (opcao == 3){
                //Pede o indice para o usario
               int  posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite qual disciplina você deseja renover: "));

               //Validar se o indice é valido
                if (posicao < 0 || posicao >= disciplinas.size()){
                    JOptionPane.showMessageDialog(null, "Posição invalida");
                }

                //Remove a disciplina pelo indice
                disciplinas.remove(posicao);

                //Mensagem de sucesso
                JOptionPane.showMessageDialog(null, "Diisciplina removida");
            } else if (opcao == 4) {
                //Exibit a quantidade de itens
                JOptionPane.showMessageDialog(null, "Quantidade: " + disciplinas.size());
            } // else
        }//while
        JOptionPane.showMessageDialog(null, "Finalizando o sistema");
    }//main
}//class
