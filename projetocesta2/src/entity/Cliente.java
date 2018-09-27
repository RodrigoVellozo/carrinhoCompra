package entity;

import java.io.Serializable;

public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer idCliete;
	private String nome;
	private String email;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String numero;
	
	public Cliente() {
		super();
	}
	public Cliente(Integer idCliete, String nome, String email, String logradouro, String bairro, String cidade,
			String estado, String cep, String numero) {
		super();
		this.idCliete = idCliete;
		this.nome = nome;
		this.email = email;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Cliente [idCliete=" + idCliete + ", nome=" + nome + ", email=" + email + ", logradouro=" + logradouro
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", numero="
				+ numero + "]";
	}
	public Integer getIdCliete() {
		return idCliete;
	}
	public void setIdCliete(Integer idCliete) {
		this.idCliete = idCliete;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
