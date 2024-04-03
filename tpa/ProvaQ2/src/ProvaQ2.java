import javax.swing.JOptionPane;
public class ProvaQ2 {

    public static void main(String[] args) {
        
        int[] PV = new int[5];
        int i;
        
        
        for(i=0; i<5; i++)
        {
            PV[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " +(i+1) +"º número:"));
        }
        
         for(i=0; i<5; i++)
        {
            System.out.println(("Primeiro Vetor: "+PV[i]+"/n"));
        }
         
        int[] SV = new int[5];
        int j;
        
        for(j=0; j<5; j++)
        {
            SV[j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " +(j+1) +"º número:"));
        }
        for(j=0; j<5; j++)
        {
            System.out.println(("Primeiro Vetor: "+SV[j]));
        }
        
        int[] RV = new int[5];
        int k;
        
        for(i=0; i<5; i++)
        {
            for(j=0; j<5; j++)
            {
                for(k=0; k<5; k++)
                {
                  RV[k] = PV[i] + SV[j];
                }
            }
        }
        
        for(k=0; k<5; k++)
        {
            System.out.println(("Resultado soma dos vetores: "+RV[k]));
        }
    }
    
}
