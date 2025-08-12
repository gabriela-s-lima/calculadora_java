package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true; 

        System.out.println("===== CALCULADORA EM JAVA =====");

        while (continuar) {
            System.out.print("\nDigite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("\nEscolha a operação:");
            System.out.println("[1] Soma (+)");
            System.out.println("[2] Subtração (-)");
            System.out.println("[3] Multiplicação (*)");
            System.out.println("[4] Divisão (/)");
            System.out.println("[5] Potenciação (x^n)");

            System.out.print("Digite o número da operação: ");
            int opcao = scanner.nextInt(); 

            double resultado = 0;
            boolean operacaoValida = true;

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: divisão por zero não é permitida.");
                        operacaoValida = false;
                    }
                    break;
                case 5:
                    resultado = Math.pow(num1, num2);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    operacaoValida = false;
            }

            if (operacaoValida) {
                System.out.println("Resultado: " + resultado);
            }

            System.out.print("\nDeseja fazer outro cálculo? (s/n): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
                System.out.println("Encerrando a calculadora. Até mais!");
            }
        }

        scanner.close();
    }
}
