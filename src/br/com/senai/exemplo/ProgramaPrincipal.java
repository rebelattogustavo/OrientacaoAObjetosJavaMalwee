package br.com.senai.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();
		
		
		pessoa1.setNome("Gustavo");
		pessoa1.setAnoDeNascimento(2004);
		pessoa1.setSexo("M");
		
		pessoa2.setNome("Mayara");
		pessoa2.setAnoDeNascimento(2005);
		pessoa2.setSexo("F");
		
		pessoa3.setNome("Lívia");
		pessoa3.setAnoDeNascimento(2004);
		pessoa3.setSexo("F");
		
		pessoa4.setNome("Anthony");
		pessoa4.setAnoDeNascimento(2003);
		pessoa4.setSexo("M");
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		System.out.println("--- PESSOA com FOR ---");
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i));
			System.out.println("############################");
		}
		
		System.out.println("--- PESSOAS com ForEach Lambda ---");
		pessoas.forEach(aluno -> {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getAnoDeNascimento());
			System.out.println(aluno.getSexo());
			System.out.println("****************************");
		});
		
		
		
		System.out.println("--- PESSOAS CADASTRADAS ---");
		for(Pessoa people : pessoas) {
			System.out.println(people);
			System.out.println("-------------------------");
			
			}
		Scanner tec = new Scanner(System.in);
		MetodoController metodoController = new MetodoController();

		
		System.out.println("--- TABUADA ---");
		metodoController.multiplicar();
		
		
		System.out.println("--- SOMA DE DOIS VALORES ---");
		System.out.println("A soma dá: " + metodoController.somar());
	
		System.out.println("--- SUBTRAÇÃO DE VALORES por parâmetro ---");
		System.out.print("Informe o primeiro valor: ");
		int valor1 = tec.nextInt();
		System.out.print("Informe o segundo valor: ");
		int valor2 = tec.nextInt();
		
		System.out.println("A subtração dá: " 
		+metodoController.subtrair(valor1, valor2));
		
	}

}
