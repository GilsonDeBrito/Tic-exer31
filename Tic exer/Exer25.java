import java.util.Scanner;

public class Exer25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de deposito\n ");
        float deposito = scanner.nextFloat();

        System.out.println("Digite o valor de taxas de juros\n ");
        float juros = scanner.nextFloat();

        float Rendimento = juros;
        float RendimentoTotal = deposito + rendimento;

        System.out.println("O seu valor de rendimento e igual" + Rendimento);
        System.out.println("O seu valor de rendimento e igual" + RendimentoTotal);
    }
}