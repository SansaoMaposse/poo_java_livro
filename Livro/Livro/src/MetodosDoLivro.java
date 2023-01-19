import java.util.Scanner;

public class MetodosDoLivro {
	
	static Scanner k = new Scanner(System.in);

	public static Livro[] introduzirObjecto() {
		System.out.println("Capaciade");
		int capa = k.nextInt();
		Livro[] livros = new Livro[capa];
		for (int i = 0; i < livros.length; i++) {
			System.out.println("Digite o seu codigo: ");
			int codigo = k.nextInt();
			System.out.println("Digite o titulo");
			String titulo = k.next();
			System.out.println("Digite o autor ");
			String autor = k.next();
			System.out.print("Digite a edicao: ");
			String edicao = k.next();
			System.out.println("Digite o ano actual: ");
			int anoactual = k.nextInt();
			System.out.println("Digite o ano de publicacao");
			int anodepublicacao = k.nextInt();

			livros[i] = new Livro(codigo, titulo,autor,edicao, anodepublicacao, anoactual);
		}
		return livros;
	}

	public static void listarLivros(Livro[] livros) {

		for (int i = 0; i < livros.length; i++) {
			System.out.println(livros[i].toString());
		}
	}

	public static void LivrosMiaCouto(Livro[] livros) {

		for (int i = 0; i < livros.length; i++) {
			if (livros[i].getAutor().equalsIgnoreCase("Mia Couto")) {
				System.out.println("Titulo: " + livros[i].getTitulo());
				System.out.println("edicao: " + livros[i].getEdicao());
				System.out.println("Tempo de Existencia : "
						+ livros[i].calcularTempoDeExistencia() + "Ano/s");
			}
		}

	}

	public static void compararLivros(Livro[] livros) {

		Livro setimo = livros[7];
		for (int i = 0; i < livros.length; i++) {
			System.out.println(livros[i].equals(setimo));
		}
	}

	public static void livrosCriados() {
		System.out.println(Livro.objectoscriados);
	}

	public static void livrosDeEdicoesXitlango(Livro[] livros) {
		for (int i = 0; i < livros.length; i++) {
			if (livros[i].getEdicao().equalsIgnoreCase("Xitlango")) {

				livros[i].imprimir();

			}
		}
	}

}
