import javax.swing.JOptionPane;
public class questao2 
{
    public static void main(String[] args)
    {
        int[] numeros = new int [10];
        int i;
        
        for(i=0; i<numeros.length; i++)
        {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " +(i+1)+ "º numero:"));
        }
        
        for(i=0; i<numeros.length; i++)
        {
            JOptionPane.showMessageDialog(null, (i+1)+ " º numero foi: " + numeros[i]);
        }
    }
    
}
