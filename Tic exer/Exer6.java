import java.util.Scanner;

public class Exer6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as 3 notas para media ponderada");
        float Nota1 = scanner.nextFloat();
        float Nota2 = scanner.nextFloat();
        float Nota3 = scanner.nextFloat();

        System.out.println("Digite os 3 pesos para media ponderada ");
        float peso1 = scanner.nextFloat();
        float peso2 = scanner.nextFloat();
        float peso3 = scanner.nextFloat();

        float SP = peso1 + peso2 + peso3;
        float MP = ((Nota1 * peso1) + (Nota2 * peso2) + (Nota3 * peso3) / SP);

        System.out.println("A media ponderada e igual a " + MP);//6
    }
}