package br.com.loja.controller;

import java.util.List;

import br.com.loja.business.ProdutoBusiness;
import br.com.loja.model.Produto;

public class ProdutoController {
	
	private ProdutoBusiness produtoBusiness;
	
	public ProdutoController() {
		produtoBusiness = new ProdutoBusiness();
	}

	public void salvar(Produto objeto) {
		getProdutoBusiness().salvar(objeto);  
	}

	public void excluir(Produto objeto) {
		getProdutoBusiness().excluir(objeto);
	}

	public List<Produto> filtrar(Produto objeto) { return null; }

	public List<Produto> filtrarTodos() { return null; }

	public Produto filtrarPorId(Long id) { return null; }
	
	public ProdutoBusiness getProdutoBusiness() {
		return produtoBusiness;
	}

}
