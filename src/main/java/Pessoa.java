public class Pessoa {
	
//*visibilidade de atributo*//
	
	private String nome;
	private int idade;
	
	public Pessoa(String n) {
		this.idade = 0;
		this.nome = n;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		
		if(this.idade > 18) {
			this.nome = nome;	
		} else {
			System.out.println("Só é possível definir um nome ao possuir mais de 18 anos de idade.");
		}
		
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
