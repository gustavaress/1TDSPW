public class ContaCorrente {
    double saldo;
    Cliente titular;

    void depositar(double valor){
        saldo += valor;
    }

    void sacar(double valor){
        saldo -= valor;
    }

    void retornarSaldo(double valor){

    }
}
