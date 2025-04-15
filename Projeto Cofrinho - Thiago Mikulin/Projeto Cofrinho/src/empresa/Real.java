package empresa;

public class Real extends Moeda{
	
	@Override
	public String toString() {
		return "Real =" + valor;
	}

	public Real(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Valor: " + valor);
		
	}

	public double converter() {
		return this.valor;
		
	}

}
