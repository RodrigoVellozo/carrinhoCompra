package entity;

import java.io.Serializable;

public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer idProduto;
	private String nome;
	private String imagem;
	private Double preco=0.;
	
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produto(Integer idProduto, String nome,Double preco, String imagem) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.imagem = imagem;
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", imagem=" + imagem + ", preco=" + preco + "]";
	}
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
}
