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
		
		System.out.print("Informe o valor unit�rio do produto: R$");
		produto.setValorUnitarioDoProduto(tec.nextDouble());
		
		System.out.print("Informe a quantidade desejada: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		
		produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());
		
		return produto;
			
	}
	
	public List<Produto> listarProdutos(List<Produto> produtos){
		
		if(produtos.isEmpty()) {
			System.out.println("N�o possui produtos cadastrados.");
			return null;
		}
		
		
		System.out.println("---PRODUTOS CADASTRADOS ---");
		
		System.out.printf("| %2s | %10s | %10s | %10s | %9s | \n","Id", "Nome", "Valor Unit�rio", 
				"Valor Total", "Quantidade");
		
		for(int i = 0; i < produtos.size(); i++){
			System.out.printf("| %2d | %10s | %14.2f | %11.2f | %10d |  \n",
			i + 1,
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
	
	if(produtos.isEmpty()) {
		return null;
	}
	
	System.out.print("Informe o Id do produto para editar: ");
	int idProduto = tec.nextInt() - 1;
	
	
	System.out.println("1) Nome do produto");
	System.out.println("2) Quantidade do produto");
	System.out.println("3) Valor unit�rio do produto");
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
				
		produto.setValorUnitarioDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());

		produtos.set(idProduto, produto);

		
		break;
		
	case 3:
		System.out.println("--- EDITAR O VALOR UNIT�RIO DO PRODUTO ---");
		System.out.print("Informe o novo valor unit�rio do produto: R$");
		produto.setValorUnitarioDoProduto(tec.nextDouble());
		
		produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
		produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
		produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
		
		produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());


		
		produtos.set(idProduto, produto);
		
		break;
	
		default:
			System.out.println("Op��o inv�lida");
		break;
		
	}
	
	
	return produtos;
} 

	public void excluirProduto(List<Produto> produtos) {
	
		listarProdutos(produtos);
		
		if(produtos.isEmpty()) {
			return;
		}
		
		System.out.println("--- EXCLUIR PRODUTO---");
		
		System.out.print("Informe o id do produto para excluir: ");
		int idProduto = tec.nextInt() - 1;
		
		if(produtos.size() <= idProduto) {
			System.out.println("Produto n�o cadastrado.");
			return;
		}
		
		produtos.remove(idProduto);
	}
	
	public void menuProduto(List<Produto> produtos) {
		System.out.println("1) Cadastrar produto");
		System.out.println("2) Listar produtos");
		System.out.println("3) Editar produto");
		System.out.println("4) Excluir produto");
		System.out.println("--------------------");
		System.out.print("Informe a op��o desejada: ");
		
		int opcao = tec.nextInt();
		switch(opcao) {
		case 1:
			produtos.add(cadastrarProduto());
			break;
		case 2:
			listarProdutos(produtos);
			break;
		case 3:
			editarProduto(produtos);
			break;
		case 4:
			excluirProduto(produtos);
			break;
		default:
			System.out.println("Op��o inv�lida");
		}
		
	}
	
	
}
