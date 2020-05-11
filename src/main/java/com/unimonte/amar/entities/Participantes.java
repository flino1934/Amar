package com.unimonte.amar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participantes")
public class Participantes {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "sobre_nome")
	private String sobreNome;

	@Column(name = "matricula")
	private String matricula;

	@Column(name = "email")
	private String email;

	@Column(name = "idade")
	private int idade;

	@Column(name = "curso")
	private String curso;

	@Column(name = "cpf")
	private String cpf;

	public Participantes() {
		// TODO Auto-generated constructor stub
	}

	public Participantes(String nome, String sobreNome, String matricula, String email, int idade, String curso,
			String cpf) {

		this.nome = nome;
		this.sobreNome = sobreNome;
		this.matricula = matricula;
		this.email = email;
		this.idade = idade;
		this.curso = curso;
		this.cpf = cpf;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sobreNome == null) ? 0 : sobreNome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participantes other = (Participantes) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobreNome == null) {
			if (other.sobreNome != null)
				return false;
		} else if (!sobreNome.equals(other.sobreNome))
			return false;
		return true;
	}
	
	

}
