import javax.swing.JOptionPane;
public class Exer1 
{
    public static void main(String[] args)
    {
        double[] num20 = new double [20];
        int i=0, entre0100=0, entre101200=0, maior200=0;
        
        for(i=0; i<20; i++)
        {
            num20[i] = Double.parseDouble(JOptionPane.showInputDialog("Entre com o "+(i+1)+"º numero"));
           
            if(num20[i]<=100)
            {
                entre0100 += 1;
            }
            else if(num20[i]<=200)
            {
                entre101200 += 1;
            }
            else if(num20[i]>200)
            {
                maior200 += 1;
            }
        }
        
         JOptionPane.showMessageDialog(null,"numeros de 0 a 100 "+entre0100+" numeros entre 101 a 200 "+entre101200+" numeros maior que 200 "+maior200);
        
    }
    
}
