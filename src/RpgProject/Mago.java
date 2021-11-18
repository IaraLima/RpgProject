package RpgProject;

import java.util.Scanner;

public class Mago extends Personagem{
	private Magia arma;
	
	public Mago () {
		this.arma=new Magia("Fogo",8,10);
	}

	public Arma getArma() {
		return arma;
	}
	
	//Esse dano é o do ataque fatal apenas
	
	public int getDano() {
		return arma.getDano();
	}

	@Override
	public int ataqueBasico() {
		Dado dado = new Dado();
		return 1 +dado.jogarDado(3);
	}
	@Override
	public int ataqueFatal() {
		return getDano();
	}
	@Override
	public void imprimirInfo() {
		System.out.println("\n Personagem: "+ getNome()+"\n"+"Classe: "+ getClasse()+
				"\nNível:"+getNivel()+"\nPontos de Vida: "+getVida()+"\nArmadura: "+getArmadura()+"\nPontos de Experiência: "+getXp()
				+"\nMagia: "+getArma().getTipoArma()+"\nBônus de Golpe especial: "+getBonusAtaque());
	}
	
	@Override
	
	public int chamaAtaque() {
		try (Scanner ler = new Scanner(System.in)) {
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
	
	public void setArma(String x, int y, int z) {
		this.arma = new Magia(x,y,z);
	}
}
