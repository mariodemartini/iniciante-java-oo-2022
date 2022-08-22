
public class TesteParticipante {

	public static void main(String[] args) {
		Aprendiz ap1 = new Aprendiz();
		ap1.setFuncao("Aluno");
		ap1.setNome("Henrique");
		
		Mentor m1 = new Mentor();
		m1.setFuncao("Mentor");
		m1.setNome("Nico"); 
		
		Organizador org1 = new Organizador();
		org1.setFuncao("Organizador");
		org1.setNome("Maria");
				
		
		System.out.println(org1.getNome() + " tem a função de " + org1.getFuncao() + " pode organizar o evento: " + org1.setCriaEvento("Palestra"));
		System.out.println();
	}
}
