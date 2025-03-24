import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de um produto: ");
        float valor = leitor.nextFloat();

        System.out.println("Qual a quantidade comprada? ");
        int qnt = leitor.nextInt();

        double valorFinal = qnt * valor;

        System.out.println("O valor total da compra foi de R$" + valorFinal);


    }
}