
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		// int idade = 18;
		int idade = 17;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("você tem mais de 18 anos");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("você não tem 18, mas pode entrar pois está acompanhado");
			} else {
				System.out.println("você não pode entrar");

			}
		}

	}
}
