package br.dev.rvz;

/**
 * modelo de jogo de tabuleiro
 * @author Rodrigo.vaz
 * */
public class JogoDeTabuleiro extends Jogo {

    private int quantidadeDePeca;

    public JogoDeTabuleiro() {
    }

    public JogoDeTabuleiro(String nome, int quantidadeDeJogador, int horaDeJogo, TipoDeJogo tipoDeJogo, int quantidadeDePeca) {
        super(nome, quantidadeDeJogador, horaDeJogo, tipoDeJogo);
        this.quantidadeDePeca = quantidadeDePeca;
    }

    public int getQuantidadeDePeca() {
        return quantidadeDePeca;
    }

    public void setQuantidadeDePeca(int quantidadeDePeca) {
        this.quantidadeDePeca = quantidadeDePeca;
    }
}
