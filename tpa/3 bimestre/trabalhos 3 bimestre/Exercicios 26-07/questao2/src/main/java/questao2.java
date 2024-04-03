import javax.swing.JOptionPane;
public class questao2 
{
    public static void main(String[]args)
    {
        int num, qua=0, r=0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        
        for (qua=1; qua<=10; qua++){
        
            r=num*qua;
            
            JOptionPane.showMessageDialog(null, "o numero: "+num+ " x "+qua+ " é igual a "+r);
            
        }
        
    }
    
}
