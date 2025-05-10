package br.com.fiap.teste.model;

import javax.swing.*;

public class Teste {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número")); //converte a String em um double

        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número"));;

        var operador = JOptionPane.showInputDialog("Digite um operador");

        // Calcular resultado
        double resultado = 0;

        // Calcular
        switch (operador){
            case "+" :
                resultado = n1 + n2;
                break;
            case "-" :
                resultado = n1 - n2;
                break;
            case "*" :
                resultado = n1 * n2;
                break;
            case "/" :
                resultado = n1 / n2;
                break;
            default:
                System.out.println("Operador Inválido.");

        }

        System.out.println(resultado);
    }
}
