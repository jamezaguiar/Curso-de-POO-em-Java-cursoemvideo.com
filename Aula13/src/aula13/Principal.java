package aula13;

public class Principal {

    public static void main(String[] args) {
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        c.emitirSom();
        c.reagir("Olá");
        c.reagir(true);
        c.reagir(21, 45);
        c.reagir(3, 25);
    }
}
