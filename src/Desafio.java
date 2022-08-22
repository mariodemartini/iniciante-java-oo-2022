
public class Desafio extends Evento {

	private int projeto;
	private Evento correcaodesafios;
	private Mentor mentor;
	private Aprendiz aprendiz;
	
	public Evento getCorrecaodesafios() {
		return correcaodesafios;
	}

	public void setCorrecaodesafios(Evento correcaodesafios) {
		this.correcaodesafios = correcaodesafios;
	}

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

	public Aprendiz getAprendiz() {
		return aprendiz;
	}

	public void setAprendiz(Aprendiz aprendiz) {
		this.aprendiz = aprendiz;
	}

	public Desafio(int inicio, int fim) {
		super(inicio, fim);	
	}

	public int getNumeroprojetos() {
		return projeto;
	}

	public void setNumeroprojetos(int numeroprojetos) {
		this.projeto = numeroprojetos;
	}
	
}
