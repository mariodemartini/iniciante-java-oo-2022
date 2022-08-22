
public class TesteParticipante {

	public static void main(String[] args) {
		Aprendiz ap1 = new Aprendiz();
		ap1.setFuncao("Aluno");
		ap1.setNome("Henrique");
		
		Mentor m1 = new Mentor();
		m1.setFuncao("Mentor");
		m1.setNome("Nico"); 
		
		Organizador org1 = new Organizador();
		org1.setCriaEvento("Palestra");
		
		Palestra palestra = new Palestra(22, 22);
		palestra.setTema("Herança Java");
		
		
	}
}
