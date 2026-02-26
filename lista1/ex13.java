package lista1;

import java.util.Scanner;

public class ex13 {

    public static Scanner TECLADO = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matriz = new int[10][10];

        receberMatriz(matriz);

        System.out.println(somarAcimaDiagonal(matriz));
    }

    public static int somarAcimaDiagonal(int[][] matriz) {

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (i < j) { 
                    soma += matriz[i][j];
                }
            }
        }

        return soma;
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