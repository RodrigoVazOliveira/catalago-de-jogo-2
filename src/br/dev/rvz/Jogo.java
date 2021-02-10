package br.dev.rvz;

/**
 * modelo de jogo principal
 * @author Rodrigo.vaz
 * */
public class Jogo {

    private String nome;
    private String quantidadeDeJogador;
    private int horaDeJogo;
    private TipoDeJogo tipoDeJogo;

    public Jogo() {
    }

    public Jogo(String nome, String quantidadeDeJogador, int horaDeJogo, TipoDeJogo tipoDeJogo) {
        this.nome = nome;
        this.quantidadeDeJogador = quantidadeDeJogador;
        this.horaDeJogo = horaDeJogo;
        this.tipoDeJogo = tipoDeJogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidadeDeJogador() {
        return quantidadeDeJogador;
    }

    public void setQuantidadeDeJogador(String quantidadeDeJogador) {
        this.quantidadeDeJogador = quantidadeDeJogador;
    }

    public int getHoraDeJogo() {
        return horaDeJogo;
    }

    public void setHoraDeJogo(int horaDeJogo) {
        this.horaDeJogo = horaDeJogo;
    }

    public TipoDeJogo getTipoDeJogo() {
        return tipoDeJogo;
    }

    public void setTipoDeJogo(TipoDeJogo tipoDeJogo) {
        this.tipoDeJogo = tipoDeJogo;
    }
}
