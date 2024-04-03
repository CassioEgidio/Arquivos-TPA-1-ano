import javax.swing.JOptionPane;
public class questao3 
{
    public static void main(String[] args)
    {
         final int lin=10, col=2;
         String[][]produtos = new String[lin][col];
         int l=0, c=0, f=0;
         double num=0;
         
         for(l=0; l<10; l++)
         {
             produtos[l][c] = JOptionPane.showInputDialog("Insira o nome do "+(l+1)+"º produto");
             produtos[l][c+1] = JOptionPane.showInputDialog("Insira o preço do "+(l+1)+"º produto");
         }
          
         for(l=0; l<10; l++)
         {
            System.out.print( produtos[l][c+1]+"\t");
            System.out.print(produtos[l][c]+"\n\n");
         }
         
         f = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor maximo que vc quer pagar"+"\n"));
         System.out.print("Produtos disponiveis ate esse valor: "+f+"\n\n");
         
         for(l=0; l<10; l++)
         {
             num=Double.parseDouble(produtos[l][c+1]);
      
             if(num<=f)
             {
                 System.out.print( produtos[l][c+1]+"\t");
                 System.out.print( produtos[l][c]+"\n\n");
             }
             
         }
     
    }
       
 }
