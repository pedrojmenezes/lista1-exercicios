package exericio2;

public class Lampada {

    private Estado estado; 
    private int qtdAcendimentos; 

    public Lampada() {
        this.estado = Estado.APAGADA;
        this.qtdAcendimentos = 0;    
     }

    public void click() {
        if (this.estado == Estado.APAGADA) {
            this.estado = Estado.ACESA;
            this.qtdAcendimentos++; 
                    } else {
            this.estado = Estado.APAGADA;
        }        
    }
        public Estado checaEstado() {
            return this.estado;
        }
    public int qtdAcendimentos() {
        return this.qtdAcendimentos;
    }

  
}