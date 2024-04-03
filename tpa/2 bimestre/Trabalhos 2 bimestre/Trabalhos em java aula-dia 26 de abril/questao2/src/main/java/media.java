import javax.swing.JOptionPane;
public class media 
{
    public static void main(String[] args)
    {
        double m1, m2, s, mm;
        m1 = (8 + 9 + 7)/3;
        m2 = (4 + 5 + 6)/3;
        s = m1+m2;
        mm = (m1 + m2)/2;
        JOptionPane.showMessageDialog(null, "A média de 8, 9 e 7 é igual a: "+m1+ ". A média de 4, 5 e 6 é igual a: "+m2+ ". A soma dessas duas médias é igual a: "+s+ ". E a média dessas duas médias é igual a: "+mm);
    }
    
}
