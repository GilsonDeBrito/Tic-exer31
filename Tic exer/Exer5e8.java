import java.util.Scanner;

public class Exer5e8{

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  System.out.println("Digite as 3 notas ");
        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();
        float nota3 = scanner.nextFloat();
       
        float media = (nota1 + nota2 + nota3)/3;
        float area = nota1 * nota2;

        System.out.println("A media aritmetica e igual a " + media);//5
        System.out.println("A area do quadrado e igual a " + area);//8
   }
}