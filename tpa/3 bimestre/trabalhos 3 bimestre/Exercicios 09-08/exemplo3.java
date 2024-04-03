import javax.swing.JOptionPane;
public class exemplo3 {
    public static void main (String[]args){
        int i;
        double sal_minimo=1000.00;
        double [] salarios= new double[10];
        // atribuição do calculo do vetor salarios
        for(i=0;i<salarios.length;i++){
            salarios [i]=(i+1)*sal_minimo;
        }
        // exibição dos dados calculado no vetor salarios
        for(i=0;i<salarios.length;i++){
          System.out.println((i+1)+" Salario(s) Minimo(s) = "+salarios[i]+"\n" );
        }
    }
}
