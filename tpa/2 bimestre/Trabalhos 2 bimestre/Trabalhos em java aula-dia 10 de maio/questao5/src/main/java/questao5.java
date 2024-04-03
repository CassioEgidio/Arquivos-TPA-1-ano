import javax.swing.JOptionPane;
public class questao5 
{
    public static void main(String[] args )
    {
        int senha;
        
         senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua senha:"));
         
         if(senha==123)
         {
             JOptionPane.showMessageDialog(null, "A senha digitada é valida");
         }
         else
         {
             JOptionPane.showMessageDialog(null, "A senha digitada não é valida");
         }
             
    }
    
}
