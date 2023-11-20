import java.util.ArrayList;
import java.util.List;

// Composite
class Pasta implements Elemento {
    private String nome;
    private List<Elemento> elementos = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void addElemento(Elemento e) {
        elementos.add(e);
    }

    public void removeElemento(Elemento e) {
        elementos.remove(e);
    }

    @Override
    public void exibir() {
        System.out.println("Pasta: " + nome);
        for (Elemento e : elementos) {
            e.exibir();
        }
    }
}