public class Aluno {
    String nome;
    double notaCp1;
    double notaCp2;
    double notaCp3;
    double notaCp;
    double notaCh;
    double notaGs;


    // Calcular média CP
    double calcularCp(){
        double mediaCp;
        mediaCp = (notaCp1 + notaCp2 + notaCp3)/3;
        return mediaCp;
    }

    // Calcular media final
    double calcularMedia(){
        double mediaFinal;
        mediaFinal = notaCp*0.20 + notaCh*0.20 + notaGs*0.60;
        return mediaFinal;


    }

    // Exibir infos
    public void exibirNotas() {
        System.out.println("Nome: " + nome);
        System.out.println("Notas:");
        System.out.println("Checkpoint: " + notaCp);
        System.out.println("Challange: " + notaCh);
        System.out.println("Global Solution: " + notaGs);

        double notaFinal = calcularMedia();
        System.out.println("Nota final: " + notaFinal);
    }
}
