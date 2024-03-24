
public class MinhaAplicacao {

	public static void main(String[] args) {
		
		Pessoa pHug = new Pessoa("Huguinho");
		Professor pWag = new Professor("Wagner");
		
		pHug.setIdade(5);
		pHug.setNome("Huguinho2"); //Como Huguinho só tem 5 anos, seu nome não mudará//
		pWag.setIdade(40);
		pWag.setNome("Wagner França"); //Como Wagner tem mais de 18, seu nome mudará//
		System.out.println(pHug.getNome());
		System.out.println(pWag.getNome());

	}

}
