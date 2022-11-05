package br.com.dio.model;

import java.util.Objects;

public class Gato {
	
	private String nome;
	private String cor;
	private Integer idade;
	
	
/* para criar isso é só apertar command/control+3 e colocar constructor e apertar em Generate Constructor Using Fields na aba Command*/
	
	public Gato() {
		/* this.nome= nome;
		/* this.cor= cor;
		/* this.idade= idade;
		
/* command/control+d apaga a linha */
	}


/* command/control+3 ggas na aba command clica em Generate Gaters and Seters*/

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	

/* command/control+3 equals na aba command clica em generate Hashcode and Equals*/
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade)
				&& Objects.equals(nome, other.nome);
	}
	

/* command/control+3 toString na aba command clica em generate toString*/

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}		
}
