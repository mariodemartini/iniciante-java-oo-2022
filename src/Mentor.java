
public class Mentor extends Participante implements Lider{

	private String ministraEventos;
	private String auxilioTecnico;
	private String criaDesafios;
	private String revisaDesafios;
	
	@Override
	public void setCriaEventos(String tipo) {
		this.setCriaEventos(tipo);
	}

	public String getMinistraEventos() {
		return ministraEventos;
	}

	public void setMinistraEventos(String ministraEventos) {
		this.ministraEventos = ministraEventos;
	}

	public String getAuxilioTecnico() {
		return auxilioTecnico;
	}

	public void setAuxilioTecnico(String auxilioTecnico) {
		this.auxilioTecnico = auxilioTecnico;
	}

	public String getCriaDesafios() {
		return criaDesafios;
	}

	public void setCriaDesafios(String criaDesafios) {
		this.criaDesafios = criaDesafios;
	}

	public String getRevisaDesafios() {
		return revisaDesafios;
	}

	public void setRevisaDesafios(String revisaDesafios) {
		this.revisaDesafios = revisaDesafios;
	}
	
	
	

}