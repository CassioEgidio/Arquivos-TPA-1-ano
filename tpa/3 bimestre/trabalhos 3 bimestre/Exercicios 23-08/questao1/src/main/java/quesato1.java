import javax.swing.JOptionPane;
public class quesato1 
{
     public static void main(String[] args)
     {
         double[][]nums = new double[4][5];
         int l=0,c=0, qp=0, qi=0, somapar=0, somaimpar=0, mediapares=0, mediaimpares=0;
         
         JOptionPane.showMessageDialog(null,"Recebendo os numeros:");
         for(l=0; l<4; l++)
         {
             for(c=0; c<5; c++)
             {
                 nums[l][c]=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da linha "+(l+1)+" e da coluna "+(c+1)+" :"));
             }
         }
         
         System.out.print("A matriz original é:"+"\n");
         for(l=0; l<4; l++)
         {
             for(c=0; c<5; c++)
             {
                 System.out.print(nums[l][c]+"\t");
                
                 if(nums[l][c]%2==0)
                 {
                    qp++;
                    somapar+=nums[l][c];
                    
                 }
                 else
                 {
                    qi++;     
                    somaimpar+=nums[l][c];
                 }
             }
             System.out.print("\n");  
         }
         
         mediapares = somapar/qp;
         mediaimpares = somaimpar/qi;
                 
         System.out.print("A quantidade de pares é: "+qp +"\n");
         System.out.print("A quantidade de impares é: "+qi +"\n");
         System.out.print("A soma dos pares é: "+somapar +"\n");
         System.out.print("A soma dos impares é: "+somaimpar +"\n");
         System.out.print("A média dos pares é: "+mediapares +"\n");
         System.out.print("A média dos impares é: "+mediaimpares +"\n");
         
     }
    
}
