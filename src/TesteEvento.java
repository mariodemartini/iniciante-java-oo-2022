
public class TesteEvento {

	public static void main(String[] args) {
		Evento primeiroCurso = new Curso(19, 21, "Jogos");
				
		System.out.println("Assunto do primeiro curso: " + primeiroCurso.getTema());
	
		Participante novo = new Aprendiz();
		novo.setNome("Mario de Martini");
		novo.setCpf("222.222.222-22");
		novo.setIdade(34);
		novo.setFuncao("aluno");
			
		Evento primeiroDesafio = new Desafio(19, 21, "Jogo da Velha");
		
		System.out.println("Tema do Desafio: " + primeiroDesafio.getTema());
		System.out.println("Dia de inicio: " + primeiroDesafio.getInicio() + " Dia da entrega: " + primeiroDesafio.getFim());
				
	}
}
