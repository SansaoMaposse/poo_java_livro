

import java.util.Scanner;
public class Menu {
		public static void main(String[] args) {
 
			Scanner k = new Scanner(System.in);
			char continuar = 's';
			int opcao;
			Livro[] livros= null;

			do {
				int opccao;
				System.out.println("1 - Preencher array");
				System.out.println("2 - listar Livros");
				System.out.println("3 - imprimir Livros de Mia Couto");
				System.out.println("4 - imprimir Comparacao com o sétimo objecto");
				System.out.println("5 - imprimir o número De Livros Criados Criados");
				System.out.println("6 - imprimir Livros de edicao Xitlango");
				System.out.print("Digite uma opccao do menu: ");
				opccao = k.nextInt();
				System.out
						.println("==================Bur-Hein======================Bur-Hein======================Bur-Hein======================");
				switch (opccao) {
				case 1:
					livros = MetodosDoLivro.introduzirObjecto();
					break;
				case 2:
					MetodosDoLivro.listarLivros(livros);
					;
					break;
				case 3:
						MetodosDoLivro
							.compararLivros(livros);
					
					break;
				case 4:
					MetodosDoLivro.LivrosMiaCouto(livros);
					;
					break;
				case 5:
					MetodosDoLivro.livrosCriados();;
					break;
				case 6:
					MetodosDoLivro.livrosDeEdicoesXitlango(livros);
					break;
				default:
					System.out.println("Escolha invalida.");
					break;
				}
				System.out
						.println("Digite s para continuar e outra letra para parar");
				continuar = k.next().charAt(0);
			} while (continuar == 's' || continuar == 'S');
		
	}

}
