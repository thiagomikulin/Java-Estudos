package empresa;

public class Euro extends Moeda{

	@Override
	public String toString() {
		return "Euro =" + valor;
	}

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Valor: " + valor);
		
	}

	public double converter() {
		double novo = this.valor * 6.44;
		return novo;
	}

}
