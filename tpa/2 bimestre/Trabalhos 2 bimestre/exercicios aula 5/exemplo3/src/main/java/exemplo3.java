import java.util.Scanner;

public class exemplo3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double dp, s1, s2,s3;
        
        dp=500;
        System.out.println("O saldo inicial é de: "+dp);
        s1 = dp+ ((dp*1) /100);
        s2 = s1+ ((s1*1) /100);
        s3 = s2+ ((s2*1) /100);
        System.out.println("O saldo após 3 meses é de: "+s3);
    }
}
