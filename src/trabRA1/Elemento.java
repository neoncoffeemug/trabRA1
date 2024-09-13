package trabRA1;

//Armazena informações basicas de uma solicitação ou cliente

public class Elemento {
	
	String id;
	String nome;
	String descricao;
	String dataHora;
	
	public Elemento(String id, String nome, String descricao, String dataHora) {
		
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.dataHora = dataHora;
	}
	
	@Override
	public String toString() {
		
		return "Id:" + id + " Nome:" + nome +", Descrição: " + descricao + ", Data e Horario: " + dataHora;
	}	
}