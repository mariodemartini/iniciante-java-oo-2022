
public abstract class Evento {

	private String tema;
	private Participante lider;
	private Aprendiz aprendiz;
	private int inicio;
	private int fim;
	private static int total = 0;
	
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

	public Participante getLider() {
		return lider;
	}

	public void setLider(Participante lider) {
		this.lider = lider;
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

	public Aprendiz getAprendiz() {
		return aprendiz;
	}

	public void setAprendiz(Aprendiz aprendiz) {
		this.aprendiz = aprendiz;
	}

	public static int getTotal() {
		return total;
	}
	
}
