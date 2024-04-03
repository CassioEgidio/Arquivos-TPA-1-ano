import javax.swing.JOptionPane;
public class questao3 
{
    public static void main(String[] args)
    {
        double sx, alt, res;
        
         sx = Double.parseDouble(JOptionPane.showInputDialog("Digite 1 para masculino e 2 para feminino:"));
         alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em metros:"));
         
         res = calcularpesoideal(sx, alt);
         
         JOptionPane.showMessageDialog(null, "O seu peso ideal é: "+res);
    }
    
    static double calcularpesoideal(double sex, double altu)
    {
        double pesoideal;
        
        if(sex==1)
        {
            return pesoideal = (72.7*altu) - 58;
        }
        else
        {
            return pesoideal = (62.1*altu) - 44.7; 
        }
       
    }
}
