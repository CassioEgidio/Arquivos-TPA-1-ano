import java.util.Scanner;
public class base 
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);  
      
      double bma, bme, al, r;
      
      System.out.println("Digite a base maior do trapézio");
      bma = input.nextDouble();
      System.out.println("Digite a base menor do trapézio");
      bme = input.nextDouble();
      System.out.println("Digite a altura do trapézio");
      al = input.nextDouble();
      r = ((bma+bme)*al)/2;
      System.out.println("A area do trapézio é de:" +r);
              
      
      
        
        
        
    }
    
}
