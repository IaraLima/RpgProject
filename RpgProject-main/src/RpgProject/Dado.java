package RpgProject;

public class Dado {

	public int jogarDado(int nlados) {
		return (int)((Math.random() * (nlados-1)))+1;
	}
}
