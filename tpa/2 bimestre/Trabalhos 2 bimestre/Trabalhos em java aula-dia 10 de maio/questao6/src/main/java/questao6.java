import javax.swing.JOptionPane;
public class questao6 
{
     public static void main(String[] args )
     {
         int anp, aa, ia;
         
          anp = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento:"));
          aa = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
          
          ia = aa-anp;
          
          if(ia>=18)
          {
              JOptionPane.showMessageDialog(null, "Você atingiu a maioridade");
          }
          else
          {
              JOptionPane.showMessageDialog(null, "Você não atingiu a maioridade");
          }
     }
    
}
