package model;

public class Professor extends Funcionario{
	private String materia;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public void admissao() {
		// TODO Auto-generated method stub
		System.out.println("07/01/1998");
	}

	@Override
	public void demissao() {
		// TODO Auto-generated method stub
		System.out.println("07/01/2020");
	}
	
	
}
