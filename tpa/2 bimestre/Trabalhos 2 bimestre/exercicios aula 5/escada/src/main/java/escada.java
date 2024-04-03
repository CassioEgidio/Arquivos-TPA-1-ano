import java.util.Scanner;
public class escada 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double alde, alpes, r;
        
        System.out.println("Digite a altura do degrau, em metros");
        alde = input.nextDouble();
        System.out.println("Digite a altura que você deseja atingir, em metros");
        alpes = input.nextDouble();
        r = alpes/alde;
        System.out.print("Para atingir o seu objetivo você tera que subir: "+r );
        System.out.print(" degraus");
        
    }
}
