package persistence;

import java.util.List;
import java.util.UUID;

import entity.Cliente;
import entity.Produto;
import entity.Venda;

public class VendaDao extends Dao{
	
	
	private String codigoVenda="";
	
	public VendaDao() {
		codigoVenda=UUID.randomUUID().toString();
	}
	public String getCodigoVenda() {
		return codigoVenda;
	}
	public void setCodigoVenda(String codigoVenda) {
		this.codigoVenda = codigoVenda;
	}


	public void create(Venda v, Cliente c, List<Produto>lst)throws Exception {
		open();
		stmt=con.prepareStatement("insert into cliente values(null,?,?,?,?,?,?,?,?,?)");
		
		close();
	}
	
	
	public static void main(String[] args) {
		System.out.println(new VendaDao().getCodigoVenda());
	}
	
	
}
