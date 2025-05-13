package br.com.fiap.teste2;

public class teste {
    public static void main(String[] args) {
        String email = "neymarsantos2025@gmail.com";
        String confirmacaoEmail = "neymarsantos2025@gmail.com";

        if (email.equalsIgnoreCase((confirmacaoEmail))){
            System.out.println("Email confirmado!");
        } else {
            System.out.println("Emails não são iguais.");
        }

        System.out.println(email);
        System.out.println(confirmacaoEmail);

        // Retornar posição do @ do email
        var arrobaPosicao = email.indexOf('@');
        System.out.println("O @ aparece em: " + arrobaPosicao);

        // Imprimir quantidade de caracteres
        System.out.println("Quantidade de caracteres: " + email.length());

        // Pegar o user do email
        var user = email.substring(0, arrobaPosicao);
        System.out.println("User: " + user);

        // Pegar o dominio do email
        var dominio = email.substring(arrobaPosicao + 1);
        System.out.println("Dominio: " + dominio);
    }
}
