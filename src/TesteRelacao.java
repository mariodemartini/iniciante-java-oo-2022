
public class TesteRelacao {

	public static void main(String[] args) {
		Participante novo = new Aprendiz();
		novo.setNome("Mario de Martini");
		novo.setCpf("222.222.222-22");
		novo.setIdade(34);
		novo.setFormacao("aluno de TI");
			
		Evento primeiroDesafio = new Desafio(19, 21, "Jogo da Velha");
		
		System.out.println("Tema do Desafio: " + primeiroDesafio.getTema());
		System.out.println("Dia de inicio: " + primeiroDesafio.getInicio() + " Dia da entrega: " + primeiroDesafio.getFim());
		System.out.println("Aprendiz: " + novo.getNome());
		System.out.println("Evento número " + Evento.getTotal());
		
		Aprendiz aprendiz01 = new Aprendiz();
		aprendiz01.setNome("Mario");
		aprendiz01.setFormacao("Aluno de TI");
		aprendiz01.setDuvidas("como instanciar objetos?");
		
		Mentor novomentor = new Mentor();
		novomentor.setNome("João");
		novomentor.setFormacao("Back-end");
		novomentor.setMinistraEventos("Curso Java");
		novomentor.setAuxilioTecnico("usar new para instaciar objeto.");
		
		Evento novocurso = new Curso(20, 22, "Polimorfismo");
		novocurso.setTema("Objeto Java"); 
		novocurso.setLider(novomentor);
		novocurso.setAprendiz(aprendiz01);
				
		System.out.println("Curso da semana: " + novocurso.getTema());
		System.out.println("Inicio: " + novocurso.getInicio() + " Fim: " + novocurso.getFim());
		System.out.println("Participante: " + aprendiz01.getNome() + ", Professor: " + novomentor.getNome());
		System.out.println("Duvida: " + aprendiz01.getDuvidas());
		System.out.println("Resposta: " + novomentor.getAuxilioTecnico());
		System.out.println("Evento numero: " + Evento.getTotal());
		
		
	}
}
