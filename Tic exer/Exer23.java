import java.util.Scanner;

public class Exer23 {

public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);

System.out.println("Digite o seu peso");
float peso = scanner.nextFloat();

float engordar = peso + (peso * 15) / 100;
float Emagrecer = peso - (peso * 20) / 100;

System.out.println("Voce engordou mais " + engordar);
System.out.println("Voce emagreceu mais " + Emagrecer);
}
}
