package br.fai.lds;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Exercicio03 app = new Exercicio03();
        app.start();
    }

    private void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Palavra ou frase: ");
        String texto = scanner.nextLine();

        inverterString(texto);

    }

    private void inverterString(String texto) {
        System.out.print("Por caracter: ");
        for (int i = texto.length() -1; i >= 0 ; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();

        String invertida = new StringBuilder(texto).reverse().toString();
        System.out.print("String: " + invertida);
    }
}
