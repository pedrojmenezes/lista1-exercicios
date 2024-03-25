package exercicio1;

public class Churras{

    public double qtdCarne, total;

    public Churras(double qtdCarne){
        this.qtdCarne = qtdCarne;
        this.total = 0;
    }

    public void verificarConsumo(Pessoa pessoa) {
        if (pessoa.idade >= 0 && pessoa.idade <= 3) {
            qtdCarne = 0;
        } else if (pessoa.vegetariana) {
            qtdCarne = 0;
 
        } 
    
            else if (pessoa.idade >= 4 && pessoa.idade <= 12) {
            qtdCarne = 1;
        total += 1;
    } 
    
            else { qtdCarne = 2;
            total += 2;}
    
        System.out.println(pessoa.nome + " irá comer " + qtdCarne + " kgs de carne no SUPER CHURRAS!!!.");
    
    }
    public void verificarTotal() {
        System.out.println(total + " kgs de carne serão consumidos no total.");
    }

}