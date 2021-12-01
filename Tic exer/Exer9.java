import java.util.Scanner;

public class Exer9 {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Diite o peso da pessoa em kg");

float pesoKg = scanner. nextFloat();

float PesoG = pesoKg * 1000;

System.out.println("O peso da pessoa em gramas e igual" + PesoG + " gramas" );


}
}