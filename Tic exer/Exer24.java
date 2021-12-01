import java.util.Scanner;

public class Exer24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salario fixo do funcionario\n ");
        float salarioFixo = scanner.nextFloat();

        float Imposto = salarioBase - (salarioBase * 10) / 100;
        float SalarioReceber = 50 + imposto;

        System.out.println("O seu salario a receber e igual" + SalarioReceber);
    }
}