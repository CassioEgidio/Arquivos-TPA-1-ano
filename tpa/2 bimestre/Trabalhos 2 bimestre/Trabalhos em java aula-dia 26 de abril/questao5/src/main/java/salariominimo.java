import javax.swing.JOptionPane;
public class salariominimo 
{
    public static void main(String[] args)
    {
        float sm, su,r;
        
        sm = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salario minimo:"));
        su = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do seu salario:"));
        
        r = su/sm;
        
        JOptionPane.showMessageDialog(null, "Você ganha: "+r+ " Salario(s) minimo(s)");
    }
}
