package model;

public class Secretaria extends Funcionario{
	private long matricula;

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	@Override
	public void admissao() {
		// TODO Auto-generated method stub
		System.out.println("15/07/2003");
	}

	@Override
	public void demissao() {
		// TODO Auto-generated method stub
		System.out.println("15/07/2025");
	}
	
	
}
