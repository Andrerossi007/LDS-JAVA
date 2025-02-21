package br.fai.lds;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Exercicio05 app = new Exercicio05();
        app.start();
    }

    private void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");
        String valor = scanner.nextLine();


        try {
            int numero = Integer.parseInt(valor); //converte a string para inteiro
            System.out.println("Int: "+ numero);

        }catch (NumberFormatException e){
            System.out.println("Erro: Entrada invalida!");
        }


    }
}
