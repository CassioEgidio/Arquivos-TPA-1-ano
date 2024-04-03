import javax.swing.JOptionPane;

public class questao5 
{
    public static void main(String[]args)
    {
        double n1, n2, n3, n4, media;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua primeria nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua segunda nota"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua terceira nota"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua quarta nota"));
        
        media = (n1+n2+n3+n4)/4;
        
        if(media>=9)
        {
             JOptionPane.showMessageDialog(null, "você foi aprovado, seu conceito foi A, e sua nota foi: "+media);
        }
        else
        {
            if(media>=7)
            {
                JOptionPane.showMessageDialog(null, "você foi aprovado, seu conceito foi B, e sua nota foi: "+media);
            }
            else
            {
                if(media>=5)
                {
                    JOptionPane.showMessageDialog(null, "você foi aprovado, seu conceito foi C, e sua nota foi: "+media);
                }
                else
                {
                    if(media>=2.5)
                    {
                        JOptionPane.showMessageDialog(null, "você foi reprovado, seu conceito foi D, e sua nota foi: "+media);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "você foi reprovado, seu conceito foi E, e sua nota foi: "+media);
                    }
                }
            }
            
        }
    }
    
}
