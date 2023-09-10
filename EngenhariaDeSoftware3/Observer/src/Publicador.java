import java.util.ArrayList;

public class Publicador {
    public ArrayList<String> convidados = new ArrayList<>();
    public ArrayList<Observador> observadores = new ArrayList<>();

    public void adicionarConvidado(String nome) {
        convidados.add(nome);
        notificarObservador();
    }

    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    public void notificarObservador() {
        for (Observador o : observadores) {
            o.update(convidados);
        }
    }

    public String toString() {
        return "Convidados atuais: " + convidados;
    }
}
