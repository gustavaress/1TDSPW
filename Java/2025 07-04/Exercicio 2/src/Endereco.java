public class Endereco {
    String logradouro;
    short numero;
    String complemento;
    String cep;

    String retornarEndereco(){
        return "Endereço: " + logradouro + ", " + numero + ", " +complemento + " - CEP: " + cep;
    }

}
