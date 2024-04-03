import javax.swing.JOptionPane;
public class questao2 
{
     public static void main(String[]args)
     {
         float peso, altura, r;
         
         peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu peso:"));
         altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura:"));
         
         r = peso/(altura*altura);
         
         if(r<18)
         {
             JOptionPane.showMessageDialog(null, "você esta magro, o seu IMC é de: "+r);
         }
         else
         {
             if(r<24.9)
             {
                  JOptionPane.showMessageDialog(null, "você esta saudavel, o seu IMC é de: "+r);
             }
             else
             {
                 if (r<29.9)
                 {
                     JOptionPane.showMessageDialog(null, "você esta com sobrepeso, o seu IMC é de: "+r);
                 }
                 else if(r>=30)
                 {
                     JOptionPane.showMessageDialog(null, "você esta obeso, o seu IMC é de: "+r);
                 }
             }
             {
                 
             }
         }
     }
    
}
