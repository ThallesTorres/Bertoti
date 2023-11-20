import java.util.Scanner;

// Classe principal que contém o método main
public class App {
    public static void main(String[] args) {
        // Instância de Publicador (objeto que mantém a lista de convidados e notifica os observadores)
        Publicador convidados = new Publicador();
        
        // Instância de Festa (um dos observadores)
        Festa festa = new Festa();
        
        // Adicionando Festa como observador do Publicador
        convidados.adicionarObservador(festa);

        // Configurando um scanner para entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        // Loop para adicionar convidados até que o usuário decida sair
        while (true) {
            System.out.print("\nAdicionar convidado (ou 'exit' para sair): ");
            String nome = sc.next();

            // Condição para sair do loop
            if ("exit".equalsIgnoreCase(nome)) {
                break;
            }

            // Adicionando o convidado e notificando os observadores
            convidados.adicionarConvidado(nome);
        }

        // Fechando o scanner
        sc.close();
    }
}