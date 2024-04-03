import javax.swing.JOptionPane;
public class questao4 
{
     public static void main(String[]args)
     {
         int ini, fin, soma=0;
         ini = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
         fin = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
         
    if(ini>fin)
    {  
         for (int i=ini; i>=fin; i--)
         {
             if(i%2!=0)
             {
             soma=soma+i;
             }
         }
           JOptionPane.showMessageDialog(null, "A soma dos numeros impares é: "+soma);
    }
           
     
    else
    {
         for (int i=ini; i<=fin; i++)
            {
             if(i%2!=0)
            {
             soma=soma+i;
            } 
         }
          JOptionPane.showMessageDialog(null, "A soma dos numeros impares é: "+soma);
    }
            
     }
}
