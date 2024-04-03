import javax.swing.JOptionPane;
public class questao1 
{
    public static void main(String[] args)
    {
         String n;
         double n1=0, n2=0, m=0;
         
         n = (JOptionPane.showInputDialog("Digite o nome do aluno"));
         n1 = ler_nota();
         n2 = ler_nota();
         m = calcular_media(n1, n2);
         
         if(m>7)
         {
            JOptionPane.showMessageDialog(null,"O "+n+ " foi aprovado com nota de: "+m);
         }
         else
         {
             JOptionPane.showMessageDialog(null,"O "+n+ " foi reprovado com nota de: "+m);
         }
    }
    
    static double ler_nota()
    {
         double numero;
         numero = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota"));
         return numero;
    }
    
    static double calcular_media (double num1, double num2)
    {
        double me;
        me = (num1+num2)/2;
        return me;
    }
    
}
