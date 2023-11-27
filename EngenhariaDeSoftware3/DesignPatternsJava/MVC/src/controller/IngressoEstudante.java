package controller;

import model.Catalogo;
import view.View;

public class IngressoEstudante implements Ingresso {

    private View v;
    private Catalogo c;

    public void setV(View view) {
        v = view;
    }

    public void emitirIngresso() {
        v.imprimirDadosFilme();
        v.imprimirTipoMeia();
    }

}
