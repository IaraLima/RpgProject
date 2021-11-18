package RpgProject;

import java.util.Scanner;

public class Guerreiro extends Personagem{
	private int forca;
	Scanner ler = new Scanner(System.in);
	
	public Guerreiro(String nome) {
		setNome(nome);
		setVida(10);
		setArmadura(10);
		setForca(3);
	
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
		
			if (getBonusAtaque()>0) {
				System.out.println("\nQual golpe voc� quer fazer?\n1-Soc�o\n2-Martelo (capoeira)");
				int op = ler.nextInt();
				ler.nextLine();
				switch(op) {
				case 1: {
					return ataqueBasico();
				}
				case 2: {
					setBonusAtaque(getBonusAtaque()-1);
					return ataqueFatal();
				}
				default: {
					return 0;
				}
				}
			}
			else {
				System.out.println("\nQual golpe voc� quer fazer?\n1-Soc�o");
				
				int op = ler.nextInt();
				ler.nextLine();
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
	
	
	@Override
	public void imprimirInfo(){
		System.out.println("\n Personagem: "+ getNome()+"\n"+"Classe: "+ getClasse()+
				"\nN�vel:"+getNivel()+"\nPontos de Vida: "+getVida()+"\nArmadura: "+getArmadura()+"\nPontos de Experi�ncia: "+getXp()
				+"\nFor�a: "+getForca()+"\nB�nus de Golpe especial: "+getBonusAtaque());
	}
	

	
	public void setForca(int forca) {
		this.forca=forca;
	}
	
	public int getForca() {
		return this.forca;
	}
	
}
