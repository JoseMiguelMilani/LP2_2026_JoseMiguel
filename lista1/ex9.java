package lista1;

import java.util.Scanner;

public class ex9 {

    public static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        receberMatriz(matriz);

        trocarPosicaoMatrizl2l8(matriz);

        trocarPosicaoMatrizc4c10(matriz);

        trocardiagonas(matriz);

        trocarPosicaoMatrizl5c10(matriz);

        System.out.println("matriz trocada");

        imprimirMatriz(matriz);
        

    }
    public static int[][] trocarPosicaoMatrizl2l8(int[][]matriz){//usando xor

        for (int i = 0; i < matriz.length; i++) {
                matriz[1][i] = matriz[1][i] ^ matriz[7][i];
                matriz[7][i] = matriz[1][i] ^ matriz[7][i];
                matriz[1][i] = matriz[1][i] ^ matriz[7][i];
        }

        return matriz;
    }

    public static int[][] trocarPosicaoMatrizc4c10(int[][]matriz){
    
        for (int i = 0; i < matriz[0].length; i++) {
            matriz[i][3] = matriz[i][3] ^ matriz[i][9];
            matriz[i][9] = matriz[i][3] ^ matriz[i][9];
            matriz[i][3] = matriz[i][3] ^ matriz[i][9];
        }
        
        return matriz;
    }

    public static int[][] trocarPosicaoMatrizl5c10(int[][]matriz){
    
        for (int i = 0; i < matriz.length; i++) {
            matriz[4][i] = matriz[4][i] ^ matriz[i][9];
            matriz[i][9] = matriz[4][i] ^ matriz[i][9];
            matriz[4][i] = matriz[4][i] ^ matriz[i][9];
        }
        
        return matriz;
    }

    public static int[][] trocardiagonas(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][i] = matriz[i][i] ^ matriz[i][matriz.length-i-1];
            matriz[i][matriz.length-i-1] = matriz[i][i] ^ matriz[i][matriz.length-i-1];
            matriz[i][i] = matriz[i][i] ^ matriz[i][matriz.length-i-1];
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