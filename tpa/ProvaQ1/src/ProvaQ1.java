import javax.swing.JOptionPane;
public class ProvaQ1 {

    public static void main(String[] args) {
        
        int[] N = new int[10];
        int i;
        
        for(i=0; i<10; i++)
        {
            N[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " +(i+1) +"º número:"));
        }
        for(i=0; i<10; i++)
        {
            System.out.println(("vetor N: "+N[i]));
        }
        int[] I = new int[10];
        int r=9;
        
        for(i=9; i>=0; i--)
        {
            I[r--] = N[i];
        }
        for(r=9; r>=0; r--)
        {
            System.out.println(("vetor I: "+I[r]));
        }
    }
}
