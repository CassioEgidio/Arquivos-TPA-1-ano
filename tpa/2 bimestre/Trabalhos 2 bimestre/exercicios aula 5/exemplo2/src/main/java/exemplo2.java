import java.util.Scanner;

public class exemplo2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        double sl, sb, vh, ht, nd, bn;
        
        bn=300;
        System.out.println("Informe o valor por hora trabalhada:");
        vh = input.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas:");
        ht = input.nextDouble();
        System.out.println("Informe a quantidade de dependentes:");
        nd = input.nextDouble();
        sb = vh*ht;
        sl = sb+(bn*nd);
        System.out.println("O valor do seu salario bruto é de: "+sb);
        System.out.println("O valor do seu salario liquido é de: "+sl);
    }
}
