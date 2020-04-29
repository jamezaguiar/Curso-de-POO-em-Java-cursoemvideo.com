public class Principal {

	public static void main(String args[]) {
		Caneta c1 = new Caneta();
		c1.modelo = "BIC";
		c1.cor = "Azul";
		c1.ponta = 0.7f;
		c1.carga = 100;
		c1.tampada = true;

		c1.status();
		c1.rabiscar();

		System.out.print("\n");

		Caneta c2 = new Caneta();
		c2.modelo = "Faber Castell";
		c2.cor = "Preta";
		c2.ponta = 0.5f;
		c2.carga = 90;
		c2.tampada = false;

		c2.status();
		c2.rabiscar();

	}
}