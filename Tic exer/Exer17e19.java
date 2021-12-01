import java.util.Scanner;

public class Exer17e19 {

public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);

System.out.println("Digite o valor do salario");
float salario = scanner.nextFloat();

float aumento = (salario*25)/100 ;
float novoSalario = salario + aumento;

    System.out.println("Digite o valor da percentagem de aumento do salario");
    float PerAumento= scanner.nextFloat();
    float Aumento = (salario*PerAumento)/100 ;
    float NovoSalario = salario + Aumento;
System.out.println("O aumento de salario que esse funcionario ganha e igual " + aumento);
    System.out.println("O novo salario que o funcionario ganha e igual\n " + novoSalario);//17
    System.out.println("O aumento de salario que esse funcionario ganha e igual " + Aumento);
    System.out.println("O novo salario que o funcionario ganha e igual " + NovoSalario);//19
}
}
