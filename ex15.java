public class ex15 {
    
    public static void main(String[] args) {
        int[][] matriz = new int[4][6];

        definirValoresMatriz(matriz);

        imprimirMatriz(matriz);
    }

    public static int[][] definirValoresMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                
                if ((i+j)%2 == 0) {
                    matriz[i][j] = (i*i)*-1;
                }else{
                    matriz[i][j] = 2*i*j;
                }

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
}


