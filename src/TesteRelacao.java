
public class TesteRelacao {

	public static void main(String[] args) {
		Aprendiz aprendiz01 = new Aprendiz();
		aprendiz01.setNome("Juca");
		aprendiz01.setFuncao("Aluno");
		aprendiz01.setDuvidas("como instanciar objetos?");
		
		Mentor novomentor = new Mentor();
		novomentor.setNome("Jo�o");
		novomentor.setFuncao("Mentor");
		novomentor.setMinistraEventos("Curso Java");
		novomentor.setAuxilioTecnico("usar new para instaciar objeto.");
		
		Evento novocurso = new Curso(20, 22, "Polimorfismo");
		novocurso.setTema("Objeto Java"); 
		novocurso.setLider(novomentor);
		novocurso.setAprendiz(aprendiz01);
				
		System.out.println("Curso da semana: " + novocurso.getTema());
		System.out.println("Inicio: " + novocurso.getInicio() + " Fim: " + novocurso.getFim());
		System.out.println("Participante: " + aprendiz01.getNome() + ", Professor: " + novomentor.getNome());
		System.out.println("Duvida: " + aprendiz01.getDuvidas() + " Resposta: " + novomentor.getAuxilioTecnico());
		
		
	}
}
