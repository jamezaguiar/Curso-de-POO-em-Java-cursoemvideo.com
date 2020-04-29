package aula10;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public Funcionario(String setor, boolean trabalhando, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;
    }

    @Override
    public String toString() {
        String info = "";
        info += super.toString() + "\nSetor: " + this.setor + "\nTrabalhando: " + this.trabalhando + "\n";
        return info;
    }

}
