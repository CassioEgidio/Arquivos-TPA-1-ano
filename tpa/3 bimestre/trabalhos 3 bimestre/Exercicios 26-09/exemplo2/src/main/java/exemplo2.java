import javax.swing.JOptionPane;
public class exemplo2 
{
    public static void main(String[] args)
    {
        int t;
        String p;
        digite();
        p = JOptionPane.showInputDialog("Digite uma palavra qualaquer: ");
        t = tamanho(p); 
        JOptionPane.showMessageDialog(null,p+" possui "+t+" caracteres");
    }
    
    static void digite()
    { 
        JOptionPane.showMessageDialog(null, "Digite uma palavra");
    }
    
    static int tamanho (String x)
    {
        return x.length();
    }
}
