
public class Organizador extends Participante implements Lider {

    private String auxiliomentor;
    private String auxilioaprendiz;
    private int senha;
    
	public String getAuxiliomentor() {
		return auxiliomentor;
	}

	public void setAuxiliomentor(String auxiliomentor) {
		this.auxiliomentor = auxiliomentor;
	}
	
	public String getAuxilioaprendiz() {
		return auxilioaprendiz;
	}

	public void setAuxilioaprendiz(String auxilioaprendiz) {
		this.auxilioaprendiz = auxilioaprendiz;
	}

	@Override
	public boolean setCriaEvento(String evento) {
		return true;		
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


	
}
