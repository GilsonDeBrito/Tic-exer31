import java.util.Scanner;

public class Exer28 {

      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o numero de horas trabalhadas");
            double Htrabalhadas = scanner.nextDouble();
            System.out.println("Informe o salario minimo");
            double SalMin = scanner.nextDouble();

            double hTrabalhada = SalMin / 2;
            double salBruto = Htrabalhadas * hTrabalhada;
            double Imposto = salBruto * 0.03;
            double salReceber = salBruto - Imposto;

            System.out.println("O salario a receber e igual " + salReceber);
      }
}