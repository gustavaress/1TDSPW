package br.com.fiap.veiculos.teste;
import br.com.fiap.veiculos.model.Aviao;
import br.com.fiap.veiculos.model.Cor;

public class AviaoTeste {

    public static void main(String[] args) {
        //Instanciar avião
        Aviao aviao = new Aviao();

        //Colocar informações no avião;
        aviao.setModelo("14 BIS");
        aviao.setQuantidadeLugares(200);
        aviao.setPrefixo("420-BIS");
        aviao.setComprimento(9.6);
        aviao.setAnoFabricacao(1906);
        aviao.setQuantidadeTurbinas(0);

        Cor corAviao = new Cor();
        corAviao.alterarCor(255, 255, 255, "Branco");

        aviao.setCor(corAviao);

        //Exivir as informações do avião
        System.out.println(aviao.getModelo());
        System.out.println(aviao.getQuantidadeLugares());
        System.out.println(aviao.getComprimento());
        System.out.println(aviao.getPrefixo());
        System.out.println(aviao.getQuantidadeTurbinas());
        System.out.println(aviao.getCor().getNome());


        //
    }
}
