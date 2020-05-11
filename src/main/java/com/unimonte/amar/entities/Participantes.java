package com.unimonte.amar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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

	@NotBlank(message = "Campo necessario")
	@Size(min = 6, message = "Campo necessario ")
	@Column(name = "matricula")
	private String matricula;

	@Column(name = "email")
	@Email(message = "Formato incompativel")//Pode passar nulo porem nunca no formato errado
	private String email;

	@Min(value = 16,message = "A idade tem que ser maior ou igual a 16")
	@Column(name = "idade")
	@NotNull(message = "Campo obrigatório")
	private Integer idade;

	@Column(name = "curso")
	private String curso;

	@Column(name = "cpf")
	@Pattern(regexp = "[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}",message = "Formato invalido")
	@NotBlank(message = "Campo obrigatório")
	private String cpf;

	public Participantes() {
		// TODO Auto-generated constructor stub
	}

	public Participantes(String nome, String sobreNome, String matricula, String email, Integer idade, String curso,
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
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
