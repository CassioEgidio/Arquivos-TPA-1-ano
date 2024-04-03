import javax.swing.JOptionPane;
public class questao2 
{
    public static void main(String[] args)
    {
         int[][]nums = new int[3][5];
         int l=0, c=0, soma=0;
         
         JOptionPane.showMessageDialog(null,"Recebendo os numeros:");
         for(l=0; l<3; l++)
         {
             for(c=0; c<5; c++)
             {
                 nums[l][c]=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da linha "+(l+1)+" e da coluna "+(c+1)+" :"));
             }
         }
    
         for(l=0; l<3; l++)
         {
             for(c=0; c<5; c++)
             {
                 System.out.print(nums[l][c]+"\t");
                 soma += nums[l][c]; 
             }
         System.out.println( "a soma da linha é: "+soma +"\n"); 
         soma=0;
         }
    }
    
}
