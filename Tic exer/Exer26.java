import java.util.Scanner;
import java.lang.Math;

public class Exer26{

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quadrado=2;
        int cubica=3;

      System.out.println("Digite um valor ");
        int valo1 = scanner.nextInt();

      System.out.println(" " + valo1 +" elevado ao quadrado e igual a "+ Math.pow(valo1, quadrado));
      System.out.println(" " + valo1 +" elevado ao cubo e igual a "+ Math.pow(valo1, cubica));
      System.out.println(" a raiz quadrada de " + valo1 + " e " + Math.sqrt(valo1));
      System.out.println(" a raiz cubica de " + valo1 + " e " + Math.cbrt(valo1));

   }
}