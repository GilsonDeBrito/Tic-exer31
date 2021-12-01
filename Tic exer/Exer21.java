import java.util.Scanner;

public class Exer21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float desconto=0 ;
        float novoPreco=0 ;

        System.out.println("Digite o salario base do funcionario\n ");
        float salarioBase = scanner.nextFloat();
        float gratificacao= salarioBase + (salarioBase * 5) /100;

        float Imposto = salarioBase - (salarioBase * 7) / 100;

        float SalarioReceber = gratificacao + Imposto;

        System.out.println("O seu salario a receber e igual" + SalarioReceber);
    }
}