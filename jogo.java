import java.util.Scanner;
public class jogo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int escolha;
		
		do {
			System.out.println("--MENU--");
			System.out.println("1- Instruções");
			System.out.println("2- Jogar");
			System.out.println("3- Créditos");
			System.out.println("4- Sair");
			System.out.print("Digite a opção desejada:");
			escolha = ler.nextInt();
			ler.nextLine(); 

			switch (escolha) {
			case 1:
				//instruções
				System.out.println("INSTRUÇÕES:");
				System.out.println("Descubra o caminho certo em um labirinto cheio de mistérios com o uso da MATEMÁTICA.");
				System.out.println("Embarque nessa aventura em busca de um tesouro escondido por um samurai há milhares de anos atrás.");
				System.out.println("Se errar, perde. Boa sorte ;)");
				System.out.print("Pressione a tecla ENTER para retornar ao menu...");
				ler.nextLine();
		        break;
		        
			case 2:
				//jogo
				System.out.println("VAMOS JOGAR!");
				System.out.println("Iniciando o jogo...\n");
				int fase = 1; 
				boolean jogo = true;
				
				while (jogo) {
					switch (fase) {
					case 1:
						System.out.println("Você se depara com a entrada e nela possui um segredo.");
						System.out.println("Converta o número binário 1010 para HEXADECIMAL.");
						System.out.println("A) 5");
						System.out.println("B) A");
		                System.out.println("C) 10");
		                System.out.println("D) 15");
		                System.out.print("Digite sua escolha: ");
		                String resposta1 = ler.nextLine().toLowerCase();
		                
		                if (resposta1.equals("b")) {
		                	System.out.println("Parabéns! Você achou uma alavanca e avançou para a próxima fase.");
		                	fase++;
		                	} else {
		                		System.out.println("GAME OVER...");
		                		fase = 0;
		                		}
		                break;
		                
					case 2:
						System.out.println("Agora você está em uma encruzilhada e é necessário utilizar seus conhecimentos de conversão continuar.");
		                System.out.print("Qual é o valor decimal do número hexadecimal 2A?\n");
		                System.out.println("A) 32");
		                System.out.println("B) 42");
		                System.out.println("C) 20");
		                System.out.println("D) 17");
		                System.out.print("Digite sua escolha: ");
		                String resposta2 = ler.nextLine().toLowerCase();
		                
		                if (resposta2.equals("b")) {
		                	System.out.println("Bom avanço! Você acertou a charada e DESATIVOU AS ARMADILHAS!!!");
		                    fase++;
		                    } else {
		                    	System.out.println("GAME OVER...");
		                    	fase = 0;
		                    	}
		                break;
		                
					case 3:
						System.out.println("Com a armadilha de dardos desabilitada, descubra uma forma de desabilitar a próxima armadilha.");
		                System.out.print("Descubra como desabilitar a próxima armadilha ");
		                System.out.print("Pergunta 3:Converta o número binário 11010 para decimal.\n");
		                System.out.println("A) 15");
		                System.out.println("B) 18");
		                System.out.println("C) 26");
		                System.out.println("D) 31");
		                System.out.print("Digite sua escolha: ");
		                String resposta3 = ler.nextLine().toLowerCase();
		                
		                if (resposta3.equals("c")) {
		                	System.out.println("Ótimo trabalho! Você avançou com sucesso.");
		                    fase++;
		                    } else {
		                    	System.out.println("GAME OVER...");
		                    	fase = 0;
		                    	}
		                break;
		                
					case 4:
						System.out.println("Foi por pouco! O teto caiu e você sofreu alguns arranhões. Encontra uma mochila com ataduras.");
		                System.out.println("Ao terminar de enfaixar suas feridas, você se sente mais destemido do que nunca, mas confuso com o caminho a seguir.");
		                System.out.print("Descubra a próxima etapa");
		                System.out.print("Pergunta 4:Qual é o valor hexadecimal do número decimal 49?\n");
		                System.out.println("A) 3D");
		                System.out.println("B) 29");
		                System.out.println("C) 22");
		                System.out.println("D) 31");
		                System.out.print("Digite sua escolha: ");
		                String resposta4 = ler.nextLine().toLowerCase();
		                
		                if (resposta4.equals("a")) {
		                	System.out.println("Você superou os obstáculos. Continue a jornada!");
		                	fase++;
		                	} else {
		                		System.out.println("GAME OVER...");
		                		fase = 0;
		                		}
		                break;
		                
					case 5:
						System.out.println("Você decide olhar para baixo e vê um buraco com uma luz no fim, mas para avançar é necessário descobrir (calculo).");
		                System.out.println("Pergunta 5: Converta o número hexadecimal 5E para decimal.");
		                System.out.println("A) 94");
		                System.out.println("B) 44");
		                System.out.println("C) 30");
		                System.out.println("D) 62");
		                System.out.print("Digite sua escolha: ");
		                String resposta5 = ler.nextLine().toLowerCase();
		                
		                if (resposta5.equals("b")) {
		                	System.out.println("VOCÊ VENCEU!!!");
		                	System.out.println("A parede se move e você encontra a Lâmina Divina!");
		                	System.out.println("Ao segurá-la, você é hipnotizado e vê, através da própria lâmina, a história por trás de tudo isso.");
		                	System.out.println("Agora é com você! Defenda a lâmina");
		                	System.out.println("");
		                	String respostaFinal = ler.nextLine().toLowerCase();
		                	}else {
		                		System.out.println("GAME OVER...");
		                	}
		                
					case 6:
						jogo = false;
						System.out.println("Fim de jogo! Você encontrou o tesouro perdido.");
						break;
							}
					}
				break;
				
			case 3:
				//créditos
				System.out.println("Créditos do Jogo:\n");
				System.out.printf("Gabriel Gomes Camilo\n");
		        System.out.printf("Gabriel de Freitas Costa\n");
		        System.out.printf("Sergio Oliveira Borges\n");
		        System.out.printf("Lucas Gabriel Freitas Machado\n");
		        System.out.print("Pressione Enter para retornar ao menu...");
		        ler.nextLine();
		        break;
		        
			case 4:
				//sair
					System.out.println("Bye bye...");
				break;
				default:
					System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
					}
			} while (escolha != 4);
		}
}
