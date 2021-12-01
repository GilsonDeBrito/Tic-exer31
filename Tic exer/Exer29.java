import java.util.Scanner;

public class Exer29 {

      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double cpmf=0.38;
            System.out.println("Informe o salario minimo");
            double salMin = scanner.nextDouble();
            
            double opeRetirar = salMin * cpmf;
            double salMin1= salMin - opeRetirar;
            
            double opeRetirar2 = salMin * cpmf;
            double salMin2= salMin - opeRetirar2;
            

            System.out.println("O salario do trabalhador apos aos levantamentos e igual\n " + salMin1);
            System.out.println("O salario do trabalhador apos aos levantamentos e igual " + salMin2);
      }
}