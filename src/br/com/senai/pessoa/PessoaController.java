package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

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
		System.out.println("1) Cadastrar pessoa");
		System.out.println("2) Listar pessoas cadastradas");
		System.out.println("9) Sair do sistema");
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
		System.out.println("--- PESSOAS CADASTRADAS ---");
		
		System.out.printf("| %20s | %4s | %5s | %6s | %10s | %15s | %20s | %15s | %20s | %20s | %20s | %15s | %10s | \n", "Nome", "Ano", "Idade", "Altura"
				, "País", "Sigla do País", "Nome do estado", "Sigla do estado", "Nome da cidade", "Nome do bairro", "Nome da rua", "Número da casa", "Complemento");
		
		for(int i = 0; i < pessoas.size(); i++){
		System.out.printf("| %20s | %4d | %5d | %6.2f | %10s | %15s | %20s | %15s | %20s | %20s | %20s | %15d | %11s |  \n",
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

	
		

}
