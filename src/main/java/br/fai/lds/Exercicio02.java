package main.java.br.fai.lds;

import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args) {
        Exercicio02 app = new Exercicio02();
        app.start();
    }

    private void start() {
        Scanner scanner = new Scanner(System.in);
        double media = calcularMedia(scanner);
        System.out.println("Média: " + media);
        scanner.close();
    }

    public static double calcularMedia(Scanner scanner) {
        double soma = 0;
        int contador = 0;
        while(contador < 4){
            System.out.print("Valor " + (contador +1) + ": ");
            double valor = scanner.nextDouble();
            soma+= valor;
            contador++;
        }

        while(true){
            System.out.print("Valor 1" + (contador + 1) + "(-1 para sair): ");
            double valor = scanner.nextDouble();
            if (valor == -1){
                break;
            }
            soma += valor;
            contador++;
        }
        System.out.println("Soma: " + soma);
        return soma / contador;
    }
}