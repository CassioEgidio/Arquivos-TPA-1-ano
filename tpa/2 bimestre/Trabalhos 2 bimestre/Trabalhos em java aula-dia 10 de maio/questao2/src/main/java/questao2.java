import javax.swing.JOptionPane;
public class questao2 
{
     public static void main(String[] args )
     {
         int n, np, nn;
         
         n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro qualquer:"));
         
         if(n>0)
         {
             JOptionPane.showMessageDialog(null, "O numero digitado é positivo");
         }
         else
         {
             JOptionPane.showMessageDialog(null, "O numero digitado é negativo");
         }
     }
}
