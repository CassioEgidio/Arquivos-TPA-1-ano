import javax.swing.JOptionPane;
public class questao1 
{
    public static void main(String[]args)
    {
        int val=2;
        
        while (val < 20) {
            JOptionPane.showMessageDialog(null, "o numero é: "+val);
            val+=2;
            
        }
    }
}
