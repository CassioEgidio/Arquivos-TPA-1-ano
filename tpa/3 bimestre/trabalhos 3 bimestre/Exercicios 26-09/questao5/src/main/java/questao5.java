import javax.swing.JOptionPane;
public class questao5 
{
    public static void main(String[] args)
    {
        double base, altu, hipo;
        
         base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo:"));
         altu = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo:"));
         
         hipo = hipotenusa(base, altu);
         
         JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: "+hipo);
    }
    
     static double hipotenusa(double bas, double alt)
     {
         double resul;
         
         resul = bas*bas + alt*alt;
         return Math. sqrt(resul);
     }
}
