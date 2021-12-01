import java.util.Scanner;

public class Exer20{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo do espetaculo e o preco do convite ");
        int custoDoEspetaculo = scanner.nextInt();
        int precoDoConvite = scanner.nextInt();

        int convitesAvender = custoDoEspetaculo / precoDoConvite;
        if( precoDoConvite * convitesAvender == custoDoEspetaculo )
        {
            System.out.println("O custo do espetaculo foi alcancado porque " + " convites a vender e igual " + convitesAvender + " e o preco do convite e igual " + precoDoConvite + " multiplicando da igual " + custoDoEspetaculo);//20
        }
        else
        {
            System.out.println("A venda de convites e inferior ao custo do espetaculo");
        }

    }
}