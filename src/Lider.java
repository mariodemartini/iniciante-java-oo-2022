
public abstract class Lider extends Participante {
	
    private int senha;
    private String criacaoeventos;
    private String auxilioaprendiz;
    
	public void setSenha(int senha) {
		this.senha = senha;
	}
    
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
        
    public String getCriacaoeventos() {
		return criacaoeventos;
	}

	public void setCriacaoeventos(String criacaoeventos) {
		this.criacaoeventos = criacaoeventos;
	}

	public String getAuxilioaprendiz() {
		return auxilioaprendiz;
	}

	public void setAuxilioaprendiz(String auxilioaprendiz) {
		this.auxilioaprendiz = auxilioaprendiz;
	}



}
