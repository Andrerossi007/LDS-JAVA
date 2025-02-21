package br.fai.lds;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Exercicio04 app = new Exercicio04();
        app.start();

    }

    private void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Frase: ");
        String frase = scanner.nextLine().trim();

        if (frase.isEmpty()){
            System.out.println("Nada foi digitado.");
        }else {
            String[] palavra = frase.split("\\s+"); //Divide por espaco em branco

            if (palavra.length > 1 && palavra.length <=4){
                System.out.println("Penultima palavra: " + palavra[palavra.length -2]);
            } else if (palavra.length > 4) {
                System.out.println("Penultima Palavra: "+ palavra[palavra.length - 2] + " \nTexto muito longo");

            }
            
        }
        scanner.close();
    }
}
