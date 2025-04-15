package empresa;

public abstract class Moeda {
	double valor;
	
	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	
	public abstract void info();
	public abstract double converter();
}
