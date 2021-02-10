package br.dev.rvz;

/**
 * modelo de jogo principal
 * @author Rodrigo.vaz
 * */
public class Jogo {

    private String nome;
    private int quantidadeDeJogador;
    private int horaDeJogo;
    private TipoDeJogo tipoDeJogo;

    public Jogo() {
    }

    public Jogo(String nome, int quantidadeDeJogador, int horaDeJogo, TipoDeJogo tipoDeJogo) {
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

    public int getQuantidadeDeJogador() {
        return quantidadeDeJogador;
    }

    public void setQuantidadeDeJogador(int quantidadeDeJogador) {
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

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", quantidadeDeJogador=" + quantidadeDeJogador +
                ", horaDeJogo=" + horaDeJogo +
                ", tipoDeJogo=" + tipoDeJogo +
                '}';
    }
}
