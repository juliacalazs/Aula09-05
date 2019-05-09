package view;

import model.Direcao;
import model.Professor;
import model.Secretaria;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Professor p = new Professor();
			Secretaria s = new Secretaria();
			Direcao d = new Direcao(); 
			
			p.setNome("Carlos");
			p.setEndereco("Rua Noite");
			p.setBairro("Itaquera");
			p.setCep(12456946);
			p.setCidade("São Paulo");
			p.setEstado("São Paulo");
			p.setTelefone(25684562);
			p.setCelular(987546548);
			p.setMateria("Matemática");
			System.out.println("Nome: "+ p.getNome());
			System.out.println("Endereço: "+ p.getEndereco());
			System.out.println("Bairro: "+ p.getBairro());
			System.out.println("CEP: "+ p.getCep());
			System.out.println("Cidade: "+ p.getCidade());
			System.out.println("Estado: "+ p.getEstado());
			System.out.println("Telefone: "+ p.getTelefone());
			System.out.println("Celular: "+ p.getCelular());
			System.out.println("Materia: "+ p.getMateria());
			p.admissao();
			p.demissao();
			System.out.println();
			System.out.println();
			
			s.setNome("Eva");
			s.setEndereco("Rua Noite");
			s.setBairro("Quera Luz");
			s.setCep(80056946);
			s.setCidade("Rio de Janeiro");
			s.setEstado("Rio de Janeiro");
			s.setTelefone(20874562);
			s.setCelular(987545410);
			s.setMatricula(10201);
			System.out.println("Nome: "+ s.getNome());
			System.out.println("Endereço: "+ s.getEndereco());
			System.out.println("Bairro: "+ s.getBairro());
			System.out.println("CEP: "+ s.getCep());
			System.out.println("Cidade: "+ s.getCidade());
			System.out.println("Estado: "+ s.getEstado());
			System.out.println("Telefone: "+ s.getTelefone());
			System.out.println("Celular: "+ s.getCelular());
			System.out.println("Matricula: "+ s.getMatricula());
			s.admissao();
			s.demissao();
			System.out.println();
			System.out.println();
			
			d.setNome("Henrique");
			d.setEndereco("Rua Tarde");
			d.setBairro("Guaianazes");
			d.setCep(82457826);
			d.setCidade("São Paulo");
			d.setEstado("São Paulo");
			d.setTelefone(29627562);
			d.setCelular(987532448);
			d.setCargos("Cordenador");
			System.out.println("Nome: "+ d.getNome());
			System.out.println("Endereço: "+ d.getEndereco());
			System.out.println("Bairro: "+ d.getBairro());
			System.out.println("CEP: "+ d.getCep());
			System.out.println("Cidade: "+ d.getCidade());
			System.out.println("Estado: "+ d.getEstado());
			System.out.println("Telefone: "+ d.getTelefone());
			System.out.println("Celular: "+ d.getCelular());
			System.out.println("Cargo: "+ d.getCargos());
			d.admissao();
			d.demissao();
			
	}

}
