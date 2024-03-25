package exercicio4;


public class Cliente {

    private String nome;
    private double saldo, limite;

    public Cliente(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public double checarSaldo() {
        return saldo + limite;
    }

    public void sacar(double valor) {
        if (checarSaldo() >= valor) {
            saldo = saldo - valor;
            System.out.println("Valor do saque realizado: R$ " + valor);
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Valor do depósito realizado: R$ " + valor);
    }

    public String obterNome() {
        return nome;
    }
}
