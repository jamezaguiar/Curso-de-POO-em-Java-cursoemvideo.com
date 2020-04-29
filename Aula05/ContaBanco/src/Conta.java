public class Conta {
    
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    // Construtor
    public Conta() {
        this.saldo = 0;
        this.status = false;
    }
    
    // Métodos
    public boolean abrirConta(String tipo, String dono, int numConta) {
        boolean r;
        setNumConta(numConta);
        setTipo(tipo);
        setDono(dono);
        setStatus(true);
        switch (tipo) {
            case "CC":
                setSaldo(50f);
                r = true;
                break;
            case "CP":
                setSaldo(150f);
                r = true;
                break;
            default:
                r = false;
                break;
        }
    return r;
    }
    
    public boolean fecharConta() {
        boolean r;
        if (this.saldo > 0) {
            r = false;
            System.out.println("Ainda há saldo na sua conta!");
        } else if (this.saldo < 0){
            System.out.println("Seu saldo está negativo! Quite seu débito com o banco para poder fechar a conta.");
            r = false;
        } else {
            setStatus(false);
            r = true;
        }
    return r;
    }
    
    public boolean depositar(double valor) {
        boolean r;
        if (isStatus()) {
            setSaldo(getSaldo() + valor);
            r = true;
        } else {
            r = false;
        }
    return r;
    }
    
    public boolean sacar(double valor) {
        boolean r;
        if (isStatus() && getSaldo() > 0) {
            setSaldo(getSaldo() - valor);
            r = true;
        } else {
            r = false;
        }
    return r;
    }
    
    public boolean pagarMesalidade() {
        boolean r;
        double v = 0.0f;
        
        if (getTipo().equals("CC")){
            v = 12f;
        } else if (getTipo().equals("CP")) {
            v = 20f;
        }
        
        if (isStatus() && getSaldo() > v) {
            setSaldo(getSaldo() - v);
            r = true;
        } else {
            r = false;
        }
    return r;
    }

    // Getters e Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // toString
    public String toString() {
        String res = "";
        res += "Número da conta: " + getNumConta() + "\n";
        res += "Tipo: " + getTipo() + "\n";
        res += "Dono: " + getDono() + "\n";
        res += "Saldo: " + getSaldo() + "\n";
        res += (isStatus())? "Status: Conta Aberta" : "Status: Conta Fechada" + "\n";
        
    return res;
    }
    
    
}
