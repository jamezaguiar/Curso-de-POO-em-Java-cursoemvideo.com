package aula11;

public class Principal {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        
    }
}
