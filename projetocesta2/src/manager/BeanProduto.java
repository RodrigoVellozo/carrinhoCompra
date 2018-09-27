package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import entity.Produto;
import persistence.ProdutoDao;

@ManagedBean(name="mb")
@RequestScoped
public class BeanProduto implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<Produto>produtos;
	
	private List<Produto>produtosSelecionados;
	
	private Produto produto;
	
	HttpSession session;
	Double total=0.;
	
	
	
	public BeanProduto() {
		produtosSelecionados = new ArrayList<>();
		produto= new Produto();
	
	}

	public List<Produto> getProdutos() {
		try {
			produtos = new ProdutoDao().findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Produto> getProdutosSelecionados() {
		return produtosSelecionados;
	}

	public void setProdutosSelecionados(List<Produto> produtosSelecionados) {
		this.produtosSelecionados = produtosSelecionados;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public void adicionar() {
		FacesContext fc = FacesContext.getCurrentInstance();
		if (produtosSelecionados==null) {
			produtosSelecionados= new ArrayList<>();
		}
		session= (HttpSession)fc.getExternalContext().getSession(true);
		if (session.getAttribute("lista")!=null) {
			this.produtosSelecionados= (List<Produto>)session.getAttribute("lista");
		}
		produtosSelecionados.add(this.produto);
		fc.addMessage(null, new FacesMessage("Lista:"+produtosSelecionados.toString()));
		
	}
	
		
	public void carrega() {
		FacesContext fc =FacesContext.getCurrentInstance();
		if (produtosSelecionados==null) {
			 produtosSelecionados = new ArrayList<Produto>();
		}
      session =  (HttpSession) fc.getExternalContext().getSession(true);
      
 	 if (session.getAttribute("lista")!=null) {
		   this.produtosSelecionados = (List<Produto>) session.getAttribute("lista");
		 }
 	 
 	 
 	 
	}
	
	
	public void limpar() {
		FacesContext fc =FacesContext.getCurrentInstance();
		 this.produtosSelecionados.clear();
		 session =  (HttpSession) fc.getExternalContext().getSession(true);
		 session.setAttribute("lista",null);
	}
	

	
	

}
