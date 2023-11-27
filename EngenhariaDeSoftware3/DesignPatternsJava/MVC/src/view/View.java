package view;

import java.util.List;

import model.Filme;

import controller.Ingresso;

public class View implements Observer {

    private Ingresso i;
    private List listaFilmes;

    public void setI(Ingresso ingresso) {
        i = ingresso;
    }

    public void update(List l) {
        listaFilmes = l;
        i.emitirIngresso();

    }

    public void imprimirDadosFilme() {
        if (!listaFilmes.isEmpty()) {
            for (Object j : listaFilmes) {
                Filme f = (Filme) j;
                System.out.println(f.getTitulo() + " " + f.getAno());
            }
        }

    }

    public void imprimirTipoMeia() {
        System.out.println("\nTipo: meia");
        System.out.println("CPF do portador: xxx.xxx.xxx-xx");
    }

}