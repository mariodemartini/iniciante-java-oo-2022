
public class TesteParticipante {

	public static void main(String[] args) {
		Aprendiz ap1 = new Aprendiz();
		ap1.setFuncao("Aluno");
		ap1.setNome("Henrique");
		
		Mentor m1 = new Mentor();
		m1.setFuncao("Mentor");
		m1.setNome("Nico"); 
		
		Lider og1 = new Organizador();
		og1.setFuncao("RH");
		og1.setNome("Maria");
		og1.setSenha(123);
		
		System.out.println(og1.autentica(123));
		
	}
}
