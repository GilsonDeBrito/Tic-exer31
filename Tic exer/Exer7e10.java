import java.util.Scanner;

public class Exer7e10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base maior e a menor do trapezio");
        float BaseMaior = scanner.nextFloat();
        float BaseMenor = scanner.nextFloat();

        System.out.println("Digite a altura do trapezio");
        float altura = scanner.nextFloat();

        float Area = ((BaseMaior + BaseMenor) * altura) / 2;

        System.out.println("Digite a diagonal maior e a menor do losango");
        float diagonalMaior = scanner.nextFloat();
        float diagonalMenor = scanner.nextFloat();

        float area = (diagonalMaior * diagonalMenor) / 2;

        System.out.println("A area do trapezio e igual a " + Area);//10
        System.out.println("A area do losango e igual a " + area);//7
    }
}