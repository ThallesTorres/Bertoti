import model.Catalogo;

public class CatalogoFacade {

    private Catalogo catalogo;

    public CatalogoFacade() {
        this.catalogo = Catalogo.getInstance();
    }

    public void adicionarFilme(String titulo, int ano) {
        catalogo.adicionarFilme(titulo, ano);
    }

    public void buscarFilmePorTitulo(String titulo) {
        catalogo.buscarFilmePorTitulo(titulo);
    }
}