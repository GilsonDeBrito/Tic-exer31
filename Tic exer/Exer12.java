import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base e da altura do triangulo ");
             float Base = scanner.nextFloat();
             float AT = scanner.nextFloat();

             float area1 = (Base*AT)/2;

        System.out.println("A area do triangulo e igual a " + area1);//12
 }
}