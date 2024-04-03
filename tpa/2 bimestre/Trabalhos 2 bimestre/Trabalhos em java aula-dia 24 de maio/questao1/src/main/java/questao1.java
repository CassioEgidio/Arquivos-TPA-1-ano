import javax.swing.JOptionPane;
public class questao1 
{
    public static void main(String[]args)
    {
        float horas;
        
        horas = Float.parseFloat(JOptionPane.showInputDialog("Digite o horario do seu turno de trabalho:"));
        if (horas<5)
        {
             JOptionPane.showMessageDialog(null, "O seu turno de trabalho é de noite");
        }
        
        else if((horas>=5) && (horas<=12.59))
        {
             JOptionPane.showMessageDialog(null, "O seu turno de trabalho é de manhã");
        }
        else
        {
            if(horas<=20.59)
              {
                 JOptionPane.showMessageDialog(null, "O seu turno de trabalho é de tarde");
              }
            else
              {
                 JOptionPane.showMessageDialog(null, "O seu turno de trabalho é de noite");
              }
        }    
    }
    
}
