package lista1;

import java.util.Scanner;

public class ex8 {

    public static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];

        receberMatriz(matriz);

        System.out.println("qual o multiplo");
        int valorMultiplo = TECLADO.nextInt();

        int[] vetor = transformarEmVetor(matriz, valorMultiplo);

        imprimirVetor(vetor);

    }

    public static void imprimirVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d ",vetor[i]);
        }
    }

    public static int[] transformarEmVetor(int[][]matriz, int multiplo){
        int[] vetor = new int[matriz.length * matriz[0].length];
        int cont = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                vetor[cont] = matriz[i][j]*multiplo;
                cont++;
            }
        }

        return vetor;
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