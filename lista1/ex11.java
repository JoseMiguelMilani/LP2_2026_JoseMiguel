package lista1;

import java.util.Scanner;

public class ex11 {

    public static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];

        receberMatriz(matriz);

        multiplicarPelaDiagonalPrincipal(matriz);

        imprimirMatriz(matriz);
    }

    public static int[][] multiplicarPelaDiagonalPrincipal(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            int multiplo = matriz[i][i];
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = matriz[i][j] * multiplo;
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] receberMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = TECLADO.nextInt();
            }
        }

        return matriz;
    }
}