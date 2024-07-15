package program;

public class Euro extends Moeda {
	
	public Euro (double valor) {
		super(valor, "Euro");	
	}
	
	
	@Override 
	public String info() {
		return "Temos " + getValor() + " de euros";
	}
	
	@Override
	public double converterParaReal() {
		return getValor() * 5.96f; // Valor atual da moeda em 04/07/2024
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
