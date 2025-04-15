package empresa;

public class Dolar extends Moeda{

	@Override
	public String toString() {		//Converte objetos em String
		return "Dolar =" + valor;
	}

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Valor: " + valor);
	}

	public double converter() {
		double novo = this.valor * 6.09;
		return novo;
	}

}
