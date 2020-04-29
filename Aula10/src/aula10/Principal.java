package aula10;

public class Principal {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Pedro", 18, "M");
        Aluno p2 = new Aluno(123, "Informática", "Maria", 18, "F");
        Professor p3 = new Professor("Física Quântica", 2500.75, "Cláudio", 31, "M");
        Funcionario p4 = new Funcionario("Estoque", true, "Fabiana", 42, "M");

        //System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

    }
}
