package model;

public class Direcao extends Funcionario{
	private String cargos;

	public String getCargos() {
		return cargos;
	}

	public void setCargos(String cargos) {
		this.cargos = cargos;
	}

	@Override
	public void admissao() {
		// TODO Auto-generated method stub
		System.out.println("04/10/2008");
	}

	@Override
	public void demissao() {
		// TODO Auto-generated method stub
		System.out.println("04/10/2032");
	}
	
}
