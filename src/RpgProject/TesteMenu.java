package RpgProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteMenu {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int escolha = 1;

		while (escolha != 0) {
			
			System.out.println("\n------------------------------------------------------ECLIPSE E A JORNADA DO HEROI---------------------------------------------------------------------------");
			System.out.println("\n0-Sair");
			System.out.println("\n1-Iniciar");
			escolha = ler.nextInt();
			ler.nextLine();
			System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
			

			if (escolha == 1) {
				Personagem p;
				String nome;
				System.out.println("\nNome do personagem: ");
				nome = ler.next();
				ler.nextLine();

				System.out.println("\nEscolha sua classe: (1-Mago ou 2-Guerreiro)");
				int classe = ler.nextInt();
				ler.nextLine();
				System.out.println("\n\n");
				System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n\n");

				// do {
				if (classe==1) {
					p = new Mago(nome);
				} else {
					p = new Guerreiro(nome);
				}
				// else {
				// System.out.println("\nInforme um nome válido!!");
				// break;
				// }while(classe!="Mago" && classe!="Guerreiro");

				List<Personagem> inimigos = new ArrayList();

				Historia hist = new Historia();

				Orc orc = new Orc();
				Lobisomen lobisomen = new Lobisomen();
				Goblin goblin = new Goblin();
				Dragao dragao = new Dragao();

				inimigos.add(goblin);
				inimigos.add(orc);
				inimigos.add(lobisomen);
				inimigos.add(dragao);
				hist.prologo(p);
				Batalha batalha = new Batalha();
				batalha.setOp1(p);
				batalha.setOp2(inimigos.get(0));
				System.out.println("\n\n");
				System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n\n");
				System.out.println("\t\t\t\t\t\t\tINFORMAÇÕES DO PERSONAGEM\n\n\n");
				// Parte 1, batalha contra o goblin
				p.imprimirInfo();
				System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
				inimigos.get(0);
				hist.parte1();
				System.out.println("\n\n");
				System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n\n");
				batalha.comecarBatalha();
				if (batalha.getVencendor() == p) {
					hist.resultadoParte1(true, p);
					p.restaurarVida();
					p.setXp(p.getXp() + inimigos.get(0).getXp());
					p.atualizarNivel();
					System.out.println("\n\n");
					System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("\n\n");
				} else {
					hist.resultadoParte1(false, p);
					break;

				}
				// Parte 2, batalha contra o orc
				p.imprimirInfo();
				System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
				inimigos.get(1);
				hist.parte2();
				System.out.println("\n\n");
				System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n\n");
				batalha.setOp2(inimigos.get(1));
				batalha.comecarBatalha();
				if (batalha.getVencendor() == p) {
					hist.resultadoParte2(true, p);
					p.restaurarVida();
					p.setXp(p.getXp() + inimigos.get(0).getXp());
					p.atualizarNivel();
					System.out.println("\n\n");
					System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("\n\n");
					

				} else {
					hist.resultadoParte2(false, p);
					break;
				}
				// Parte 3, batalha contra o lobisomen
				p.imprimirInfo();
				System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
				inimigos.get(2);
				hist.parte3();
				System.out.println("\n\n");
				System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n\n");
				batalha.setOp2(inimigos.get(2));
				batalha.comecarBatalha();
				if (batalha.getVencendor() == p) {
					hist.resultadoParte3(true);
					p.restaurarVida();
					p.setXp(p.getXp() + inimigos.get(0).getXp());
					p.atualizarNivel();
					System.out.println("\n\n");
					System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("\n\n");
					
				} else {
					hist.resultadoParte3(false);
					break;
				}
				// Parte 4, batalha contra dragão
				p.imprimirInfo();
				System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
				inimigos.get(3);
				hist.parte4(inimigos.get(3));
				System.out.println("\n\n");
				System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n\n");
				batalha.setOp2(inimigos.get(3));
				batalha.comecarBatalha();
				if (batalha.getVencendor() == p) {
					p.restaurarVida();
					p.setXp(p.getXp() + inimigos.get(0).getXp());
					p.atualizarNivel();
					hist.resultadoParte4(true, inimigos.get(3));
				} else {
					hist.resultadoParte4(false, inimigos.get(3));
					break;

				}

			}

		}
	}
}
