package br.dev.rvz;

/**
* responsável pela interação de usuário e inserção de jogos
* @author Rodrigo.vaz
* */
public class SistemaPrincipal {

    private boolean run; // responsavel pela repetição do menu
    private CatalagoDeJogo catalagoDeJogo; // responsavel pelo catalago de jogos (inserção e mostragem)
    private int opcoes; // opções que o usuário poderá selecionar.

    public SistemaPrincipal() {
        this.run = true;
        this.catalagoDeJogo = new CatalagoDeJogo();
    }


    /**
     * responsavel por decidir as opções de funcionalidade
     */
    public void mainMenu() {
        while(this.run) {
            IO.output("1. Adicionar Jogo de Tabuleiro.\n2. Adicionar jogo de VideoGame.\n3.adicionar jogo de rua.\n4. Listar jogos.\n5. Sair do programa.");
            this.opcoes = IO.input().nextInt();

            if (this.opcoes == 1) {
                adicionarJogoTabuleiro();
            } else if (this.opcoes == 2) {
                adicionarJogoDeVideogame();
            } else if (this.opcoes == 3) {
                adicionarJogoDeRua();
            } else if (this.opcoes == 4) {
                catalagoDeJogo.listar();
            } else if (this.opcoes == 5) {
                this.run = false;
            } else {
                IO.output("opção inválida");
            }
        }
    }


    private void adicionarJogoTabuleiro() {
        IO.output("Por favor, informar o nome do jogo, quantidade de jogador, horas de jogos e quantidade de peças");
        Jogo jogoDeTabuleiro = new JogoDeTabuleiro(
                IO.input().nextLine(),
                IO.input().nextInt(),
                IO.input().nextInt(),
                TipoDeJogo.TABULEIRO,
                IO.input().nextInt()
        );
        catalagoDeJogo.getCatalagoJogo().add(jogoDeTabuleiro);
    }

    private void adicionarJogoDeVideogame() {
        IO.output("Por favor, digite o nome, qtd de jogador, horas de jogo e se é online (sim/não).");
        try {
            Jogo jogoDeVideogame = new JogoDeVideogame(
                    IO.input().nextLine(),
                    IO.input().nextInt(),
                    IO.input().nextInt(),
                    TipoDeJogo.VIDEO_GAME,
                    verificarSimOuNao(IO.input().nextLine())
            );
            catalagoDeJogo.getCatalagoJogo().add(jogoDeVideogame);
        }catch (RuntimeException e) {
            IO.output(e.getMessage());
        }
    }

    private void adicionarJogoDeRua() {
        IO.output("Por favor, digite o nome, qtd de jogador, hora de jogador, e se é perigoso (sim/não) e local (cidade ou litoral)");
        try {
            Jogo jogoDeRua = new JogoDeRua(
                    IO.input().nextLine(),
                    IO.input().nextInt(),
                    IO.input().nextInt(),
                    TipoDeJogo.RUA,
                    verificarSimOuNao(IO.input().nextLine()),
                    verificarLocalParaBrincar(IO.input().next())
            );
            catalagoDeJogo.getCatalagoJogo().add(jogoDeRua);
        } catch (RuntimeException e) {
            IO.output(e.getMessage());
        }

    }


    /**
     * responsavel por retornar o valor padrão de local de brincar
     * com a decisão do usuário
     * @param resposta
     * @return localparabrinca
     */
    private LocalParaBrinca verificarLocalParaBrincar(String resposta) {
        if (resposta.equalsIgnoreCase("cidade")) {
            return LocalParaBrinca.CIDADE;
        } else if (resposta.equalsIgnoreCase("litoral")) {
            return LocalParaBrinca.LITORAL;
        } else {
            throw new RuntimeException("local de jogo inválido");
        }
    }


    /**
     * responsavel por retornar verdadeiro ou falso
     * com a resposta do usuário se e online ou não
     * @param resposta
     * @return
     */
    private boolean verificarSimOuNao(String resposta) {
        if (resposta.equalsIgnoreCase("sim")) {
            return true;
        } else if (resposta.equalsIgnoreCase("nao")) {
            return false;
        } else {
            throw new RuntimeException("opção de se o jogo é online é invalido!");
        }
    }


}
