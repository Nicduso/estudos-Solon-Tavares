package school;

public class Admin {

	private String nome;
	private int matricula;
	private Double n1, n2, n3, n4;

	public void media() {
		
		Double media = (getN1() + getN2() + getN3() + getN4()) / 4;
		
		System.out.println("Aluno: "+getNome());
		System.out.println("Matrícula: "+getMatricula());
		System.out.println("Média: "+media);
		
		if (media >= 6) {
			System.out.println("Você está aprovado!");
		} else {
			System.out.println("Você está reprovado. Estude mais na próxima.");
		}
		
	}

	public Double getN4() {
		return n4;
	}

	public void setN4(Double n4) {
		this.n4 = n4;
	}

	public Double getN3() {
		return n3;
	}

	public void setN3(Double n3) {
		this.n3 = n3;
	}

	public Double getN2() {
		return n2;
	}

	public void setN2(Double n2) {
		this.n2 = n2;
	}

	public Double getN1() {
		return n1;
	}

	public void setN1(Double n1) {
		this.n1 = n1;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
