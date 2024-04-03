import java.util.Scanner;
        
public class exemplo1
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double bs, al, ar;
        
        System.out.println("Digite a base do retângulo: ");
        bs = input.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        al = input.nextDouble();
        ar = bs*al;
        System.out.println("A área do retângulo é: "+ar);
    }
}
