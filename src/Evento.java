
public abstract class Evento {

	private String tema;
	private int inicio;
	private int fim;
	private static int total = 0;
	private Participante lider;
	private Participante aprendiz;
	
	public Evento(int inicio, int fim, String tema) {
		Evento.total++;
		this.inicio = inicio;
		this.fim = fim;
		this.tema = tema;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getFim() {
		return fim;
	}

	public void setFim(int fim) {
		this.fim = fim;
	}

	public static int getTotal() {
		return total;
	}

	public Participante getLider() {
		return lider;
	}

	public void setLider(Participante lider) {
		this.lider = lider;
	}

	public Participante getAprendiz() {
		return aprendiz;
	}

	public void setAprendiz(Participante aprendiz) {
		this.aprendiz = aprendiz;
	}
	
}
