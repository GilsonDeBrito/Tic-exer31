import java.util.Scanner;

public class Exer31 {

    
    public static void main (String [] args) {
        Scanner scanner= new Scanner (System.in);
        
        System.out.println ("Qual é o salário Minimo atual?");
        
           double salMin = scanner.nextDouble ();
         
        System.out.println ("Qual consumo de quilowatt da residencia?");
        
           double qtdConsumo = scanner.nextDouble ();
        
        double valorpkw = salMin / 5;
        double valortotal = valorpkw * qtdConsumo;
        double desc = valortotal- (valortotal * 15) / 100;
        System.out.println ("Cada quilowatt e igual " + valorpkw);
        System.out.println ("O valor a ser pago e igual " + valortotal + ". Tendo em conta o seu consumo de" + qtdConsumo);
        System.out.println ("Com o desconto de 15%, o valor será de " + desc);        
    }
    
}