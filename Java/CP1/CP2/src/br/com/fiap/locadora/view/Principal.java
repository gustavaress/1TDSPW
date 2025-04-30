package br.com.fiap.locadora.view;

import br.com.fiap.locadora.model.Veiculo;
import br.com.fiap.locadora.model.Cliente;
import br.com.fiap.locadora.model.Locacao;
import br.com.fiap.locadora.model.Endereco;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Instanciando classes
        Veiculo veiculo = new Veiculo();
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        Locacao locacao = new Locacao();

        // Scanner
        Scanner leitor = new Scanner(System.in);

        // Cadastro de veiculos
        System.out.println("Cadastrando Veículo...");
        System.out.println("Qual veiculo voce deseja adquirir: ");
        veiculo.setModelo(leitor.next() + leitor.nextLine());

        System.out.println("Qual a cor que voce deseja: ");
        veiculo.setCor(leitor.next() + leitor.nextLine());

        System.out.println("Em que ano ele foi fabricado: ");
        veiculo.setAnoFabricacao(leitor.nextInt());

        System.out.println("Qual o valor da diaria: ");
        veiculo.setDiaria(leitor.nextDouble());
        leitor.nextLine();

        // === Cadastro do Cliente ===
        System.out.println("Cadastrando Cliente...");
        System.out.println("Nome: ");
        cliente.setNome(leitor.next() + leitor.nextLine());

        System.out.println("Telefone: ");
        cliente.setTelefone(leitor.next() + leitor.nextLine());

        System.out.println("CNH: ");
        cliente.setCnh(leitor.nextLine());

        System.out.println("CPF (somente números): ");
        cliente.setCpf(leitor.nextDouble());
        leitor.nextLine();

        // === Cadastro do Endereço ===
        System.out.println("Endereço do Cliente...");
        System.out.println("Rua: ");
        endereco.setRua(leitor.next() + leitor.nextLine());
        System.out.println("Número: ");
        endereco.setNumero(leitor.nextInt());
        System.out.println("Complemento: ");
        endereco.setComplemento(leitor.next() + leitor.nextLine());
        System.out.println("CEP: ");
        endereco.setCep(leitor.next() + leitor.nextLine());
        cliente.setEndereco(endereco);

        // Locação
        System.out.println("Cadastro de locação...");
        System.out.println("Quantos dias de locação? ");
        locacao.setDiasAlugados(leitor.nextInt());
        locacao.setCliente(cliente);
        locacao.setVeiculo(veiculo);
        veiculo.setDisponivel(false);

        double total = locacao.valorLocacao();

        // Resumo
        System.out.println("RESUMO DA LOCAÇÃO");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Veículo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAnoFabricacao());
        System.out.println("Diária: R$ " + veiculo.getDiaria());
        System.out.println("Dias alugados: " + locacao.getDiasAlugados());
        System.out.println("Valor total: R$ " + total);
    }

}
