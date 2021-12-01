import java.util.Scanner;

public class Exer27 {

      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o custo de fábrica de um carro novo");
            double custoFabrica = scanner.nextDouble();
            System.out.println("Informe o percentual de lucro");
            double Plucro = scanner.nextDouble();
            System.out.println("Informe o valor do imposto");
            double Vimposto = scanner.nextDouble();

            Plucro = custoFabrica * (Plucro / 100);
            Vimposto = custoFabrica * (Vimposto / 100);
            double Pfinal = custoFabrica +Plucro + Vimposto;

            System.out.println("O valor do lucro e igual " + Plucro);
            System.out.println("O valor dos impostos e igual " + Vimposto);
            System.out.println("O custo ao consumidor de um carro novo e: " + Pfinal);
      }
}