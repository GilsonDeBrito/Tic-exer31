import java.util.Scanner;

public class Exer18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float desconto=0 ;
        float novoPreco=0 ;

        System.out.println("Digite o preco do produto\n ");
        float preco= scanner.nextFloat();
        
       desconto = (preco * 10)/100;
       novoPreco = preco - desconto;

        System.out.println("O desconto do produto e igual" + desconto);
        System.out.println("O novo preco do produto e igual" + novoPreco);
    }
}