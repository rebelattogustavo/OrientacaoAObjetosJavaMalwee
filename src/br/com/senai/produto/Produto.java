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
	
	public Produto(String nomeDoProduto, double valorDoUnitarioDoProduto, double valorTotalDoProduto,
			int quantidadeDoProduto) {
		super();
		this.nomeDoProduto = nomeDoProduto;
		this.valorUnitarioDoProduto = valorDoUnitarioDoProduto;
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
	public double getValorDoUnitarioDoProduto() {
		return valorUnitarioDoProduto;
	}
	public void setValorDoUnitarioDoProduto(double valorDoUnitarioDoProduto) {
		this.valorUnitarioDoProduto = valorDoUnitarioDoProduto;
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
