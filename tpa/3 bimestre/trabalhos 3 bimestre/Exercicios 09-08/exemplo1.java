import javax.swing.JOptionPane;
public class exemplo1 {
    public static void main (String[]args){
        //Criação da variavel com 10 posições (0 a 9)
         String[] nomes= new String [10];
         //Criação da variavel de controle do for
         int i;
         for(i=0;i<10;i++){
             //Recebendo valores para cada variavel criada
             nomes[i]=JOptionPane.showInputDialog("Digite o " +(i)+ "° nome");
         }
          for(i=0;i<10;i++){
             //Recebendo valores para cada variavel criada
           System.out.println((i+1)+"° nome:: " +nomes[i]);
         }
    }
}
