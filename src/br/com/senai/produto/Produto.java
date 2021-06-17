package br.com.senai.produto;

//CLASSE
public class Produto {
	
	//ATRIBUTOS
	private String nomeDoProduto;
	private double valorUnitarioDoProduto;
	private double valorTotalDoProduto;
	private int quantidadeDoProduto;
	
	
	//CONSTRUTOR
	public Produto() {
	}
	
	public Produto(String nomeDoProduto, double valorUnitarioDoProduto, double valorTotalDoProduto,
			int quantidadeDoProduto) {
		super();
		this.nomeDoProduto = nomeDoProduto;
		this.valorUnitarioDoProduto = valorUnitarioDoProduto;
		this.valorTotalDoProduto = valorTotalDoProduto;
		this.quantidadeDoProduto = quantidadeDoProduto;
	}



	//METODOS
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	public double getValorUnitarioDoProduto() {
		return valorUnitarioDoProduto;
	}
	public void setValorUnitarioDoProduto(double valorUnitarioDoProduto) {
		this.valorUnitarioDoProduto = valorUnitarioDoProduto;
	}
	public double getValorTotalDoProduto() {
		return valorTotalDoProduto;
	}
	public void setValorTotalDoProduto(double valorTotalDoProduto) {
		this.valorTotalDoProduto = valorTotalDoProduto;
	}
	public int getQuantidadeDoProduto() {
		return quantidadeDoProduto;
	}
	public void setQuantidadeDoProduto(int quantidadeDoProduto) {
		this.quantidadeDoProduto = quantidadeDoProduto;
	}
	
	
	
}
