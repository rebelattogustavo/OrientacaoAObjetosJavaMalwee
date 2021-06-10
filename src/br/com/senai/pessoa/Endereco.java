package br.com.senai.pessoa;

public class Endereco extends Cidade {

	private String nomeDoBairro;
	private String nomeDaRua;
	private int numeroDaCasa;
	private String complemento;
	public String getNomeDoBairro() {
		return nomeDoBairro;
	}
	public void setNomeDoBairro(String nomeDoBairro) {
		this.nomeDoBairro = nomeDoBairro;
	}
	public String getNomeDaRua() {
		return nomeDaRua;
	}
	public void setNomeDaRua(String nomeDaRua) {
		this.nomeDaRua = nomeDaRua;
	}
	public int getNumeroDaCasa() {
		return numeroDaCasa;
	}
	public void setNumeroDaCasa(int numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	

}