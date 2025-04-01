public class Tenis {
        String modelo;
        String cor;
        int tamanho;
        double preco;
        boolean disponivel;

        // Atributo de referencia
        Marca marca;

        // Metodos
        // Metodo para aumentar o preço do tenis em porcentagem (10, 20)
        void aumentarPreco(float porcentagem){
                preco += preco + porcentagem/100;
        }

        double aplicarDesconto(float porcentagem){
                double valorComDesconto;
                valorComDesconto = preco - (preco * porcentagem)/100;
                return valorComDesconto;
        }
}