
public class TesteParticipante {

	public static void main(String[] args) {
		Participante ap1 = new Aprendiz();
		ap1.setFormacao("estudante TI");
		ap1.setNome("Henrique");
		
		System.out.println("Participante do Movimento Codar: " + ap1.getNome() + ", " + ap1.getFormacao());
		
		Mentor mentor = new Mentor();
		mentor.setNome("Nico");
		mentor.setCriaDesafios("Desafio Java");
		
		System.out.println("O mentor " + mentor.getNome() + " criou o evento do tipo " + mentor.getCriaDesafios());
				
	}
}
