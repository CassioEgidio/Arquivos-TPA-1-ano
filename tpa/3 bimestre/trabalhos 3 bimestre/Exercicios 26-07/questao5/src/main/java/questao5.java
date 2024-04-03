import javax.swing.JOptionPane;
public class questao5 
    {
    public static void main(String[]args)
     {
         int ini, fin;
         ini = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
         fin = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
         
    if(ini>fin)
    {  
         for (int i=ini; i>=fin; i--)
         {
             if(i%2==0)
             {
              JOptionPane.showMessageDialog(null, "Os numeros pares existentes são: "+i);
             }
         }
           
    }
    
           
    else if(ini==fin)
    {
        JOptionPane.showMessageDialog(null, "Os numeros são iguais.");
    }
    
    
    else
    {
         for (int i=fin; i>=ini; i--)
         {
             if(i%2==0)
            {
             JOptionPane.showMessageDialog(null, "Os numeros pares existentes são: "+i);
            }  
         }    
    }
    
            
  }
    

}
