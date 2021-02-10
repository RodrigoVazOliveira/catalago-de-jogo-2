package br.dev.rvz;

import java.util.Scanner;

/**
 * responsável para entrada e saída de dados do terminal/console
 * @author Rodrigo.vaz
 * */
public class IO {

    /**
     * retornar um scanner para leitura de qualquer tipo de dados
     * @return scanner
     */
    public static Scanner input() {
        return new Scanner(System.in);
    }

    /**
     * imprimi no terminal o que for passado no parametro
     * @param texto
     */
    public static void output(String texto) {
        System.out.println(texto);
    }
}
