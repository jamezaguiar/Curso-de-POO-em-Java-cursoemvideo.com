package aula06;

public class ControleRemoto implements Controlador {

    public int volume;
    public boolean ligado;
    public boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public void ligar() {
        this.setLigado(true);
    }

    public void desligar() {
        this.setLigado(false);
    }

    public void abrirMenu() {
        System.out.println("Está ligado?: " + this.isLigado());
        System.out.println("Está reproduzindo algo?: " + this.isTocando());
        System.out.print("Volume: " + this.getVolume() + " ");
        for (int i = 0; i <= getVolume(); i += 5) {
            System.out.print("|");
        }
        System.out.print("\n");
    }

    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() + 5);
        }
    }

    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() - 5);
        }
    }

    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    public void play() {
        this.setTocando(true);
    }

    public void pause() {
        this.setTocando(false);
    }

}
