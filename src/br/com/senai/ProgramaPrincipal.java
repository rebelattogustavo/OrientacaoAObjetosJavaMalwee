package br.com.senai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.senai.loja.ProdutoController;
import br.com.senai.loja.Venda;
import br.com.senai.loja.VendaController;
import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<Produto>();
		List<Venda> vendas = new ArrayList <Venda> ();
		
		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		VendaController vendaController = new VendaController();
		boolean sair = false;
	
		
		do {
			System.out.println("--- MENU PRICIPAL ---");
			System.out.println("1) Menu pessoa");
			System.out.println("2) Menu produto");
			System.out.println("3) Menu venda");
			System.out.println("0) Sair");
			System.out.println("---------------------");
			System.out.print("Informe a opção que deseja: ");
			
			int opcao = tec.nextInt();  			
			switch(opcao) {
			case 1:
				pessoaController.menuPessoa(pessoas);
				break;
			
			case 2:
				produtoController.menuProduto(produtos);
				break;
			
			case 3:
				vendaController.menuVenda(vendas, produtos, pessoas);
				break;
				
			case 0:
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
