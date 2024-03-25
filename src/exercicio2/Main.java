// Exercicio 2 da Lista
// Caíque Cardoso e Pedro Menezes

package exercicio2;
public class Main{
public static void main(String[] args) {

    Lampada lampada = new Lampada();
    
    System.out.println("A Lampada está: " + lampada.checaEstado()); 
    System.out.println("Quantidade Atual: " + lampada.qtdAcendimentos()); 
    lampada.click();
    System.out.println("A Lampada está: " + lampada.checaEstado()); 
    System.out.println("Quantidade Atual: " + lampada.qtdAcendimentos()); 
    lampada.click();
    lampada.click();
    lampada.click();
    lampada.click();
    System.out.println("A Lampada está: " + lampada.checaEstado()); 
    System.out.println("Quantidade Atual: " + lampada.qtdAcendimentos()); 
    lampada.click();
    lampada.click();
    lampada.click();
    System.out.println("A Lampada está: " + lampada.checaEstado()); 
    System.out.println("Quantidade Atual: " + lampada.qtdAcendimentos()); 
}
}