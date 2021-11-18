package RpgProject;

public class Magia extends Arma{
	private String tipo;
	private int danoMin;
	private int danoMax;
	public Magia(String tipo, int danoMin, int danoMax) {
		this.tipo = tipo;
		this.danoMin = danoMin;
		this.danoMax = danoMax;
	}
	@Override
	public int getDano() {
		return (int)(Math.random() * (danoMax - danoMin)) + danoMin;
	}

	@Override
	public String getTipoArma() {
		return tipo;
	}
	
}
