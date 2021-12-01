import java.util.Scanner;

public class Exer11 {

public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);

System.out.println("Digite o valor do salario minimo");
float salarioMinimo = scanner.nextFloat();

System.out.println("Digite o salario do funcionario");
float salarioDoFuncionario = scanner.nextFloat();

float quantidade = salarioDoFuncionario / salarioMinimo;

System.out.println("A quantidade de salario minimo que esse funcionario ganha e igual " + quantidade);
}
}