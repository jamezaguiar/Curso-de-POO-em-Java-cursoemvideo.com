package aula08;

import aula07.Lutador;
import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    private Random gerador = new Random();

    public Luta() {
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && !desafiado.equals(desafiante)) {
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
            System.out.println("Luta marcada entre " + desafiado.getNome() + " e " + desafiante.getNome() + "!");
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Esta luta não pode acontecer!");
        }
    }

    public void lutar() {
        if (this.aprovada) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            int vencedor = gerador.nextInt(3);
            System.out.println("\nCHEGOU A HORA!");
            switch (vencedor) {
                case 0:
                    System.out.println("EMPATARAM!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("O lutador " + this.desafiado.getNome() + " venceu!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("O lutador " + this.desafiante.getNome() + " venceu!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("");
        }
    }
}
