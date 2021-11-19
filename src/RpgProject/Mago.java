package RpgProject;

import java.util.Scanner;

public class Mago extends Personagem{
	private Magia arma;
	Scanner ler = new Scanner(System.in);
	public Mago (String nome) {
		setNome(nome);
		setVida(50);
		setClasse("Mago");
		setNpc(false);
		setVidaMax(50);
		setBonusAtaque(0);
		setNivel(1);
		setXp(0);
		setArmadura(8);
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
		System.out.println("\nPersonagem: "+ getNome()+"\n"+"Classe: "+ getClasse()+
				"\nNível:"+getNivel()+"\nPontos de Vida: "+getVida()+"\nArmadura: "+getArmadura()+"\nPontos de Experiência: "+getXp()
				+"\nMagia: "+getArma().getTipoArma()+"\nBônus de Golpe especial: "+getBonusAtaque());
	}
	
	@Override
	
	public int chamaAtaque() {
	
			if (getBonusAtaque()>0) {
				System.out.println("\nQual golpe você quer fazer?\n1-Misseis Mágicos\n2- Bola de fogo");
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
				System.out.println("\nQual golpe você quer fazer?\n\n1- Misseis Mágicos");
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
		
	
	
	public void setArma(String x, int y, int z) {
		this.arma = new Magia(x,y,z);
	}
}
