
public class Mentor extends Participante implements Lider{

	private String ministrar;
	private String auxiliotecnico;
	private Evento criardesafios;
	private Evento corrigirdesafios;
	private int senha;
	
	public String getMinistrar() {
		return ministrar;
	}
	public void setMinistrar(String ministrar) {
		this.ministrar = ministrar;
	}
	
	public String getAuxiliotecnico() {
		return auxiliotecnico;
	}
	public void setAuxiliotecnico(String auxiliotecnico) {
		this.auxiliotecnico = auxiliotecnico;
	}
	
	public Evento getCriardesafios() {
		return criardesafios;
	}
	public void setCriardesafios(Evento criardesafios) {
		this.criardesafios = criardesafios;
	}
	public Evento getCorrigirdesafios() {
		return corrigirdesafios;
	}
	public void setCorrigirdesafios(Evento corrigirdesafios) {
		this.corrigirdesafios = corrigirdesafios;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}
	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public boolean setCriaEvento(String tema) {
		return true;
		
	}

}