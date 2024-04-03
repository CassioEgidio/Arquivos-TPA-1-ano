import javax.swing.JOptionPane;
public class questao1 
{
    public static void main(String[] args )
    {
        double al, sx, pih, pim;
        
        al = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em metros:"));
        sx = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu sexo: 1 para masculino e 2 para feminino:"));
        
        if (sx==1)
        {
            pih = (72.7*al)-58;
            JOptionPane.showMessageDialog(null, "O seu peso ideal é: "+pih);
        }
        
        else
        {
            pim = (62.1*al)-44.7;
            JOptionPane.showMessageDialog(null, "O seu peso ideal é: "+pim);      
        }
        
    }
    
}
