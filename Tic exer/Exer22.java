import java.util.Scanner;

public class Exer22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salario fixo do funcionario\n ");
        float salarioFixo = scanner.nextFloat();

        System.out.println("Digite o valor de vendas do funcionario\n ");
        float valorVendas = scanner.nextFloat();

        float Comicao = valorVendas + (valorVendas * 4)/100;
        float SalarioFinal= Comicao + salarioFixo;

        System.out.println("O seu salario a receber e igual" + SalarioFinal);
        System.out.println("O sua comicao a receber e igual" + Comicao);

    }
}