package RpgProject;

public class Batalha {
	private Personagem op1;
	private Personagem op2;
	private Personagem vencendor;
	
	Batalha (){
		
	}
	
	public void apresentar() {
		System.out.println("\n ------------------------ Batalha -------------------\n"+ op1.getNome()+" vs "+op2.getNome());
	}
	public void comecarBatalha() {
		Personagem p,s;
		
		if (op1.jogarDado(20)>op2.jogarDado(20)) {
		  p=op1;
		  s=op2;
		}
		else {
		p=op1;
		s=op2;
		}
		
		do {
			
			if (p.getVida()>0) {
			System.out.println("\n"+p.getNome()+" tentativa de ataque:");
			
			if (s.defesa(p.jogarDado(20),p.getNome())) {
				s.receberDano(p.chamaAtaque());
			}
			}
			else {
				System.out.println("\n"+p.getNome()+" morreu! \n GAME OVER");
				setVencendor(s);
				break;
			}
			if (s.getVida()>0) {
				System.out.println("\n"+s.getNome()+" tentativa de ataque:\n");
				if (p.defesa(s.jogarDado(20),s.getNome())) {
					p.receberDano(s.ataqueAleatorio());	
				}
			}
			else {
				System.out.println("\n"+p.getNome()+" derrotou o "+op2.getNome()+"! Parabéns !!");
				setVencendor(p);
				break;
			}
		

		}while (true);	
		
		
	}
	public Personagem getOp1() {
		return op1;
	}
	public void setOp1(Personagem op1) {
		this.op1 = op1;
	}
	public Personagem getOp2() {
		return op2;
	}
	public void setOp2(Personagem op2) {
		this.op2 = op2;
	}
	public Personagem getVencendor() {
		return vencendor;
	}
	public void setVencendor(Personagem vencendor) {
		this.vencendor = vencendor;
	}

}
