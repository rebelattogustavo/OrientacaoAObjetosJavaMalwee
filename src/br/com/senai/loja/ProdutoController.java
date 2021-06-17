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
		produto.setNomeDoProduto(tec.next());
		
		System.out.print("Informe o valor unitário do produto: R$");
		produto.setValorUnitarioDoProduto(tec.nextDouble());
		
		System.out.print("Informe a quantidade desejada: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		
		produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());
		
		return produto;
			
	}
	
	public List<Produto> listarProdutos(List<Produto> produtos){
		System.out.println("---PRODUTOS CADASTRADOS ---");
		
		System.out.printf("| %2s | %10s | %10s | %10s | %9s | \n","Id", "Nome", "Valor Unitário", 
				"Valor Total", "Quantidade");
		
		for(int i = 0; i < produtos.size(); i++){
			System.out.printf("| %2d | %10s | %14.2f | %11.2f | %10d |  \n",
			i,
			produtos.get(i).getNomeDoProduto(),
			produtos.get(i).getValorUnitarioDoProduto(),
			produtos.get(i).getValorTotalDoProduto(),
			produtos.get(i).getQuantidadeDoProduto());
			
		}			
		return produtos;
	}

public List<Produto> editarProduto(List<Produto> produtos) {
	Produto produto = new Produto();
	listarProdutos(produtos);	
	
	System.out.print("Informe o Id do produto para editar: ");
	int idProduto = tec.nextInt();
	
	
	System.out.println("1) Nome do produto");
	System.out.println("2) Quantidade do produto");
	System.out.println("3) Valor unitário do produto");
	System.out.print("Informe o campo para ser editado: ");
	int opcao = tec.nextInt();
	
	switch(opcao) {
	case 1:
		System.out.println("--- EDITAR O NOME DO PRODUTO ---");
		System.out.print("Informe o novo nome do produto: ");
		produto.setNomeDoProduto(tec.next());
		
		produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
		produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
		produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
		
		produtos.set(idProduto, produto);
		
		break;
	
	case 2:
		System.out.println("--- EDITAR QUANTIDADE DE PRODUTO ---");
		System.out.print("Informe a nova quantidade do produto: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		
		produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
		produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
		produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
		
		produtos.set(idProduto, produto);
		
		produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());

		
		break;
		
	case 3:
		System.out.println("--- EDITAR O VALOR UNITÁRIO DO PRODUTO ---");
		System.out.print("Informe o novo valor unitário do produto: R$");
		produto.setValorUnitarioDoProduto(tec.nextDouble());
		
		produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
		produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
		produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
		
		produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());


		
		produtos.set(idProduto, produto);
		
		break;
	
		default:
		System.out.println("Opção inválida");
		
		break;
		
	}
	
	
	return produtos;
}
	
}
