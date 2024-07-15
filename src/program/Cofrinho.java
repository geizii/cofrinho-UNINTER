package program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cofrinho {
	ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>(); //inicia uma lista vazia
	
	public Cofrinho() {
		
	}
	
	public void adicionar(Moeda moeda) {
		this.listaMoeda.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		this.listaMoeda.remove(moeda);
	}
	
	public List<Moeda> getMoedas() {
		return 	listaMoeda;
	}
	
	public void listarMoedas() {
		if (listaMoeda.isEmpty()) {
	        System.out.println("Cofrinho vazio. Nenhuma moeda encontrada.");
	    } else {
	        System.out.println("Listando moedas do cofrinho:");
	        String resultado = "";
	        for (Moeda moeda : listaMoeda) {
	            resultado += moeda.info() + "\n";
	        }
	        System.out.printf(resultado);
	    }
	}
	
	public double calcularTotalConvertido() {
		double totalConvertido = 0.0;
		for(Moeda moeda : listaMoeda) {
			totalConvertido += moeda.converterParaReal();
		}
		return totalConvertido;
	}
}