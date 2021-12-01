import java.util.Scanner;

public class Exer30{

      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Informe opeso do saco de racao em Kg");
            double pesoSaco= scanner.nextDouble();

            System.out.println("Informe a quantidade diaria consumida em gramas");
            double pesoDiario= scanner.nextDouble();
            
             double resto= pesoSaco - ( (pesoDiario * 2 * 5) / 1000);

            System.out.println("/A quantidade restante de racao e igual " + resto);
      }
}