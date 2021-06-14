package br.com.senai.loja;

import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;
import br.com.senai.produto.Produto;
 
public class ProdutoController {

	private Scanner tec;

public ProdutoController() {
		tec = new Scanner(System.in);
	}

	public Produto cadastrarProduto() {
		Produto produto = new Produto();
		
		System.out.print("Informe nome do produto: ");
		produto.setNomeDoProduto(tec.nextLine());
		
		System.out.print("Informe o valor unitário do produto: ");
		produto.setValorDoUnitarioDoProduto(tec.nextDouble());
		
		
		System.out.print("Informe o valor total do produto: ");
		produto.setValorTotalDoProduto(tec.nextDouble());
		
		System.out.print("Informe a quantidade desejada: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		
		return produto;
			
	}
	
	public List<Produto> listarProdutos(List<Produto> produtos){
		System.out.println("---PRODUTOS CADASTRADOS ---");
		
		System.out.printf("| %15s | %15s | %15s | %10s | \n", "Nome", "Valor Unitário", 
				"Valor Total", "Quantidade");
		
		for(int i = 0; i < produtos.size(); i++){
			System.out.printf("| %15s | %15.4f | %15.4f | %10d |  \n",
			produtos.get(i).getNomeDoProduto(),
			produtos.get(i).getValorDoUnitarioDoProduto(),
			produtos.get(i).getValorTotalDoProduto(),
			produtos.get(i).getQuantidadeDoProduto());
		
		}			
		return produtos;
	}


}
