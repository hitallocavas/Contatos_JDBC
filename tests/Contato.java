package tests;

import java.util.Calendar;

public class Contato {
	private String cpf;
	private String name;
	private String endereco;
	private String email;
	private String dataNascimento;
	
	public Contato(String cpf, String name, String endereco, String email, String dataNascimento){
		this.cpf = cpf;
		this.name = name;
		this.endereco = endereco;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}
	
	public String getId() {
		return cpf;
	}
	public void setId(String id) {
		this.cpf = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	

}
