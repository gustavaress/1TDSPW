import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Objeto leitor de dados digitados
        Scanner leitor = new Scanner(System.in);

        //Criar um objeto tenis com os valores digitador pelo usuário
        Tenis tenis1 = new Tenis();

        System.out.println("Digite o modelo do tênis: ");
        tenis1.modelo = leitor.next() + leitor.nextLine();
        System.out.println("Digite a cor do tênis: ");
        tenis1.cor = leitor.next() + leitor.nextLine();
        System.out.println("Digite o tamanho do tênis: ");
        tenis1.tamanho = leitor.nextInt();
        System.out.println("Digite o valor do tênis: ");
        tenis1.preco = leitor.nextDouble();
        System.out.println("Digite se o tênis esta disponível (True/False): ");
        tenis1.disponivel = leitor.nextBoolean();

        System.out.println("Digite a marca do tenis: ");
        tenis1.marca.nome = leitor.next() + leitor.nextLine();
        tenis1.marca.logo = leitor.next() + leitor.nextLine();

        System.out.println("O tênis que você criou é um: ");
        System.out.println(tenis1.modelo);
        System.out.println(tenis1.cor);
        System.out.println(tenis1.tamanho);
        System.out.println(tenis1.preco);
        System.out.println(tenis1.disponivel);

        // Exibir os dados da marca
        System.out.println("Marca: " + tenis1.marca.nome);
        System.out.println("Marca: " + tenis1.marca.logo);

        // Chamar o metodo para aumentar o valor do tenis em 15
        tenis1.aumentarPreco(5);

        // Exibir valor totalizado
        System.out.println("Valor atualizado: " +tenis1.preco);
    }
}
