package aula07;

import aula08.Luta;

public class Principal {

    public static void main(String[] args) {
        Luta uec = new Luta();
        Lutador[] ls = new Lutador[6];
        ls[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        ls[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        ls[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        ls[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        ls[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        ls[5] = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4);
        
        uec.marcarLuta(ls[0], ls[1]);
        uec.lutar();
    }
}
