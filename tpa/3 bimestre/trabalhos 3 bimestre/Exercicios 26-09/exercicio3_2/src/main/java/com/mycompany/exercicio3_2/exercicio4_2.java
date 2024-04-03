import javax.swing.JOptionPane;
public class exercicio4_2 
{
    public static void main(String[] args)
    {
        int escolha;
        
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta que vc quer executar\n 1 - Soma\n 2 - Subtração\n 3 - Divisão\n 4 - Multiplicação\n 5 - Resto da Divisão\n 6 - Dobro\n 7 - Quadrado\n 8 - Cubo\n 9 - Raiz Quadrada\n 0 - Sair\n"));
        
        calculos(escolha);
    }
    
    static void calculos(int esco)
    {
        double resultado=0, num1=0, num2=0;
        
        if(esco == 0)
        {
            JOptionPane.showMessageDialog(null, "Você saiu do programa");
        }
        else
        {    
            if(esco<=5)
            {
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));  
            }
            else
            {
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
            }
        }
                switch(esco)
                {
                case 1:
                    resultado = num1+num2;
                    break;
                case 2:
                    resultado = num1-num2;
                    break;
                case 3:
                    resultado = num1/num2;
                    break;
                case 4:
                    resultado = num1*num2;
                    break;
                case 5:
                    resultado = num1 % num2;
                    break;
                case 6:
                    resultado = num1*2;
                    break;
                case 7:
                    resultado = num1*num1;
                    break;
                case 8:
                    resultado = num1*num1*num1;
                    break;
                case 9:
                    resultado =  Math. sqrt(num1);
                    break;    
                }
                
         if(esco!=0)
         {
             JOptionPane.showMessageDialog(null, "o resultado é "+resultado);
         }
    }
}
    

