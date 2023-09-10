import java.util.ArrayList;

public class Festa implements Observador {

    @Override
    public void update(ArrayList<String> convidados) {
        System.out.println("Fui convidado.");
        System.out.println("Convidados atuais: " + convidados);
    }
    
}
