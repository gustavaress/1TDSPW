public class Aluno {
    String turma;
    String nome;
    String rm;

    Notas notas;

    // Construtor que inicializa "notas"
    public Aluno() {
        this.notas = new Notas(); // Garante que "notas" nunca seja null
    }

    // Método calcular média
    double calcularMedia(){
        double mediaFinal;
        mediaFinal = notas.notaCp*0.20 + notas.notaCh*0.20 + notas.notaGs*0.60;
        return mediaFinal;
    }
}
