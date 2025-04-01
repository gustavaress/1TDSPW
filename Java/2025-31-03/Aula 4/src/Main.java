import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Cria um objeto de um aluno e atribui os valores de turma, nome e rm
        Aluno aluno1 = new Aluno();

        System.out.println("Digite a turma do aluno: ");
        aluno1.turma = leitor.next() + leitor.nextLine();

        System.out.println("Digite o nome do aluno: ");
        aluno1.nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite o RM do aluno: ");
        aluno1.rm = leitor.next() + leitor.nextLine();

        // Atribuir os valores ao objeto notas
        System.out.println("Digite a nota do CheckPoint: ");
        double notaCpNota = leitor.nextDouble();

        System.out.println("Digite a nota do Challange: ");
        double notaChNota = leitor.nextDouble();

        System.out.println("Digite a nota do GlobalSolution: ");
        double notaGsNota = leitor.nextDouble();

        // Exibir infos
        System.out.println("Buscando informações do aluno: " + aluno1.nome);
        System.out.println("Turma: " + aluno1.turma);
        System.out.println("RM: " + aluno1.rm);

        // Exibir notas
        System.out.println("Notas:");
        System.out.println("Checkpoint: " + notaCpNota);
        System.out.println("Challange: " + notaChNota);
        System.out.println("Global Solution: " + notaGsNota);

        double notaFinal = aluno1.calcularMedia();
        System.out.println("A nota final do aluno " + aluno1.nome + " é " + notaFinal);

    }
}