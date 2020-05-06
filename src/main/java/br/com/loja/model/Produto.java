package br.com.loja.model;

import java.math.BigDecimal;

import br.com.loja.abstracts.AbstractJSF;
import br.com.loja.enums.Categoria;

public class Produto extends AbstractJSF {
	
	private String nome;
	private String descricao;
	private BigDecimal valor;
	private Fornecedor fornecedor;
	private Categoria categoria;
	
	public Produto(String nome, String descricao, BigDecimal valor, Fornecedor fornecedor, Categoria categoria) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.fornecedor = fornecedor;
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [nome=");
		builder.append(nome);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", fornecedor=");
		builder.append(fornecedor);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append("]");
		return builder.toString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
