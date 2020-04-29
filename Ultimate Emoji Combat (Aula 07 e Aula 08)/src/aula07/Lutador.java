package aula07;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empate;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empate = empate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso < 52.2) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public void apresentar() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Apresentamos o Lutador " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpate());
    }

    public void status() {
        System.out.println(getNome());
        System.out.println("é um peso " + getCategoria());
        System.out.println(getVitorias() + " vitórias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpate() + " empates");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpate(getEmpate() + 1);
    }

}
