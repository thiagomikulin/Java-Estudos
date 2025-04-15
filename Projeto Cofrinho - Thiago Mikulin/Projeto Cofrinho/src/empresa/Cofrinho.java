package empresa;

import java.util.ArrayList;


public class Cofrinho {

    private static ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();		//lista de moedas

    public static void adicionar(Moeda coin){		//Adicionar moedas
        if (coin.valor < 0){
            throw new RuntimeException( "Valor inválido");
        }
        listaMoedas.add(coin);		
        
    }

	public static void remover(int posição){		//Remover moedas
		Moeda tira = listaMoedas.get(posição);
        listaMoedas.remove(tira);
    }
    
    public static void listagemMoedas(){		//Mostrar a lista de moedas
    	int i = 0;
        for (Moeda coin : listaMoedas) {
        	System.out.println(i + "-" + coin.toString());
        	i += 1;
        }
    }

    public static void totalConvertido(){		//Total de moedas convertido para Real
    	double total = 0;
    	for (Moeda coin : listaMoedas) {
    		total += coin.converter();
    	}
    	System.out.printf("O valor de todas as moedas convertido para reais resulta em: R$ %.2f", total);
    	System.out.println();
    }
    
}