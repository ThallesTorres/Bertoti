import controller.IngressoEstudante;
import view.View;
import model.Catalogo;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Cria uma instância da View para exibir informações sobre os filmes
        View view = new View();

        // Registra a View como um observador do catálogo, para receber notificações
        // sobre mudanças nos filmes
        Catalogo.getInstance().registerObserver(view);

        // Cria uma instância de IngressoEstudante, que será usada para emitir ingressos
        // com desconto
        IngressoEstudante ingressoEstudante = new IngressoEstudante();

        // Configura a View e IngressoEstudante para trabalharem juntos
        view.setI(ingressoEstudante);
        ingressoEstudante.setV(view);

        // Cria uma instância da fachada do catálogo
        CatalogoFacade catalogoFacade = new CatalogoFacade();

        // Cria um scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Loop para interação com o usuário
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar filme");
            System.out.println("2. Buscar filme por título");
            System.out.println("3. Sair");

            // Lê a escolha do usuário
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    // Adiciona um filme ao catálogo
                    System.out.println("Digite o título do filme:");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o ano de lançamento do filme:");
                    int ano = scanner.nextInt();
                    catalogoFacade.adicionarFilme(titulo, ano);
                    break;
                case 2:
                    // Busca um filme por título
                    System.out.println("Digite o título do filme a ser buscado:");
                    String tituloBusca = scanner.nextLine();
                    catalogoFacade.buscarFilmePorTitulo(tituloBusca);
                    break;
                case 3:
                    // Encerra o programa
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}