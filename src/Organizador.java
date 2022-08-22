
public class Organizador extends Participante implements Lider {

	private String auxilioRegras;

	@Override
	public void setCriaEventos(String tipo) {
		this.setCriaEventos(tipo);		
	}

	public String getAuxilioRegras() {
		return auxilioRegras;
	}

	public void setAuxilioRegras(String auxilioRegras) {
		this.auxilioRegras = auxilioRegras;
	}   
      
}