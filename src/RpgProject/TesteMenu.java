package RpgProject;

import java.util.Scanner;

public class TesteMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int escolha=1;
		try (Scanner ler = new Scanner(System.in)) {
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
					System.out.println("\nVocê acaba de se deparar com o orc, que te acaba por te encurralar junto a parede.\nEle é bem maior que você, seus músculos enormes suados cheiram como um cadáver em estado de putrefação."
							+ "\nEle segura um machado de duas mãos. O orc diz algumas palavras em sua língua nativa, \nporem você as interpreta como VOCÊ MORRE AQUI!\n");
					
					
					
				}
				
				
				
				
			}
		}
	}

}
