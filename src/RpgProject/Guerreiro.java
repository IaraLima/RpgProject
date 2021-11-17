package RpgProject;

public class Guerreiro extends Personagem{
	private int forca;
	
	
	public Guerreiro(String nome) {
		setNome(nome);
		setVida(10);
		setArmadura(10);
		setForca(3);
	
	}
	
	@Override
	public void receberDano(int quantidade) {
		if ((getVida()-quantidade)<=0) {
			setVida(0);
		}
		else {
			setVida(getVida()-quantidade);
		}
		System.out.println("\n"+getNome()+" está com "+getVida()+" de vida");
	} 
	
	@Override
	public int atacar() {
		Dado dado= new Dado();
		int valorAtaque=getForca()+dado.jogarDado(3);
		System.out.println("\n"+getNome()+" deu um dano de "+valorAtaque);
		return valorAtaque;
	}
	
	
	
	@Override
	public boolean defesa(int quant) {
		if (quant>=getArmadura()) {
			System.out.println("\nacertou o ataque!!");
			return true;
		}
		else {
			System.out.println("\nnão acertou o ataque!!");
			return false;
			
		}
	
	}
	
	public void setForca(int forca) {
		this.forca=forca;
	}
	
	public int getForca() {
		return this.forca;
	}
	
}
