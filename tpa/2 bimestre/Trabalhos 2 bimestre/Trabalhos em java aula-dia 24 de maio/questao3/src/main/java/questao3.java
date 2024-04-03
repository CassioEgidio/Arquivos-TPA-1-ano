import javax.swing.JOptionPane;
public class questao3 
{
      public static void main(String[]args)
      {
          int lanche;
          
          lanche = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero so seu lanche:"+"\n" 
          +"1. BigMac"+"\n"+"2. Quarteirão"+"\n"+"3. MecChicken"+"\n"+"4. CheddarMacMeld"+"\n"+"MacMax"));
          
          switch(lanche)
          {
              case 1:
                  JOptionPane.showMessageDialog(null,"O lanche escolhido foi o BigMac");
                  break;
              case 2:
                  JOptionPane.showMessageDialog(null,"O lanche escolhido foi o Quarteirão");
                  break;
              case 3:
                  JOptionPane.showMessageDialog(null,"O lanche escolhido foi o MecChicken");
                  break;
              case 4:
                  JOptionPane.showMessageDialog(null,"O lanche escolhido foi o CheddarMacMeld");
              default:
                  JOptionPane.showMessageDialog(null,"Opção invalida");
          }
      }
    
}
