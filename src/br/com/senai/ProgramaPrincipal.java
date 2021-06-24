package br.com.senai;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.loja.ProdutoController;
import br.com.senai.loja.Venda;
import br.com.senai.loja.VendaController;
import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
public class ProgramaPrincipal {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<Produto>();
		List<Venda> vendas = new ArrayList <Venda> ();
		
		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		VendaController vendaController = new VendaController();
		boolean sair = false;
		
		
		
		
		do {
			pessoaController.menu();
			
			int opcao = pessoaController.leOpcao();  			
			switch(opcao) {
			case 1:
				pessoas.add(pessoaController.cadastrarPessoa());
				break;
			
			case 2:
				pessoaController.listarPessoas(pessoas);
				break;
			
			case 3:
				produtos.add(produtoController.cadastrarProduto());
				break;
				
			case 4:
				produtoController.listarProdutos(produtos);
				break;
		
			case 5:
				produtoController.editarProduto(produtos);
				break;
				
			case 6:
				produtoController.excluirProduto(produtos);
				break;
				
			case 7:
				pessoaController.editarPessoa(pessoas);
				break;
				
			case 8:
				pessoaController.excluirPessoa(pessoas);
				break;
				
			case 9:
				vendas.add(vendaController.cadastrarVenda(produtos, pessoas));
				break;
				
			case 10:
				vendaController.listarVenda(vendas);
				break;
				
			case 11:
				sair = true;
				break;
		
				
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}while(!sair);
		
		System.out.println("Sistema finalizado!");
	}

}
