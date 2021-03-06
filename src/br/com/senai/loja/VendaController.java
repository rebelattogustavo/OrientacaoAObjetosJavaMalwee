package br.com.senai.loja;

import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;

public class VendaController {

	private Scanner tec;
	private ProdutoController produtoController;
	private PessoaController pessoaController;
	
	public VendaController () {
		tec = new Scanner(System.in);
		produtoController = new ProdutoController();
		pessoaController = new PessoaController();
	}
	
	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	}
	
	public List<Venda> listarVenda(List <Venda> vendas) {
		
		System.out.println("--- VENDAS REALIZADAS ---");
		
		System.out.printf("| %10s | %10s | %4s | %7s |\n",
				"Cliente", "Produto", "Qtd", "Valor"
			);
		
		
		for(int i = 0; i < vendas.size(); i++) {
			System.out.printf("| %10s | %10s | %4d | %7.2f |\n",
					vendas.get(i).getPessoa().getNome(),
					vendas.get(i).getProduto().getNomeDoProduto(),
					vendas.get(i).getQuantidade(),
					vendas.get(i).getValor()
					);
		}
		
		return vendas;
	}
	
	public Venda cadastrarVenda(List<Produto> produtos, List <Pessoa> pessoas) {
		
		if(produtos.isEmpty() || pessoas.isEmpty()) {
			System.out.println("Impossível realizar vendas sem PRODUTOS  ou PESSOAS cadastradas.");
			return null;
		}
		
		produtoController.listarProdutos(produtos);
		pessoaController.listarPessoas(pessoas);
		
		
		Venda venda = new Venda ();
		Produto produto = new Produto();
		Pessoa pessoa = new Pessoa ();
		
		
		System.out.print("Informe o Id do produto: ");
		int idProduto = tec.nextInt() - 1;
		
		produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
		produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
		produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
		produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());

		venda.setProduto(produto);
		
		
		System.out.print("Informe o Id da pessoa: ");
		int idPessoa = tec.nextInt() - 1;
		
		pessoa.setNome(pessoas.get(idPessoa).getNome());
		pessoa.setAltura(pessoas.get(idPessoa).getAltura());
		pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
		
		venda.setPessoa(pessoa);
		
		
		System.out.print("Informe a quantidade desejada: ");
		venda.setQuantidade(tec.nextInt());
		
		venda.setValor(produto.getValorUnitarioDoProduto() * venda.getQuantidade());
		
		return venda;
	}
	
	public void menuVenda(List <Venda> vendas, List<Produto> produtos, List <Pessoa> pessoas) {
		System.out.println("--- MENU DE VENDA ---");
		System.out.println("1) Cadastrar venda");
		System.out.println("2) Listar venda");
		System.out.println("---------------------");
		System.out.print("Informe a opçăo desejada: ");
		
		int opcao = tec.nextInt();
		switch (opcao) {
		case 1:
			vendas.add(cadastrarVenda(produtos, pessoas));
			break;
		
		case 2:
			listarVenda(vendas);
			
		default:
			System.out.println("Opçăo inválida");
			
		}
	
	
	
	}
	
	
	
}
