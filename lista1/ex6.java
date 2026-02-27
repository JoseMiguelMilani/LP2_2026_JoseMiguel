
import java.util.Scanner;

public class ex6 {

    public static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {
        int[][]matrizA = new int[8][8];
        receberMatriz(matrizA);

        int maior = acharMaiorDiagonalPrincipal(matrizA);

        double[][]matrizB = criarMatrizB(matrizA, maior);

        imprimirMatriz(matrizB);
        
    }

    public static double[][] criarMatrizB (int[][] matrizA, int maior){
        double[][] matrizB = new double[matrizA.length][matrizA[0].length];
 
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                matrizB[i][j] = (double)matrizA[i][j]/maior*1.00;
            }
        }

        return matrizB;
    }

    public static int acharMaiorDiagonalPrincipal(int[][]matriz){
        int maior = 0;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][i] > maior) {
                maior = matriz[i][i];
            }
            
        }

        return maior;
    }

    public static int[][] receberMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = TECLADO.nextInt();
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(double[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                System.out.printf("%.2f ", matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
}
