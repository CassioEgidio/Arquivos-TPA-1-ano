import javax.swing.JOptionPane;
public class numeros 
{
    public static void main(String[] args)
    {
        float ni, na, ns;
        
        ni = Float.parseFloat(JOptionPane.showInputDialog("Digite um numero inteiro:"));
        
        na = ni-1;
        ns = ni+1;
        
        JOptionPane.showMessageDialog(null, "O numero antecessor é: "+na+ ". O numero sucessor é: "+ns);
    }
}
