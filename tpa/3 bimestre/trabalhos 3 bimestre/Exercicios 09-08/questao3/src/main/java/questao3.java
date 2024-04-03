import javax.swing.JOptionPane;
public class questao3 
{
     public static void main(String[] args)
     {
         int[] elementos = new int [10];
         int i;
         
         for(i=0; i<10; i++)
         {
             elementos[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " +(i+1)+ "º elemento:"));
         }
         for(i=0; i<10; i++)
         {
             JOptionPane.showMessageDialog(null, (i+1)+ " º numero foi: " + elementos[i]);
         }
         
         int[] eleinverso = new int[10];
         int r=9;
         
         for(i=9; i>=0; i--)
         {
             eleinverso[r--] = elementos[i];
         }
         for(r=9; r>=0; r--)
         {
             JOptionPane.showMessageDialog(null, (r+1)+ " º numero foi: " + elementos[r]);
         }
     }
    
}
