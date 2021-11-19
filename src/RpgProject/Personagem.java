package RpgProject;

import java.util.Scanner;

public abstract class Personagem {

	
	private int vida;
	private int vidaMax;
	private String nome;
	private String classe;
	private int armadura;
	private int xp;
	private boolean npc;
	private int bonusAtaque;
	private int nivel;
	
	//métodos que terão em todos os tipos de personagem
	
	public abstract int ataqueBasico();
	public abstract int ataqueFatal();
	public abstract void imprimirInfo();
	public abstract int chamaAtaque();
	
	
	public void restaurarVida() {
		setVida(getVidaMax());
	}
	
	
	public int ataqueAleatorio() {
		int op = jogarDado(4);
		if (op==1) {
			return ataqueFatal();
		}else {
			return ataqueBasico();
		}
	}

	
	public void lerPersonagem(){
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("\nEntre com o nome do personagem: ");
			setNome(ler.next());
			ler.nextLine();
			System.out.println("\nÉ um personagem não controlado pelo jogador (npc)?\n1-Sim\nNão ");
			int npc = ler.nextInt();
			ler.nextLine();
			if (npc==1) {
				setNpc(true);
			}
			else if (npc==2) {
				setNpc(false);
			}
			else {
				System.out.println("\nOpção Inválida!!");
				lerPersonagem();
			}
		}
		
	}
	

	//O persoangem recebe dano do golpe do NPC
	public void receberDano(int quantidade) {
		if ((getVida()-quantidade)<=0) {
			setVida(0);
		}
		else {
			setVida(getVida()-quantidade);
		}
		System.out.println("\n"+getNome()+" está com "+getVida()+" de vida");
	} 
	
	//Decisões simples serão resolvidas pela comparacao do jogar dado
	
	public int jogarDado(int nlados){
		Dado dado = new Dado();
		return dado.jogarDado(nlados);
	}
	
	//O valor de armadura de um persoangem é comparado com o lancamento de dado do adversário, se for maior o ataque não será efeticado 
	
	public boolean defesa(int quant, String atacante) {
		if (quant>=getArmadura()) {
			System.out.println("\n"+atacante+" acertou o ataque!!");
			return true;
		}
		else {
			System.out.println("\n"+atacante+" não acertou o ataque!!");
			return false;
			
		}
	
	}
	
	//O nível do personagem será determinado pelos pontos de experiência que ele receber nas batalhas 
	public void atualizarNivel() {
		if (getXp()>=100 && getXp()<200) {
			setNivel(1);
		}
		else if (getXp()>=200 && getXp()<300) {
			setVidaMax(getVidaMax()+5+jogarDado(3));
			setVida(getVidaMax());
			setArmadura(getArmadura()+2);
			setBonusAtaque(getBonusAtaque()+1);
			setNivel(2);
		}
		else if (getXp()>=300 && getXp()<400) {
			setVidaMax(getVidaMax()+5+jogarDado(3));
			setVida(getVidaMax());
			setArmadura(getArmadura()+2);
			setBonusAtaque(getBonusAtaque()+1);
			setNivel(3);
		}
		else if (getXp()>=400 && getXp()<500) {
			setVidaMax(getVidaMax()+5+jogarDado(3));
			setVida(getVidaMax());
			setArmadura(getArmadura()+2);
			setBonusAtaque(getBonusAtaque()+1);
			setNivel(4);
		}
		else if (getXp()>=500) {
			setVidaMax(getVidaMax()+5+jogarDado(3));
			setVida(getVidaMax());
			setArmadura(getArmadura()+2);
			setBonusAtaque(getBonusAtaque()+1);
			setNivel(5);
		}
		else {
			System.out.println("\nErro desconhecido...");
		}
	}
	

	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getArmadura() {
		return armadura;
	}
	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public void receberXP(int xp) {
		setXp(xp);
	}
	
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getBonusAtaque() {
		return bonusAtaque;
	}
	public void setBonusAtaque(int bonusAtaque) {
		this.bonusAtaque = bonusAtaque;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public boolean isNpc() {
		return npc;
	}
	public void setNpc(boolean npc) {
		this.npc = npc;
	}
	public int getVidaMax() {
		return vidaMax;
	}
	public void setVidaMax(int vidaMax) {
		this.vidaMax = vidaMax;
	}
	

}
