package RpgProject;

import java.util.Scanner;

public class Goblin extends Personagem {
	
	Scanner ler = new Scanner(System.in);

		private int forca;
	
		public Goblin(String nome) {
			setNome(nome);
			setVida(10);
			setArmadura(7);
			setForca(5);
		}
		
		public Goblin(String nome, int xp, int vida, int armadura,int forca) {
			setNome("Goblin "+nome);
			setVida(vida);
			setArmadura(armadura);
			setForca(forca);
		
		}
		
		
		public Goblin() {
			setNome("Goblin");
			setClasse("Goblin");
			setVida(10);
			setVidaMax(10);
			setBonusAtaque(0);
			setNivel(1);
			setXp(100);
			setArmadura(7);
			setForca(2);
		
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
					System.out.println("\nQual golpe voc? quer fazer?\n1-Apunhalada fraca\n2- Apunhalada forte");
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
					System.out.println("\nQual golpe voc? quer fazer?\n\n1- Apunhalada fraca)");
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
					"\nN?vel:"+getNivel()+"\nPontos de Vida: "+getVida()+"\nArmadura: "+getArmadura()+"\nPontos de Experi?ncia: "+getXp()
					+"\nFor?a: "+getForca()+"\nB?nus de Golpe especial: "+getBonusAtaque());
		}
		
		
		public void setForca(int forca) {
			this.forca=forca;
		}
		
		public int getForca() {
			return this.forca;
		}
		

	
	
	
}
