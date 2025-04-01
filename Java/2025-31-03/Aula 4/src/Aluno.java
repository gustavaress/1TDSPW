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
}
