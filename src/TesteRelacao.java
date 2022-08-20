
public class TesteRelacao {

	public static void main(String[] args) {
		Aprendiz aprendiz01 = new Aprendiz();
		aprendiz01.setNome("Juca");
		aprendiz01.setFuncao("Aluno");
		aprendiz01.setDuvidas("como instanciar objetos?");
		
		Mentor novomentor = new Mentor();
		novomentor.setNome("Linux");
		novomentor.setFuncao("Mentor");
		novomentor.setMinistrar("Curso Java");
		novomentor.setAuxilioaprendiz("usar new para instaciar objeto.");
		
		Evento novocurso = new Curso(20, 22);
		novocurso.setTema("Objeto Java"); 
		novocurso.setMembro(aprendiz01);
		novocurso.setMembro(novomentor);
		
		System.out.println("Curso da semana: " + novocurso.getTema());
		System.out.println("Inicio: " + novocurso.getInicio() + " Fim: " + novocurso.getFim());
		System.out.println("Participante: " + aprendiz01.getNome() + ", Professor: " + novomentor.getNome());
		System.out.println("Duvida: " + aprendiz01.getDuvidas() + " Resposta: " + novomentor.getAuxilioaprendiz());
		
		
	}
}
