import java.util.Scanner;
public class questao2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
             double dolar, marco, libra, dinheiro;
        
        System.out.println("Digite a quantia de dinheiro que você tem");
        dinheiro = input.nextDouble();
        dolar = dinheiro/1.80;
        marco = dinheiro/2.00;
        libra = dinheiro/1.57;
        System.out.println("A conversão em dolar é de: "+dolar);
        System.out.println("A conversão em libra esterlina é de: "+libra);
        System.out.println("A conversão em marco alemão é de: "+marco);
       
    }        
}


