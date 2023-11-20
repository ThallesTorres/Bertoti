import java.util.ArrayList;

// Observador que reage à adição de convidados
class Festa implements Observador {
    @Override
    public void update(ArrayList<String> convidados) {
        System.out.println("Fui convidado.");
        System.out.println("Convidados atuais: " + convidados);
    }
}