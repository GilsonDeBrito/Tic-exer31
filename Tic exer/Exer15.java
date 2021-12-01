import java.util.Scanner;

public class Exer15{

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float Exp=0;
  System.out.println("Digite os 2 valores ");
        int valo1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        if (valo1!=0 && valor2!=0)
        {
            System.out.println(" " + valo1+" elevado ao quadrado é igual a "+ Math.pow(valo1, valor2));
        }
        else {
            System.out.println("Erro");
        }
   }
}