import javax.swing.JOptionPane;
public class idade 
{
    public static void main(String[] args)
    {
         int ano, mes, dia, r;
         ano = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos você tem: "));
         mes = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos meses você tem: "));
         dia = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos dias você tem: "));
         r = (ano*365) + (mes*30) + dia;
         JOptionPane.showMessageDialog(null, +ano+ " anos " +mes+ " meses " +dia+ " dias = " +r+ " dias.");
            
            
    
     }       
        
    
    
}
