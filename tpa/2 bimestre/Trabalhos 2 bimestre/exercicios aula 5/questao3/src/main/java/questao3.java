import java.util.Scanner;

public class questao3 
{
    public static void main(String[] args)
    {        
         Scanner input = new Scanner(System.in);
         
         String nome;
         double salario, vv, comissao, sf;
         
         System.out.println("Digite o seu salario fixo");
         salario = input.nextDouble();
         System.out.println("Digite o valor de suas vendas");
         vv = input.nextDouble();
         input.nextLine();
         System.out.println("Digite o seu nome");
         nome = input.nextLine();
         
         comissao = (4*vv)/100;
         sf = comissao+salario;
         
         System.out.println("O seu nome é: "+nome);
         System.out.println("A sua comissão é: "+comissao);
         System.out.println("O seu salario final é "+sf);
    }
    
}