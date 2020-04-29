package aula11;

public class Bolsista extends Aluno {

    private double bolsa;
    
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista, pagamento facilitado!");
    }

    @Override
    public String toString() {
        return "Bolsista{" + '}';
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

}
