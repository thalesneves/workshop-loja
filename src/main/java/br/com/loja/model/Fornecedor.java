package br.com.loja.model;

import br.com.loja.abstracts.AbstractJSF;

public class Fornecedor extends AbstractJSF {
	
	private String razaoSocial;
	private String cnpj;
	private Endereco endereco;
	
	public Fornecedor(String razaoSocial, String cnpj, Endereco endereco) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fornecedor [razaoSocial=");
		builder.append(razaoSocial);
		builder.append(", cnpj=");
		builder.append(cnpj);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
