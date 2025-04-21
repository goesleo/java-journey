import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora Simples em Java: ");

        System.out.println("Digite o primeiro valor: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite o operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);

        System.out.println("Digite o segundo valor: ");
        double num2 = sc.nextDouble();

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero!");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Operador inválido!");
                break;
        }

    }
}
