package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Produto;

public class ProdutoDao extends Dao{
	
	
	public List<Produto> findAll()throws Exception{
		open();
		stmt= con.prepareStatement("select * from vitrine");
		rs=stmt.executeQuery();
		List<Produto>lista= new ArrayList<>();
		while (rs.next()) {
			lista.add(new Produto(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4)));
		}
		close();
		return lista;
	}
	
	
	
	
	public static void main(String[] args) {
		try {
			new ProdutoDao().findAll().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
