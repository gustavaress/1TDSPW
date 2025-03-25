import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Objeto leitor de dados digitados
        Scanner leitor = new Scanner(System.in);

        //Criar um objeto tenis com os valores digitador pelo usuário
        Tenis converse = new Tenis();

        System.out.println("Digite o modelo do tênis: ");
        converse.modelo = leitor.next() + leitor.nextLine();
        System.out.println("Digite a cor do tênis: ");
        converse.cor = leitor.next() + leitor.nextLine();
        System.out.println("Digite o tamanho do tênis: ");
        converse.tamanho = leitor.nextInt();
        System.out.println("Digite o valor do tênis: ");
        converse.preco = leitor.nextDouble();
        System.out.println("Digite se o tênis esta disponível (True/False): ");
        converse.disponivel = leitor.nextBoolean();

        System.out.println("O tênis que você criou é um: ");
        System.out.println(converse.modelo);
        System.out.println(converse.cor);
        System.out.println(converse.tamanho);
        System.out.println(converse.preco);
        System.out.println(converse.disponivel);
    }
}
