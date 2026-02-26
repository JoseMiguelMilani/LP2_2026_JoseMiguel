package lista1;

import java.util.Scanner;

public class ex10{

    public static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = new int[9][9];

        receberMatriz(matriz);

        System.out.println(somarLinhaPares(matriz));

    }

    public static int somarLinhaPares(int[][]matriz){
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i%2 == 0) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
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