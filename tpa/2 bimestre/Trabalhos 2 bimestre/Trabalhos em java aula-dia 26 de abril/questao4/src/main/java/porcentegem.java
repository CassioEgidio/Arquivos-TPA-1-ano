import javax.swing.JOptionPane;
public class porcentegem 
{
    public static void main(String[] args)
    {
        double cp1, vup1, qp1, cp2, vup2, qp2, ipi, r;
        
        ipi = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da percentagem IPI a ser acrescida no valor das peças:"));
        cp1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o código da peça 1:"));
        vup1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitario da peça 1:"));
        qp1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de peças 1:"));
        cp2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o codigo da peça 2:"));
        vup2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitario da peça 2:"));
        qp2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de peças 2:"));
        
        r = (vup1*qp1 + vup2*qp2)+(ipi/100+1);
        
        JOptionPane.showMessageDialog(null, "O valor todal a ser pago pelas peças é de: "+r);
    }
}
