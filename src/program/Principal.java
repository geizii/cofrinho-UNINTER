package program;

import java.util.Scanner;


public class Principal {
	public Principal() {}
	
	public static void main(String[] args) {
		
		int opcao;
		
		Scanner sc = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		int tipoMoeda;
		double valor, valorRemover;
		Moeda moeda;
		
        
            System.out.println("\nMENU COFRINHO:");
            System.out.println("1- Adicionar Moeda");
            System.out.println("2- Remover Moeda");
            System.out.println("3- Listar Moedas");
            System.out.println("4- Calcular total convertido para real");
            System.out.println("0- Encerrar");
            
            opcao = sc.nextInt();
            
         while(opcao !=0) {
            switch(opcao) {
                case 1:
                    tipoMoeda = 0;
                    while(tipoMoeda > 3 || tipoMoeda <= 0) {
                        System.out.println("Escolha o tipo de moeda:");
                        System.out.println("1 - Dólar");
                        System.out.println("2 - Euro");
                        System.out.println("3 - Real");
                        tipoMoeda = sc.nextInt();
                    }
                    
                    System.out.println("Qual o valor?");
                    valor = sc.nextDouble();
                    moeda = null;
                    
                    switch(tipoMoeda) {
                    case 1:
                    	moeda = new Dolar(valor);
                    	break;
                    case 2: 
                    	moeda = new Euro(valor);
                    	break;
                    case 3: 
                    	moeda = new Real(valor);
                    }
                    
                    cofrinho.adicionar(moeda);
                    System.out.println("Moeda adicionada ao cofrinho com sucesso !");
                    break;
                case 2:
                	tipoMoeda = 0;
                    while(tipoMoeda > 3 || tipoMoeda <= 0) {
                        System.out.println("Escolha o tipo de moeda:");
                        System.out.println("1 - Dólar");
                        System.out.println("2 - Euro");
                        System.out.println("3 - Real");
                        tipoMoeda = sc.nextInt();
                    }
                    
                    System.out.println("Digite o valor a ser removido");
                    valorRemover = sc.nextDouble();
                    
                    
                    
                    moeda = null;
                    if (tipoMoeda == 1) {
                    	moeda = new Dolar(valorRemover);
                    } else if (tipoMoeda == 2) {
                    	moeda = new Euro(valorRemover);
                    } else if (tipoMoeda == 3) {
                    	moeda = new Real(valorRemover);
                    }
                    
                    cofrinho.remover(moeda);
                    System.out.println("Moeda removida do cofrinho com sucesso!");
                    break;
                case 3: 
                	System.out.println("Moedas listadas: ");
                	cofrinho.listarMoedas();
                    break;
                case 4:
                    double totalConvertido = cofrinho.calcularTotalConvertido();
                    System.out.println("Total convertido para real: " + String.format("%.2f", totalConvertido));
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
            System.out.println("\nMENU COFRINHO:");
            System.out.println("1- Adicionar Moeda");
            System.out.println("2- Remover Moeda");
            System.out.println("3- Listar Moedas");
            System.out.println("4- Calcular total convertido para real");
            System.out.println("0- Encerrar");
            opcao = sc.nextInt();        } 
       
    }
	
}
