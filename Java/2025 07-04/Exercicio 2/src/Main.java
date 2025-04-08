import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Instanciar classes
        Cliente cliente = new Cliente();
        ContaCorrente cc = new ContaCorrente();
        Endereco endereco = new Endereco();

        //Scanner
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá. Vamos criar sua conta?");

        System.out.println("Digite seu nome: ");
        cliente.nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite seu CPF: ");
        cliente.cpf = leitor.next() + leitor.nextLine();

        System.out.println("Digite a sua rua");
        endereco.logradouro = leitor.next() + leitor.nextLine();

        System.out.println("Digite o numero da casa");
        endereco.numero = leitor.nextShort();

        System.out.println("Digite o complemento");
        endereco.complemento = leitor.next() + leitor.nextLine();

        System.out.println("Digite seu CEP");
        endereco.cep = leitor.next() + leitor.nextLine();

        cc.titular = cliente;

        System.out.println("Digite o valor que você deseja depositar: ");
        cc.depositar(leitor.nextDouble());

        System.out.println("Digite o valor que você deseja sacar: ");
        cc.sacar(leitor.nextDouble());

        System.out.println("Seu saldo atual é de: " + cc.retornarSaldo());

    }

}