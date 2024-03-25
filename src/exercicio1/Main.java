//Exercicio 1 da Lista.
// Caíque Cardoso e Pedro Menezes

package exercicio1;
public class Main{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Caique", "Masculino", 29, false);
        Pessoa p2 = new Pessoa("Pedro", "Feminino", 20, true);
        Pessoa p3 = new Pessoa("Thabs", "Feminino", 10, false);
        Pessoa p4 = new Pessoa("Entenza", "Masculino", 22, false);
        Pessoa p5 = new Pessoa("Kai", "Feminino", 22, false);

        Churras churras = new Churras(0);
        churras.verificarConsumo(p1); 
        churras.verificarConsumo(p2);
        churras.verificarConsumo(p3);
        churras.verificarConsumo(p4);
        churras.verificarConsumo(p5);
        churras.verificarTotal();
    }
}