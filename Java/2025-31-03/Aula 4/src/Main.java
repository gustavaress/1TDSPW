import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Aluno aluno1 = new Aluno();

        System.out.println("Olá! Seja bem vindo ao calculador de média FIAP");
        System.out.println(" ");

        // Perguntar os dados do aluno
        System.out.println("Digite o nome do aluno: ");
        aluno1.nome = leitor.next() + leitor.nextLine();

        // Perguntar as notas do aluno;
        System.out.println("Digite a nota do primeiro Checkpoint do aluno: ");
        aluno1.notaCp1 = leitor.nextDouble();

        System.out.println("Digite a nota do segundo Checkpoint do aluno: ");
        aluno1.notaCp2 = leitor.nextDouble();

        System.out.println("Digite a nota do terceiro Checkpoint do aluno: ");
        aluno1.notaCp3 = leitor.nextDouble();

        System.out.println("Digite a nota de Challange do aluno: ");
        aluno1.notaCh = leitor.nextDouble();

        System.out.println("Digite a nota da Global Solution do aluno: ");
        aluno1.notaGs = leitor.nextDouble();

        aluno1.notaCp = aluno1.calcularCp();

        aluno1.exibirInfos();
    }
}