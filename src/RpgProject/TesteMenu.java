package RpgProject;

import java.util.Scanner;

public class TesteMenu {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int escolha=1;
		{
			while(escolha!=0) {
				System.out.println("\n------- Matador de Orcs ---------");
				System.out.println("\n0-Sair");
				System.out.println("\n1-Batalha direta");
				System.out.println("\n2-Aventura");
				System.out.println("\nescolha: ");
				escolha=ler.nextInt();
				ler.nextLine();
				
				if (escolha==1) {
					String nome;
					System.out.println("\nNome do personagem: ");
					nome = ler.next();
					ler.nextLine();
					Guerreiro guerreiro = new Guerreiro(nome);
					Orc orc = new Orc();
					Lobisomen lobisomen = new Lobisomen();
					Goblin goblin = new Goblin();
					
					Batalha batalha = new Batalha();
					batalha.setOp1(guerreiro);
					batalha.setOp2(goblin);
					System.out.println("\nVocê passa por uma área com muitos arbustos e sente um forte odor, vindo de um dos arbustos de dentro de um deles sai um goblin que aparenta ser fraco porem hostil, ele te ataca sem que voce espere ");
					batalha.comecarBatalha();
					System.out.println("\n Parabens pela vitoria "+nome+"Mais sera que continuara sendo facil");
					batalha.setOp2(orc);
					System.out.println("\nVocê acaba de se deparar com o orc, que te acaba por te encurralar junto a parede.\nEle é bem maior que você, seus músculos enormes suados cheiram como um cadáver em estado de putrefação."
							+ "\nEle segura um machado de duas mãos. O orc diz algumas palavras em sua língua nativa, \nporem você as interpreta como VOCÊ MORRE AQUI!\n");
					batalha.comecarBatalha();
					batalha.setOp2(lobisomen);
					System.out.println("\n");
					
					
					
					
				}		
			}
		}
	}

}
