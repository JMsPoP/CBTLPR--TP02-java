/*
@Author ("Joao Marcos Teles Silva CB3026787")
2.Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.
*/


import java.util.Scanner;

public class TP02Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] valores = new double[11];
        double maiorValor;
        double soma = 0;

        System.out.println("Digite o 1 valor:");
        valores[0] = scanner.nextDouble();
        maiorValor = valores[0];
        soma += valores[0];

        for (int i = 1; i < valores.length; i++) {
            do {
                System.out.println("Digite o " + (i + 1) + " valor:");
                valores[i] = scanner.nextDouble();
                if (valores[i] < 0) {
                    System.out.println("Apenas valores positivos.");
                }
            } while (valores[i] < 0);

            soma += valores[i];

            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
            }
        }

        double media = soma / 10;

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Media aritmética dos valores: " + media);

        scanner.close();
    }
}
