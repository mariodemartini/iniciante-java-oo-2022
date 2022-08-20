
public class Curso extends Evento {

	private Mentor mentor;
	private int numeroaulas;
	private Aprendiz aprendiz;
	
	public Curso(int inicio, int fim) {
		super(inicio, fim);
	}

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

	public int getNumeroaulas() {
		return numeroaulas;
	}

	public void setNumeroaulas(int numeroaulas) {
		this.numeroaulas = numeroaulas;
	}

	public Aprendiz getAprendiz() {
		return aprendiz;
	}

	public void setAprendiz(Aprendiz aprendiz) {
		this.aprendiz = aprendiz;
	}

}
