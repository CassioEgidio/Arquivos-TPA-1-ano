import javax.swing.JOptionPane;
public class questao3 
{
    public static void main(String[] args )
    {
        double n1, n2, soma;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));
        
        soma = n1+n2;
        
        JOptionPane.showMessageDialog(null, "A soma é: "+soma);
        
        if(soma>25)
        {
            JOptionPane.showMessageDialog(null, "Soma maior que 25");
        }    
    }
    
}
