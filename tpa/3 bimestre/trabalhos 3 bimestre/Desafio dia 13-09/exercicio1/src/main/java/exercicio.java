import javax.swing.JOptionPane;
public class exercicio 
{
    public static void main(String[] args)
    {
        String[] nomes = new String [10];
        double[] media = new double [10];
        double[][] notas= new double [10][3];
        int l, c;
        double soma=0;
        
             JOptionPane.showMessageDialog(null,"Digite os nomes e as notas dos alunos:"); //avisos
        
        for(l=0; l<10; l++) //recebendo od dados
        {
         nomes[l] = JOptionPane.showInputDialog("Insira o nome do "+(l+1)+"º aluno");
            for(c=0; c<3; c++)
            {
                notas[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite a "+(c+1)+"º nota do " +(l+1)+ "º aluno:"));
                
                soma += notas[l][c];
            }
            media[l] = soma/3;
            soma=0;
        }
         System.out.print("\t\t");
         System.out.print("***Média escolar***" + ("\n\n"));
         
         System.out.print("Nomes"+("\t\t\t"));
         System.out.print("Notas"+("\t\t\t"));
         System.out.print("Média"+("\n\n"));
        
        for(l=0; l<10; l++) //imprimindo eles 
        {
         System.out.print(nomes[l]+"\t\t");
            for(c=0; c<3; c++)
            {
                System.out.print(notas[l][c]+"\t");
            }    
           System.out.print("\t");
       
           if(media[l]<7)
           {
                System.out.print(media[l]+"*"+"\n");
           }
           else
           {
                System.out.print(media[l]+"\n");
           }
        } 
    }
}
