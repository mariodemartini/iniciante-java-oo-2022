
public abstract class Evento {

	private String tema;
	private int inicio;
	private int fim;
	private Participante membro;
	
	public Evento(int inicio, int fim) {
		this.inicio = inicio;
		this.fim = fim;
	}
	
	public void setTema(String assunto) {
		this.tema = assunto;
	}
	
	public String getTema() {
		return tema;
	}
	
	public void setInicio(int inicio) {
		this.inicio = inicio;
	}
	
	public int getInicio() {
		return inicio;
	}
	
	public void setFim(int fim) {
		this.fim = fim;
	}
	
	public int getFim() {
		return fim;
	}
	
	public void setMembro(Participante membro) {
		this.membro = membro;
	}
	
	public Participante getMembro() {
		return membro;
	}
	
		
}
