public class Aluno {
    String nome;
    double notaCp1;
    double notaCp2;
    double notaCp3;
    double notaCp;
    double notaCh;
    double notaGs;

    // Metodo calcular nota CP
    double calcularCp(){
        double mediaCp;
        mediaCp = (notaCp1 + notaCp2 + notaCp3)/3;
        return mediaCp;
    }

    // Metodo calcular média final
    double calcularMedia(){
        double mediaFinal;
        mediaFinal = notaCp * 0.2 + notaCh * 0.2 + notaGs * 0.6;
        return mediaFinal;
    }

    public void exibirInfos(){
        System.out.println("A nota do aluno " + nome + " serão:");
        System.out.println("Checkpoint: " + notaCp);
        System.out.println("Challanger " + notaCh);
        System.out.println("Global Solution: " + notaGs);

        double notaFinal = calcularMedia();
        System.out.println("Média final: " + notaFinal);
    }
}
