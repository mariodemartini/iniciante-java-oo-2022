
public class TesteEvento {

	public static void main(String[] args) {
		Evento primeiroCurso = new Curso(19, 21);
		primeiroCurso.setTema("Métodos Java");
		
		System.out.println(primeiroCurso.getTema());
	
		Participante novo = new Aprendiz();
		novo.setNome("Mario de Martini");
		novo.setCpf("222.222.222-22");
		novo.setIdade(34);
		novo.setFuncao("aluno");
			
		Evento eventoDoMario = new Desafio(19, 21);
		eventoDoMario.setTema("Polimorfismo");
		eventoDoMario.setMembro(novo);
		
		System.out.println(eventoDoMario.getMembro().getNome());
		System.out.println(eventoDoMario.getMembro());
		
		
		System.out.println(novo.getNome() + ", " + novo.getFuncao());
		System.out.println(novo);
		
		
				
	}
}
