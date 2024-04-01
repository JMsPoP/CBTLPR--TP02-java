/*
@Author ("Joao Marcos Teles Silva CB3026787")
3. Entrar via teclado com "N" valores quaisquer. O valor "N" (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos "N" valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;
*/

import java.util.Scanner;

public class TP02Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executarNovamente = true;

        do {
            System.out.println("Defina quantos valores quer digitar (menor que 20):");
            int tamanho = scanner.nextInt();

            if (tamanho >= 20) {
                System.out.println("Erro: O tamanho deve ser menor que 20.");
                continue; // Volta ao início do loop para nova execução
            }

            double[] valores = new double[tamanho];
            double maiorValor;
            double menorValor;
            double soma = 0;
            int contadorPositivos = 0;
            int contadorNegativos = 0;

            System.out.println("Digite os " + tamanho + " valores:");

            // Inicializa o maior e o menor valor com o primeiro valor inserido
            valores[0] = scanner.nextDouble();
            maiorValor = valores[0];
            menorValor = valores[0];
            soma += valores[0];
            if (valores[0] >= 0) {
                contadorPositivos++;
            } else {
                contadorNegativos++;
            }

            for (int i = 1; i < valores.length; i++) {
                System.out.println("Digite o " + (i + 1) + "º valor:");
                valores[i] = scanner.nextDouble();

                soma += valores[i];

                if (valores[i] > maiorValor) {
                    maiorValor = valores[i];
                }

                if (valores[i] < menorValor) {
                    menorValor = valores[i];
                }

                if (valores[i] >= 0) {
                    contadorPositivos++;
                } else {
                    contadorNegativos++;
                }
            }

            double media = soma / tamanho;
            double percentPositivos = (double) contadorPositivos / tamanho * 100;
            double percentNegativos = (double) contadorNegativos / tamanho * 100;

            System.out.println("Maior valor: " + maiorValor);
            System.out.println("Menor valor: " + menorValor);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média aritmética dos valores: " + media);
            System.out.println("Porcentagem de valores positivos: " + percentPositivos + "%");
            System.out.println("Porcentagem de valores negativos: " + percentNegativos + "%");

            System.out.println("Deseja executar o programa novamente? (S/N)");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("S")) {
                executarNovamente = false;
            }

        } while (executarNovamente);

        System.out.println("Programa encerrado.");

        scanner.close();
    }
}

