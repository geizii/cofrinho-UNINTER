package program;

public class Dolar extends Moeda {
	public Dolar(double valor) {
		super(valor, "Dolar");
	}
	
	@Override 
	public String info() {
		return "Temos " + getValor() + " de doláres";
	}
	
	@Override
	public double converterParaReal() {
		return getValor() * 5.50f; //Valor atual da moeda em 04/07/2024
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	
	
	
	
}
