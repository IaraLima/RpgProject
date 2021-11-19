package RpgProject;

import java.util.Scanner;

public class Orc extends Personagem {
	
	Scanner ler = new Scanner(System.in);

		private int forca;
	
		public Orc(String nome) {
			setNome(nome);
			setVida(15);
			setArmadura(7);
			setForca(5);
		}
		
		public Orc(String nome, int xp, int vida, int armadura,int forca) {
			setNome("Orc "+nome);
			setVida(vida);
			setArmadura(armadura);
			setForca(forca);
		
		}
		
		
		public Orc() {
			setNome("Orc");
			setVida(15);
			setNpc(true);
			setVidaMax(15);
			setBonusAtaque(0);
			setNivel(1);
			setXp(200);
			setArmadura(7);
			setForca(5);
		
		}
		
		@Override
		public int ataqueBasico() {
			Dado dado= new Dado();
			int valorAtaque=getForca()+dado.jogarDado(3);
			System.out.println("\n"+getNome()+" deu um dano de "+valorAtaque+"!");
			return valorAtaque;
		}
		@Override
		public int ataqueFatal() {
			Dado dado= new Dado();
			int valorAtaque=getForca()+dado.jogarDado(3)+jogarDado(3)*jogarDado(3);
			System.out.println("\n"+getNome()+" deu um dano de "+valorAtaque+"!");
			return valorAtaque;
		}
		@Override
		public int chamaAtaque() {
			{
				if (getBonusAtaque()>0) {
					System.out.println("\nQual golpe você quer fazer?\n1-Grito Catarrento\n2- Soco de cima pra baixo");
					int op = ler.nextInt();
					switch(op) {
					case 1: {
						ataqueBasico();
					}
					case 2: {
						ataqueFatal();
						setBonusAtaque(getBonusAtaque()-1);
					}
					default: {
						return 0;
					}
					}
				}
				else {
					System.out.println("\nQual golpe você quer fazer?\n1- Grito Catarrento)");
					int op = ler.nextInt();
					
					switch(op) {
					case 1: {
						return ataqueBasico();
					}
					default:{
						return 0;
					}
					}
				}
			}
			
		}
		
		
		@Override
		public void imprimirInfo(){
			System.out.println("\n Personagem: "+ getNome()+"\n"+"Classe: "+ getClasse()+
					"\nNível:"+getNivel()+"\nPontos de Vida: "+getVida()+"\nArmadura: "+getArmadura()+"\nPontos de Experiência: "+getXp()
					+"\nForça: "+getForca()+"\nBônus de Golpe especial: "+getBonusAtaque());
		}
		
		
		public void setForca(int forca) {
			this.forca=forca;
		}
		
		public int getForca() {
			return this.forca;
		}
		

	
	
	
}
