import java.util.ArrayList;

// Classe que mantém a lista de convidados e notifica os observadores
class Publicador {
    private ArrayList<String> convidados = new ArrayList<>();
    private ArrayList<Observador> observadores = new ArrayList<>();

    // Método para adicionar um convidado
    public void adicionarConvidado(String nome) {
        convidados.add(nome);
        notificarObservador();
    }

    // Método para adicionar um observador
    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    // Método para remover um observador
    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    // Método privado para notificar todos os observadores
    private void notificarObservador() {
        // Criar uma cópia da lista de convidados para evitar modificações externas durante a notificação
        for (Observador o : observadores) {
            o.update(new ArrayList<>(convidados));
        }
    }

    // Sobrescrevendo toString para fornecer uma representação de string dos convidados
    @Override
    public String toString() {
        return "Convidados atuais: " + convidados;
    }
}