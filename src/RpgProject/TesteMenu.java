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
					System.out.println("\nVoc� acaba de se deparar com o orc, que te acaba por te encurralar junto a parede.\nEle � bem maior que voc�, seus m�sculos enormes suados cheiram como um cad�ver em estado de putrefa��o."
							+ "\nEle segura um machado de duas m�os. O orc diz algumas palavras em sua l�ngua nativa, \nporem voc� as interpreta como VOC� MORRE AQUI!\n");
					
					
					
				}
				
				
				
				
			}
		}
	}

}
