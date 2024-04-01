/*
@Author ("Joao Marcos Teles Silva CB3026787")
&& (Leandro Felix)
6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
*/

public class TP02Ex06 {
    public static void main(String[] args) {
        String[][] nomes = new String[2][3];

        nomes[0][0] = "João";
        nomes[0][1] = "Marcos";
        nomes[0][2] = "Leandro";
        nomes[1][0] = "Wellington";
        nomes[1][1] = "Rafaela";
        nomes[1][2] = "Gabriela";

        
        System.out.println("Nomes na matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(nomes[i][j] + " ");
            }
            System.out.println();
        }
    }
}
