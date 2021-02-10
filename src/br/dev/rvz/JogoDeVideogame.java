package br.dev.rvz;

/**
 * modelo de jogo de video game
 * */
public class JogoDeVideogame extends Jogo {

    private boolean online;

    public JogoDeVideogame() {
    }

    public JogoDeVideogame(String nome, int quantidadeDeJogador, int horaDeJogo, TipoDeJogo tipoDeJogo, boolean online) {
        super(nome, quantidadeDeJogador, horaDeJogo, tipoDeJogo);
        this.online = online;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    @Override
    public String toString() {
        return super.toString() + " JogoDeVideogame{" +
                "online=" + online +
                '}';
    }
}
