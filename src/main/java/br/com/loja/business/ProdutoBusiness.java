package br.com.loja.business;

import java.util.List;

import br.com.loja.dao.ProdutoDAO;
import br.com.loja.interfaces.Crud;
import br.com.loja.model.Produto;

public class ProdutoBusiness implements Crud<Produto> {
	
	private ProdutoDAO produtoDAO;
	
	public ProdutoBusiness() {
		produtoDAO = new ProdutoDAO();
	}

	@Override
	public void salvar(Produto objeto) { }

	@Override
	public void excluir(Produto objeto) { }

	@Override
	public List<Produto> filtrar(Produto objeto) { return null; }

	@Override
	public List<Produto> filtrarTodos() { return null; }

	@Override
	public Produto filtrarPorId(Long id) { return null; }

	public ProdutoDAO getProdutoDAO() {
		return produtoDAO;
	}

}
