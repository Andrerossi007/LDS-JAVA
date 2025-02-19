package br.fai.lds;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Exercicio01 app = new Exercicio01();
        app.start();
    }


    private void start() {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        int i = 0;
        while (i < 4){
            switch (i){
                case 0:
                    a = obterValor();
                    break;
                case 1:
                    b = obterValor();
                     break;
                case 2:
                    c = obterValor();
                    break;
                case 3:
                    d = obterValor();
                    break;
                default:
                    System.out.println("Valor Invalido ");
                    break;
            }

            i++;
        }

        System.out.println("-------------");
        int valorMaior = calcularMinimoMaximo(a, b, c, d);
        classificarMaiorValor(valorMaior);

    }

    private void classificarMaiorValor(int valorMaior) {
        //solid principles / clean architecture
        if (valorMaior > 50){
            System.out.println("Valor muito alto");
            return;
        }
            System.out.println("Valor Normal");
        }


    }

    private int calcularMinimoMaximo(int a, int b, int c, int d) {
        int maior = Math.max(a,Math.max(b,Math.max(c,d)));
        int menor = Math.min(a,Math.min(b,Math.min(c,d)));
        System.out.println("O maior valor eh: " + maior);
        System.out.println("O menor valor eh: " + menor);

        return maior;
    }

    private int obterValor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        int valorObtido = scanner.nextInt();
        return valorObtido;

    }

}
