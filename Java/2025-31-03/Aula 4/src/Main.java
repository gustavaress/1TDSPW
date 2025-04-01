import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Cria um objeto de um aluno e atribui os valores de turma, nome e rm
        Aluno aluno1 = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno1.nome = leitor.next() + leitor.nextLine();

        // Atribuir os valores ao objeto notas
        System.out.println("Digite a nota do 1 CheckPoint: ");
        aluno1.notaCp1 = leitor.nextDouble();

        System.out.println("Digite a nota do 2 CheckPoint: ");
        aluno1.notaCp2 = leitor.nextDouble();

        System.out.println("Digite a nota do 3 CheckPoint: ");
        aluno1.notaCp3 = leitor.nextDouble();

        System.out.println("Digite a nota do Challange: ");
        aluno1.notaCh = leitor.nextDouble();

        System.out.println("Digite a nota do GlobalSolution: ");
        aluno1.notaGs = leitor.nextDouble();

        // Executando metodo que calcula nota media do CP
        aluno1.notaCp = aluno1.calcularCp();

        // Exibir infos
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Notas:");
        System.out.println("Checkpoint: " + aluno1.notaCp);
        System.out.println("Challange: " + aluno1.notaCh);
        System.out.println("Global Solution: " + aluno1.notaGs);

        aluno1.calcularMedia();
        aluno1.exibirNotas();
    }
}