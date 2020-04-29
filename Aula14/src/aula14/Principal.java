package aula14;

public class Principal {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("juba", "Jubileu", 22, "M");
        g[1] = new Gafanhoto("creuzita", "Creuza", 12, "F");

        Visualizacao vis[] = new Visualizacao[5];

        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0]);
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1]);

        /*
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
        
        System.out.println(g[0]);
        System.out.println(g[1]);
         */
    }
}
