package RpgProject;

public class Dragao extends Personagem {
private Magia arma;
private int forca;

	public Dragao () {
		Dado dado=new Dado();
		setClasse("Dragão");
		setXp(1000);
		
		
		int op=dado.jogarDado(5);
		switch (op) {
		case 1:
			setNome("Dragão de Fogo");
			setVida(15);
			setNpc(true);
			setVidaMax(15);
			setBonusAtaque(0);
			setNivel(1);
			setArmadura(6);
			this.arma = new Magia("Bola de Fogo",8,10);	
			 break;
		
		case 2:
			setNome("Dragão de Água");
			setVida(20);
			setNpc(true);
			setVidaMax(15);
			setBonusAtaque(0);
			setNivel(1);
			setArmadura(6);
			setForca(4);
			this.arma = new Magia("Sopro Gelado",1,3);	
			break;
			
		case 3:
			setNome("Dragão de Terra");
			setVida(15);
			setVidaMax(15);
			setArmadura(8);
			setNpc(true);
			setBonusAtaque(0);
			setNivel(1);
			setForca(4);
			this.arma = new Magia("Terremoto",2,5);	
			break;
		case 4:
			setNome("Dragão de Ar");
			setVida(15);
			setNpc(true);
			setVidaMax(15);
			setBonusAtaque(0);
			setNivel(1);
			setArmadura(6);
			setForca(7);
			this.arma = new Magia("Tornado",3,7);	
			
			break;
		}
	}

	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	@Override
	public int ataqueFatal() {
		Dado dado= new Dado();
		int valorAtaque=arma.getDano()+dado.jogarDado(3)+jogarDado(3)*jogarDado(3);
		System.out.println("\n"+getNome()+" deu um dano de "+valorAtaque+"!");
		return valorAtaque;
	}
	@Override
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


	public Magia getArma() {
		return arma;
	}


	public void setArma(Magia arma) {
		this.arma = arma;
	}


	@Override
	public int ataqueBasico() {
		Dado dado= new Dado();
		int valorAtaque=getForca()+dado.jogarDado(3)*2;
		System.out.println("\n"+getNome()+" deu um dano de "+valorAtaque+"!");
		return valorAtaque;
	}


	@Override
	public void imprimirInfo() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int chamaAtaque() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
