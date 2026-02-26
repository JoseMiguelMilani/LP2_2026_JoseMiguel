package lista1;

import java.util.Scanner;

public class ex12 {

    public static Scanner TECLADO = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matriz = new int[12][12];

        receberMatriz(matriz);

        System.out.println(calcularMediaAbaixoDiagonal(matriz));
    }

    public static double calcularMediaAbaixoDiagonal(int[][] matriz) {

        int soma = 0;
        int quantidade = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (i > j) {
                    soma += matriz[i][j];
                    quantidade++;
                }
            }
        }

        return (double) soma / quantidade;
    }

    public static int[][] receberMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = TECLADO.nextInt();
            }
        }

        return matriz;
    }
}