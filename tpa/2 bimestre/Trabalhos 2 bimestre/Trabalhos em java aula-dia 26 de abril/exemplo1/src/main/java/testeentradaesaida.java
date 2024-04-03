import javax.swing.JOptionPane;
public class testeentradaesaida 
{
    public static void main(String[] args)
    {
        String numero = JOptionPane.showInputDialog("Digite um numero:");
                
        JOptionPane.showMessageDialog(null, "O numero digitado foi: "+numero);        
    }
    
}
