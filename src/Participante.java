
public abstract class Participante {

	private String nome;
	private int idade;
	private String cpf;
	private String formacao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getFuncao() {
		return formacao;
	}
	public void setFuncao(String funcao) {
		this.formacao = funcao;
	}
	
}
