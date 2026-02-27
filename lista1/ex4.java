import java.util.Scanner;

public class ex4 {

    public static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {
        int[][]matriz = new int[7][6];

        receberMatriz(matriz);

        System.out.println(somaTotal(matriz));
        
    }

    public static int somaLinhaCinco(int[][]matriz){
        int soma = 0;

        for (int i = 0; i < matriz[0].length; i++) {
            soma += matriz[4][i];
        }

        return soma;
    }

    public static int somaColunaTres(int[][]matriz){
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][2];
        }

        return soma;
    }

    public static int somaTotal(int[][]matriz){
        return (somaColunaTres(matriz) + somaLinhaCinco(matriz));
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
