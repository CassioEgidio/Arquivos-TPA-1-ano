import javax.swing.JOptionPane;
public class questao8
{
     public static void main(String[]args)
     {
         double l1, l2, l3;
         
         l1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado 1"));
         l2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado 2"));
         l3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado 3"));
         
         if((l1>0) && (l2>0) && (l3>0))
         {
             if((l1==l2) && (l2==l3))
             {
                  JOptionPane.showMessageDialog(null, "O triângulo é equilátero");
             }
             else
             {
                 if((l1==l2) && (l2!=l3))
                 {
                      JOptionPane.showMessageDialog(null, "O triângulo é isósceles");
                 }
                 else
                 {
                     if((l1==l3) && (l3!=l2))
                     {
                          JOptionPane.showMessageDialog(null, "O triângulo é isósceles");
                     }
                     else
                     {
                         if((l2==l3) && (l1!=l2))
                         {
                              JOptionPane.showMessageDialog(null, "O triângulo é isósceles");
                         }
                         else
                         {
                             if((l1!=l2) && (l2!=l3))
                             {
                                  JOptionPane.showMessageDialog(null, "O triângulo é escaleno");
                             }
                         }
                     }
                 }
             }
             
         }
         else
         {
             JOptionPane.showMessageDialog(null, "Não é um triângulo");
         }
         
     }
}
