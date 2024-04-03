import javax.swing.JOptionPane;
public class exemplo7 {
        public static void main (String[]args){
        final int N_lin=3, N_col=3;   
        int [][] mat= new int [N_lin][N_col];
        int l,c;
        JOptionPane.showMessageDialog(null,"*****Cadastrando dados da matriz*****\n Entre com o valor em cada posição da matriz");
        //atribuição dos valores na matriz
        for (  l=0; l<N_lin; l++) {
            for (  c=0; c<N_col; c++) {
                mat[l][c]=Integer.parseInt(JOptionPane.showInputDialog("Valor linha " +(l+1)+ " coluna"+(c+1)+"::")); 
            }//fim da coluna
          }// fim da linha
         JOptionPane.showMessageDialog(null,"***** Exibindo os dados da matriz*****");
         //exibição dos valores na matriz
         for (  l=0; l<N_lin; l++) {
            for (  c=0; c<N_col; c++) {
                System.out.print(mat[l][c]+"");
             } //fim do for da coluna
            System.out.print("\n");//para organizar a apresentação em linhas diferente
           }//fim do for da linha
        }   
}