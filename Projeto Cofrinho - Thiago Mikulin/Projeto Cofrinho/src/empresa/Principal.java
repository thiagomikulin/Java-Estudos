package empresa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

            Scanner teclado = new Scanner(System.in);


                while (true){
                System.out.println("-----------------------------------------");
                System.out.println("|               COFRINHO                |");
                System.out.println("| 1-Adicionar Moeda                     |");
                System.out.println("| 2-Remover Moeda                       |");
                System.out.println("| 3-Listar Moedas                       |");
                System.out.println("| 4-Calcular total convertido para Real |");
                System.out.println("| 0-Encerrar                            |");
                System.out.println("-----------------------------------------");
                int resposta = teclado.nextInt();   //Receptor da resposta
                if (resposta < 0 || resposta > 4) {
                	System.out.println("Valor inválido! Tente novamente! ");
                }
                else {
                switch (resposta){
                    case 1:		//Adicionar moeda
                    	System.out.println("-----------------------------------------");
                        System.out.println(" Qual moeda deseja acrescentar?");
                        System.out.println(" 1 - Real");
                        System.out.println(" 2 - Dolar");
                        System.out.println(" 3 - Euro");
                        int r2 = teclado.nextInt();		//Receptor da resposta
                        if (r2 > 3 || r2 < 1) {			//Se resposta não estiver entre 1 e 3
                        	System.out.println("Valor inválido! O valor será desconsiderado!");
                        }
                    	
                        System.out.println("-----------------------------------------");	//Valor da moeda
                        System.out.println("Digite o valor: ");
                        double valor = teclado.nextDouble();	//Receptor da resposta
                        
                        switch (r2){
                            case 1:
                            	Cofrinho.adicionar(new Real(valor));	//Adiciona real
                            	System.out.println("Moeda adicionada com sucesso!");
                            break;
                            
                            case 2:
                            	Cofrinho.adicionar(new Dolar(valor));	//Adiciona dolar
                            	System.out.println("Moeda adicionada com sucesso!");
                            break;

                            case 3:
                            	Cofrinho.adicionar(new Euro(valor));	//Adiciona euro
                            	System.out.println("Moeda adicionada com sucesso!");
                            break;
                        }
                        break;
                
                        
                        

                    case 2:		//Remover moeda
                    	System.out.println("-----------------------------------------");
                    	Cofrinho.listagemMoedas();		//Retoma lista de moedas
                    	System.out.println("Da lista acima, qual moeda deseja remover?");
                    	int fora = teclado.nextInt();		//Recebe Índice do item na lista
                    	Cofrinho.remover(fora);
                    	System.out.println("Moeda removida com sucesso");
                    	break;
                    	
                    case 3:		//Listar moedas
                    	System.out.println("-----------------------------------------");
                    	Cofrinho.listagemMoedas();
                    	break;

                    case 4:		//Conversor de toda a lista e soma em Reais
                    	System.out.println("-----------------------------------------");
                        Cofrinho.totalConvertido();
                        break;
                }

                if (resposta == 0){		//Encerrar o programa
                    break;
                }}
                
            }
            System.out.println("Encerrando...");
            teclado.close();
                }
    }