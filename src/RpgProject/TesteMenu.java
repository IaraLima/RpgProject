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
					System.out.println("\nVoc� passa por uma �rea com muitos arbustos e sente um forte odor, vindo de um dos arbustos de dentro de um deles sai um goblin que aparenta ser fraco porem hostil, ele te ataca sem que voce espere ");
					batalha.comecarBatalha();
					System.out.println("\n Parabens pela vitoria "+nome+"Mais sera que continuara sendo facil");
					batalha.setOp2(orc);
					System.out.println("\nVoc� acaba de se deparar com o orc, que te acaba por te encurralar junto a parede.\nEle � bem maior que voc�, seus m�sculos enormes suados cheiram como um cad�ver em estado de putrefa��o."
							+ "\nEle segura um machado de duas m�os. O orc diz algumas palavras em sua l�ngua nativa, \nporem voc� as interpreta como VOC� MORRE AQUI!\n");
					batalha.comecarBatalha();
					batalha.setOp2(lobisomen);
					System.out.println("\n");
					
					
					
					
				}		
			}
		}
	}

}
