import javax.swing.JOptionPane;
public class questao4 
{
    public static void main(String[] args )
    {
        double quilos,quiloe, multa;
        
         quilos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de quilos de peixe:"));
         
         if(quilos>50)
         {
             quiloe = quilos-50;
             multa = quiloe*4;
             
              JOptionPane.showMessageDialog(null, "A multa a ser paga é de: "+multa + " reais");
         }
        
    }
    
}
