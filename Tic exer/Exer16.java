import java.util.Scanner;

public class Exer16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double Jarda1=1;
        double Pe3=3;
        double milha1=1;
        double Njarda= 1.760;
          
        System.out.println("Digite o numero de Pes \n ");
        double Npe= scanner.nextDouble();

        double Polegadas = Npe * 12;
        double Jardas = (Jarda1 * Npe)/Pe3;
        double Milha = (milha1 * Jardas)/Njarda;

        System.out.println(Npe +" Pe equivale a " + Polegadas + " polegadas ");
        System.out.println(Npe +" Pe equivale a " + Jardas + " jardas ");
        System.out.println(Npe +" Pe equivale a " + Milha + " milha ");

    }
}