import javax.swing.JOptionPane;
public class exemplo2 {
     public static void main (String[]args){
         String palavra;
         int i;
         //recebendo valor para variavel criada
         palavra=JOptionPane.showInputDialog("Digite uma palavra:: ");
          System.out.println("\n Vogais da palavra: \t"+palavra+"\n");
          //A função toCharArry() separa cada caracter da palavra
          char[] vetor=palavra.toCharArray();
          int tamanho=vetor.length;
          for(i=0;i<tamanho;i++){
              // apresentando as vogais da palavra digitada, verifica se a letra do momento é uma vogal
              if(vetor[i]=='a'||vetor[i]=='e'||vetor[i]=='i'||vetor[i]=='o'||vetor[i]=='u'){
                  System.out.println(vetor[i]+"");
              }
          }
     }
}
