
public class Desafio extends Evento {

	private String proposta;
	private String correcao;
	
	public Desafio(int inicio, int fim, String tema) {
		super(inicio, fim, tema);
		// TODO Auto-generated constructor stub
	}
	
	public String getProposta() {
		return proposta;
	}

	public void setProposta(String proposta) {
		this.proposta = proposta;
	}

	public String getCorrecao() {
		return correcao;
	}

	public void setCorrecao(String correcao) {
		this.correcao = correcao;
	}

}
