import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // pode ser observado
        Publicador convidados = new Publicador();
        // pode observar
        Festa festa = new Festa();

        convidados.adicionarObservador(festa);
        convidados.adicionarConvidado("João");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nAdicionar convidado: ");
            String nome = sc.nextLine();
            convidados.adicionarConvidado(nome);
        }
    }
}
