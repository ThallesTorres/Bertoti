package model;

import java.util.List;
import java.util.LinkedList;
import view.Observer;

public class Catalogo implements Subject {
    private static Catalogo instancia;  // Instância Singleton

    private List<Filme> filmes;
    private List<Observer> observers;

    private Catalogo() {
        filmes = new LinkedList<>();
        observers = new LinkedList<>();
    }

    public static Catalogo getInstance() {
        if (instancia == null) {
            instancia = new Catalogo();
        }
        return instancia;
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers(List encontrados) {
        for (Observer o : observers) {
            o.update(encontrados);
        }
    }

    public void addFilme(Filme f) {
        filmes.add(f);
    }

    public void buscarFilme(Filme f) {
        List<Filme> encontrados = new LinkedList<>();
        for (Filme filmeCatalogo : filmes) {
            if (filmeCatalogo.matches(f)) {
                encontrados.add(filmeCatalogo);
            }
        }
        notifyObservers(encontrados);
    }

    public void adicionarFilme(String titulo, int ano) {
        Filme filme = new Filme(titulo, ano);
        addFilme(filme);
    }

    public void buscarFilmePorTitulo(String titulo) {
        Filme filme = new Filme(titulo, 0); // O ano é ignorado na busca por título
        buscarFilme(filme);
    }
}