import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = leitor.nextLine();

        System.out.println("Digite a sua media dos CheckPoints 1: ");
        float cp1 = leitor.nextFloat();

        System.out.println("Digite a sua media dos CheckPoints 2: ");
        float cp2 = leitor.nextFloat();

        System.out.println("Digite a sua media dos CheckPoints 3: ");
        float cp3 = leitor.nextFloat();

        System.out.println("Digite a sua media dos Challangers: ");
        float challange = leitor.nextFloat();

        System.out.println("Digite a sua media dos Global Solution: ");
        float gs = leitor.nextFloat();

        float cpMedia = (cp1 + cp2 + cp3)/3;

        double mediaFinal = cpMedia * 0.2 + challange * 0.2 + gs * 0.6;

        System.out.println("Nome: " + nome);
        System.out.println("A sua média final é: " + mediaFinal);
    }
}