import java.util.Scanner;
public class MediaEnem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota de Linguagens, Códigos e suas Tecnologias: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite sua nota de Ciências Humanas e suas Tecnologias: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite sua nota de Ciências da Natureza e suas Tecnologias: ");
        double nota3 = sc.nextDouble();

        System.out.println("Digite sua nota de Matemática e suas Tecnologias: ");
        double nota4 = sc.nextDouble();
        System.out.println("Digite a nota da sua redação: ");
        double nota5 = sc.nextDouble();

        double resultado = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("Resultado: " + resultado);


    }
}
