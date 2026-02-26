public class imagemBinaria {

    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        letraUMatriz(matriz);

        imprimirMatriz(matriz);

    }

    public static int[][] letraUMatriz(int[][]matriz){

        int limiteColuna = matriz[0].length-2;
        int inicioColuna = 1;


        int limiteLinha = matriz.length -2;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == limiteColuna  || j == inicioColuna) {
                    matriz[i][j] = 1;
                }
                if (i == limiteLinha && i > 0 ) {
                    matriz[i][j] = 1;
                }
                if ((i == 0 || j == 0) || (i == limiteColuna+1 || j == limiteLinha+1)) {
                    matriz[i][j] = 0;
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
