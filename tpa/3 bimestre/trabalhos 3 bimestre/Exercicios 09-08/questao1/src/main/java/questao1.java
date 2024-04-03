import javax.swing.JOptionPane;
public class questao1 
{
    public static void main(String[] args)
    {
        int[] numero = new int [15];
        int i;
        
        for (i=0; i<15; i++)
        {
            numero[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o " +(i+1)+ "º numero:"));
        }
        for (i=2; i<15; i++)
        {
            if (i % 2==0)
            {
                JOptionPane.showMessageDialog(null, "No indice " +i+ "º o numero é: " + numero [i]);
            }
        }
    }
    
}
