import java.util.Scanner;

public class Exer123e4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores de a,b,c,d ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

        System.out.println("Digite os valores de A,B ");
            float A = scanner.nextFloat();
            float B = scanner.nextFloat();

            int soma = a + b + c + d;
            int sub = a - b;
            int mul = a * b * c;

        if (B == 0) {
            System.out.println("Numero invalido");
        } else {
            float div = A / B;
            System.out.println("A divisao do primeiro valor pelo segundo e igual " + div);//4
        }

        System.out.println("A soma dos quatro valores e igual a " + soma);//1
        System.out.println("A subtracao dos dois valores e igual a " + sub);//2
        System.out.println("A multiplicacao dos tres valores e igual a " + mul);//3
    }
}