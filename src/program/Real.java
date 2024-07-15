package program;

public class Real extends Moeda {
	public Real(double valor) {
		super(valor, "Real");
	}
	
	@Override 
	public String info() {
		return "Temos " + getValor() + " de reais";
	}
	
	@Override
	public double converterParaReal() {
		return getValor();
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