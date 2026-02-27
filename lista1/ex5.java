import java.util.Scanner;

public class ex5 {

    public static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {
        int[][]matriz = new int[6][6];

        receberMatriz(matriz);
        
        System.out.println(acharMaiorDiagonalSegundaria(matriz));
    }

    public static int acharMaiorDiagonalSegundaria(int[][]matriz){
        int maior = 0;

        for (int i = 0; i < matriz.length; i++) {
            if (maior < matriz[i][matriz.length-i-1]) {
                maior = matriz[i][matriz.length-i-1];
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
}
