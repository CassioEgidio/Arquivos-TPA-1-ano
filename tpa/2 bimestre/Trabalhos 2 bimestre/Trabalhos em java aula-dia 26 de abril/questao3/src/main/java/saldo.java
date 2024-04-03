import javax.swing.JOptionPane;
public class saldo 
{
    public static void main(String[] args)
    {
        double s, r, sf;
        s = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu saldo"));
        r = (s*1)/100;
        sf = s+r;
        JOptionPane.showMessageDialog(null, "O saldo final com reajuste de 1% é igual a: "+sf);
        
        
    }
}
