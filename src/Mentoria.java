
public class Mentoria extends Evento {

	private String trocaExperiencia;
	private String tiraDuvidas;
	
	public Mentoria(int inicio, int fim, String tema) {
		super(inicio, fim, tema);
		// TODO Auto-generated constructor stub
	}

	public String getTrocaExperiencia() {
		return trocaExperiencia;
	}

	public void setTrocaExperiencia(String trocaExperiencia) {
		this.trocaExperiencia = trocaExperiencia;
	}

	public String getTiraDuvidas() {
		return tiraDuvidas;
	}

	public void setTiraDuvidas(String tiraDuvidas) {
		this.tiraDuvidas = tiraDuvidas;
	}
	
	
}
