import java.util.Scanner;

public class Exer13e14{

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 System.out.println("Digite o ano de nascimento e o ano atual ");
        int AnoDeNascimento= scanner.nextInt();
        int AnoAtual = scanner.nextInt();

        int IdadeAtual = AnoAtual - AnoDeNascimento;
        int IdadeFutura = 2050 - AnoDeNascimento;

        int IdadeEmMeses = IdadeAtual * 12;
        int IdadeEmDias = IdadeAtual * 365;
        int IdadeEmSemanas = IdadeAtual * 52;


        System.out.println("A sua idade atual e igual a " + IdadeAtual + " Anos " + " Em 2050 tera " + IdadeFutura + " Anos ");//13
        System.out.println("A idade em meses e igual " + IdadeEmMeses + " a idade em dias e igual " + IdadeEmDias + " a idade em semanas e igual " + IdadeEmSemanas );//14


   }
}