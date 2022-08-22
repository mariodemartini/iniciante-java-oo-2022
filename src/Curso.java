
public class Curso extends Evento {

	private String aulas;
	private String artigos;
	
	public Curso(int inicio, int fim, String tema) {
		super(inicio, fim, tema);
		// TODO Auto-generated constructor stub
	}
	
	public String getAulas() {
		return aulas;
	}

	public void setAulas(String aulas) {
		this.aulas = aulas;
	}

	public String getArtigos() {
		return artigos;
	}

	public void setArtigos(String artigos) {
		this.artigos = artigos;
	}
	
}
