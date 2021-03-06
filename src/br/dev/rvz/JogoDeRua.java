package br.dev.rvz;

/**
 * modelo de jogo de rua
 * */
public class JogoDeRua extends Jogo {

    private boolean perigoso;
    private LocalParaBrinca localParaBrinca;

    public JogoDeRua() {
    }

    public JogoDeRua(String nome, int quantidadeDeJogador, int horaDeJogo, TipoDeJogo tipoDeJogo, boolean perigoso, LocalParaBrinca localParaBrinca) {
        super(nome, quantidadeDeJogador, horaDeJogo, tipoDeJogo);
        this.perigoso = perigoso;
        this.localParaBrinca = localParaBrinca;
    }

    public boolean isPerigoso() {
        return perigoso;
    }

    public void setPerigoso(boolean perigoso) {
        this.perigoso = perigoso;
    }

    public LocalParaBrinca getLocalParaBrinca() {
        return localParaBrinca;
    }

    public void setLocalParaBrinca(LocalParaBrinca localParaBrinca) {
        this.localParaBrinca = localParaBrinca;
    }

    @Override
    public String toString() {
        return  super.toString() + " JogoDeRua{" +
                "perigoso=" + perigoso +
                ", localParaBrinca=" + localParaBrinca +
                '}';
    }
}
