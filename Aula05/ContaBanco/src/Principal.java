public class Principal {
    
    public static void main(String args[]) {
        Conta c = new Conta();
        Conta c2 = new Conta();
        c.abrirConta("CP", "Jamerson Aguiar", 123);
        System.out.println(c);
        c2.abrirConta("CC", "Bia", 234);
        System.out.println(c2);
    }
}
