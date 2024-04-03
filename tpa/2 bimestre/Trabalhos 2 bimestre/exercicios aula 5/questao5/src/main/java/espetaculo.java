import java.util.Scanner;

public class espetaculo
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double ce, pc, r;
        
        System.out.println("Digite o custo do espetáculo:");
        ce = input.nextDouble();
        System.out.println("Digite o preço do convite:");
        pc = input.nextDouble();
        r = ce/pc;
        System.out.print("Para alcançar o valor do show tera que vender: "+r);
        System.out.print(" ingressos");
    }        
}
