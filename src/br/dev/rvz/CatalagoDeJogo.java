package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

/**
 * responsável pelo gerenciamento da lista de jogos
 * */
public class CatalagoDeJogo {

    List<Jogo> catalagoJogo;

    public CatalagoDeJogo() {
        this.catalagoJogo = new ArrayList<>();
    }

    public List<Jogo> getCatalagoJogo() {
        return catalagoJogo;
    }

    public void setCatalagoJogo(List<Jogo> catalagoJogo) {
        this.catalagoJogo = catalagoJogo;
    }
}
