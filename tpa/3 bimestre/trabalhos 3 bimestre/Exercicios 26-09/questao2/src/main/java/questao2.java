import javax.swing.JOptionPane;
public class questao2 
{
     public static void main(String[] args)
     {
          double n1=0, n2=0;
          
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
           
            diferenca(n1, n2);
     }
     
     static void diferenca(double num1, double num2)
     { 
         double dif;
         
         if(num1>num2)
         {
             dif = num1-num2;
         }
         else
         {
             dif = num2-num1;
         }
         
         JOptionPane.showMessageDialog(null, "A diferença do maior para o menor é: "+dif);
     }
     
}
