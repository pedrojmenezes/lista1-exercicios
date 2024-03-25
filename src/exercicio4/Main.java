// Exercicio 4 da Lista
// Caíque Cardoso e Pedro Menezes

package exercicio4;

public class Main {
    
    public static void main(String[] args) {
        Cliente cli = new Cliente("Luis", 3000, 1000);
        System.out.println("Saldo atual: R$ " + cli.checarSaldo());
        cli.depositar(500);
        System.out.println("Saldo atual: R$ " + cli.checarSaldo());
        cli.sacar(300);
        System.out.println("Saldo atual: R$ " + cli.checarSaldo());
    }
}
