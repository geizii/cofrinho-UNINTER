package program;

import java.util.Objects;

public abstract class Moeda {
	protected double valor; //valor da moeda
	protected String info; //Informações da moeda


	public Moeda(double valor,  String info) {
		super();
		this.valor = valor;
		this.info = info;
	}
	

	public double getValor() {
		return valor;
	}


	public String getInfo() {
		return info;
	}


	public abstract double converterParaReal();
	
	
	public abstract String info();


	@Override
	public int hashCode() {
		return Objects.hash(info, valor);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Objects.equals(info, other.info)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	
	
}

