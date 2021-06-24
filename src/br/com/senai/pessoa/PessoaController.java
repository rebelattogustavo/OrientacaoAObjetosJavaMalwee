package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

import br.com.senai.produto.Produto;

public class PessoaController {

	private Scanner tec;
	
	
	public PessoaController() {
		tec = new Scanner(System.in);
	}
	
	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	}
	

	public void menu() {
		System.out.println("\n--- MENU ---");
		System.out.println("1) Menu pessoa");
		System.out.println("2) Menu produto");
		System.out.println("3) Menu venda");
		System.out.println("4) Listar produtos");
		System.out.println("5) Editar produto");
		System.out.println("6) Excluir produto");
		System.out.println("7) Editar pessoa");
		System.out.println("8) Excluir pessoa");
		System.out.println("9) Cadastrar vendas");
		System.out.println("10) Listar venda");
		System.out.println("11) Sair do sistema");
		System.out.println("-------------------");
	}
	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();
		
		System.out.println("--- CADASTRAR PESSOA ---");
		System.out.print("Informe  nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine());
		
		System.out.print("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());
		
		System.out.print("Informe a altura: ");
		pessoa.setAltura(tec.nextDouble());
		
		System.out.print("Informe o país: ");
		tec.nextLine();
		pessoa.setNomeDoPais(tec.nextLine());
		
		System.out.print("Informe a sigla do país: ");
		pessoa.setSiglaDoPais(tec.next());
		
		System.out.print("Informe o nome do estado: ");
		tec.nextLine();
		pessoa.setNomeDoEstado(tec.nextLine());
		
		System.out.print("Informe a sigla do estado: ");
		
		pessoa.setSiglaDoEstado(tec.next());
		
		System.out.print("Informe o nome da cidade: ");
		tec.nextLine();
		pessoa.setNomeDaCidade(tec.nextLine());
		
		System.out.print("Informe o bairro: ");
		pessoa.setNomeDoBairro(tec.nextLine());
		
		System.out.print("Informe o nome da rua: ");
		pessoa.setNomeDaRua(tec.nextLine());
		
		System.out.print("Informe o número da casa: ");
		pessoa.setNumeroDaCasa(tec.nextInt());
		
		System.out.print("Informe o complemento: ");
		pessoa.setComplemento(tec.next());
		
		return pessoa;
	}
	public List<Pessoa> listarPessoas(List<Pessoa> pessoas){
		if(pessoas.isEmpty()) {
			System.out.println("Não possui dados para listar.");
			return null;
		}
		
		System.out.println("--- PESSOAS CADASTRADAS ---");
		
		System.out.printf("| %2s | %20s | %4s | %5s | %6s | %10s | %15s | %20s | %15s | %20s | %20s | %20s | %15s | %10s | \n", "Id", "Nome", "Ano", "Idade", "Altura"
				, "País", "Sigla do País", "Nome do estado", "Sigla do estado", "Nome da cidade", "Nome do bairro", "Nome da rua", "Número da casa", "Complemento");
		
		for(int i = 0; i < pessoas.size(); i++){
		System.out.printf("| %2d | %20s | %4d | %5d | %6.2f | %10s | %15s | %20s | %15s | %20s | %20s | %20s | %15d | %11s |  \n",
				i + 1,
				pessoas.get(i).getNome(),
				pessoas.get(i).getAnoDeNascimento(),
				pessoas.get(i).getIdade(),
				pessoas.get(i).getAltura(),
				pessoas.get(i).getNomeDoPais(),
				pessoas.get(i).getSiglaDoPais(),
				pessoas.get(i).getNomeDoEstado(),
				pessoas.get(i).getSiglaDoEstado(),
				pessoas.get(i).getNomeDaCidade(),
				pessoas.get(i).getNomeDoBairro(),
				pessoas.get(i).getNomeDaRua(),
				pessoas.get(i).getNumeroDaCasa(),
				pessoas.get(i).getComplemento());
		}
		return pessoas;
	}
	
	public List<Pessoa> editarPessoa(List<Pessoa> pessoas) {
		
		Pessoa pessoa = new Pessoa();
		listarPessoas(pessoas);	
		
		if(pessoas.isEmpty()) {
			return null;
		}
		
		System.out.print("Informe o Id do produto para editar: ");
		int idPessoa = tec.nextInt() - 1;
		
		
		System.out.println("|1) Nome da pessoa");
		System.out.println("|2) Ano de nascimento");
		System.out.println("|3) Altura");
		System.out.println("|4) Nome do País");
		System.out.println("|5) Sigla do país");
		System.out.println("|6) Nome do estado");
		System.out.println("|7) Sigla do estado");
		System.out.println("|8) Nome da cidade");
		System.out.println("|9) Nome do Bairro");
		System.out.println("|10) Nome da rua");
		System.out.println("|11) Número da casa");
		System.out.println("|12) Complemento|");
		System.out.print("Informe o campo para ser editado: ");
		int opcao = tec.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("--- EDITAR O NOME DA PESSOA ---");
			System.out.print("Informe o novo nome: ");
			tec.nextLine();
			pessoa.setNome(tec.nextLine());
			
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setSiglaDoEstado(pessoas.get(idPessoa).getSiglaDoEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 2:
			System.out.println("--- EDITAR O ANO DE NASCIMENTO ---");
			System.out.print("Informe o novo ano de nascimento: ");
			pessoa.setAnoDeNascimento(tec.nextInt());
			
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setSiglaDoEstado(pessoas.get(idPessoa).getSiglaDoEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			
			pessoa.setAnoDeNascimento(2021 - pessoa.getAnoDeNascimento());

			
			pessoas.set(idPessoa, pessoa);

			
			break;
			
		case 3:
			System.out.println("--- EDITAR A ALTURA ---");
			System.out.print("Informe a nova altura: ");
			pessoa.setAltura(tec.nextDouble());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setSiglaDoEstado(pessoas.get(idPessoa).getSiglaDoEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
		
		case 4:
			System.out.println("--- EDITAR O PAÍS ---");
			System.out.print("Informe o novo país: ");
			tec.nextLine();
			pessoa.setNomeDoPais(tec.nextLine());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setSiglaDoEstado(pessoas.get(idPessoa).getSiglaDoEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			
			pessoas.set(idPessoa, pessoa);
			
			
			break;
			
		case 5:
			System.out.println("--- EDITAR A SIGLA ---");
			System.out.print("Informe a nova sigla: ");
			pessoa.setSiglaDoPais(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setSiglaDoEstado(pessoas.get(idPessoa).getSiglaDoEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			
			pessoas.set(idPessoa, pessoa);
			break;
			
		case 6:
			System.out.println("--- EDITAR O ESTADO ---");
			System.out.print("Informe o novo estado: ");
			tec.nextLine();
			pessoa.setNomeDoEstado(tec.nextLine());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setSiglaDoEstado(pessoas.get(idPessoa).getSiglaDoEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
		
		case 7:
			System.out.println("--- EDITAR A SIGLA DO ESTADO ---");
			System.out.print("Informe a nova sigla: ");
			pessoa.setSiglaDoEstado(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 8:
			System.out.println("--- EDITAR A CIDADE ---");
			System.out.print("Informe a nova cidade: ");
			tec.nextLine();
			pessoa.setNomeDoBairro(tec.nextLine());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setSiglaDoEstado(pessoas.get(idPessoa).getSiglaDoEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			
			pessoas.set(idPessoa, pessoa);
			
			
			break;
			
		case 9:
			System.out.println("--- EDITAR O BAIRRO ---");
			System.out.print("Informe o novo bairro: ");
			tec.nextLine();
			pessoa.setNomeDoBairro(tec.nextLine());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setSiglaDoEstado(pessoas.get(idPessoa).getSiglaDoEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			
			pessoas.set(idPessoa, pessoa);
			
			
			break;
			
		case 10:
			System.out.println("--- EDITAR O NOME DA RUA ---");
			System.out.print("Informe a nova rua: ");
			tec.nextLine();
			pessoa.setNomeDaRua(tec.nextLine());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setSiglaDoEstado(pessoas.get(idPessoa).getSiglaDoEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 11:
			System.out.println("--- EDITAR O NÚMERO DA CASA ---");
			System.out.print("Informe o novo número: ");
			pessoa.setNumeroDaCasa(tec.nextInt());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setSiglaDoEstado(pessoas.get(idPessoa).getSiglaDoEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 12:
			System.out.println("--- EDITAR O COMPLEMENTO ---");
			System.out.print("Informe o novo complemento: ");
			pessoa.setComplemento(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setSiglaDoEstado(pessoas.get(idPessoa).getSiglaDoEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNumeroDaCasa(pessoas.get(idPessoa).getNumeroDaCasa());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			
			pessoas.set(idPessoa, pessoa);
			
			
			break;
			
			default:
				System.out.println("Opção inválida");
			break;
			
		}
		
		
		return pessoas;
	} 
	
	public void excluirPessoa(List<Pessoa> pessoas) {
		
		listarPessoas(pessoas);
		
		if(pessoas.isEmpty()) {
			return;
		}
		
		System.out.println("--- EXCLUIR PRODUTO---");
		
		System.out.print("Informe o id do produto para excluir: ");
		int idProduto = tec.nextInt() - 1;
		
		if(pessoas.size() <= idProduto) {
			System.out.println("Produto não cadastrado.");
			return;
		}
		
		pessoas.remove(idProduto);
	}
	
	public void menu(List<Pessoa> pessoas) {
		System.out.println("--- MENU PESSOAS ---");
		System.out.println("1) Cadastrar pessoa");
		System.out.println("2) Listar pessoa");
		
		
	}
	
	

}
