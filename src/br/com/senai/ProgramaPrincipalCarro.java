package br.com.senai;

public class ProgramaPrincipalCarro {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		Carro carro5 = new Carro();
		
		carro1.setMarca("Nissan");
		carro1.setModelo("Skyline GTR-R34");
		carro1.setAno(1998);
		carro1.setQtdPortas(2);
		
		System.out.println("------------------------");
		System.out.println("--- CARRO 1 ---");
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println("Ano do carro: " + carro1.getAno());
		System.out.println("Quantidade de portas: " + carro1.getQtdPortas());

		
		carro2.setMarca("Toyota");
		carro2.setModelo("Supra MK4");
		carro2.setAno(1995);
		carro2.setQtdPortas(2);
		
		System.out.println("--- CARRO 2 ---");
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println("Ano do carro: " + carro2.getAno());
		System.out.println("Quantidade de portas: " + carro2.getQtdPortas());
		
		carro3.setMarca("Dodge");
		carro3.setModelo("Challenger SRT Demon");
		carro3.setAno(2018);
		carro3.setQtdPortas(2);
		
		System.out.println("--- CARRO 3 ---");
		System.out.println(carro3.getMarca());
		System.out.println(carro3.getModelo());
		System.out.println("Ano do carro: " + carro3.getAno());
		System.out.println("Quantidade de portas: " + carro3.getQtdPortas());
		
		carro4.setMarca("Ford");
		carro4.setModelo("Mustang GT-500");
		carro4.setAno(2013);
		carro4.setQtdPortas(2);
		
		System.out.println("--- CARRO 4 ---");
		System.out.println(carro4.getMarca());
		System.out.println(carro4.getModelo());
		System.out.println("Ano do carro: " + carro4.getAno());
		System.out.println("Quantidade de portas: " + carro4.getQtdPortas());
		
		carro5.setMarca("Chevrolet");
		carro5.setModelo("Corsa");
		carro5.setAno(2010);
		carro5.setQtdPortas(4);
		
		System.out.println("--- CARRO 5 ---");
		System.out.println(carro5.getMarca());
		System.out.println(carro5.getModelo());
		System.out.println("Ano do carro: " + carro5.getAno());
		System.out.println("Quantidade de portas: " + carro5.getQtdPortas());
		System.out.println("------------------------");
	}

}
