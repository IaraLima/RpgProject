package RpgProject;

public abstract class Personagem {
	private int vida;
	private String nome;
	private int armadura;
	private int ataque;
	
	

	public abstract void receberDano(int quantidade); 
	public abstract int atacar(); 
	public abstract boolean defesa(int quant);
	
	public int jogarDado(int nlados){
		Dado dado = new Dado();
		return dado.jogarDado(nlados);
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
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	

}
