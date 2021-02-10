package br.dev.rvz;

/**
* responsável pela interação de usuário e inserção de jogos
* @author Rodrigo.vaz
* */
public class SistemaPrincipal {

    private boolean run;
    private CatalagoDeJogo jogo;
    private int opcoes;

    public SistemaPrincipal() {
        this.run = true;
        this.jogo = new CatalagoDeJogo();
    }
}
