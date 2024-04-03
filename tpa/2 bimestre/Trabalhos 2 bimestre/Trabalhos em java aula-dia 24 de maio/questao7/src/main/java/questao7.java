import javax.swing.JOptionPane;
public class questao7
{
     public static void main(String[]args)
     {
         int dia1, mes1, ano1, dia2, mes2, ano2;
         
          dia1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia 1"));
          mes1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês 1"));
          ano1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano 1"));
          dia2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia 2"));
          mes2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês 2"));
          ano2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano 2"));
          
          if(ano1>ano2)
          {
               JOptionPane.showMessageDialog(null, "a data "+dia2+ "/" +mes2+ "/" +ano2+ " vem primeiro que " +dia1+ "/" +mes1+ "/" +ano1);
          }
          else
          {
              if(ano1<ano2)
              {
                   JOptionPane.showMessageDialog(null, "a data "+dia1+ "/" +mes1+ "/" +ano1+ " vem primeiro que " +dia2+ "/" +mes2+ "/" +ano2);
              }
              else
              {
                  if(mes1>mes2)
                  {
                       JOptionPane.showMessageDialog(null, "a data "+dia2+ "/" +mes2+ "/" +ano2+ " vem primeiro que " +dia1+ "/" +mes1+ "/" +ano1);
                  }
                  else
                  {
                      if(mes1<mes2)
                      { 
                          JOptionPane.showMessageDialog(null, "a data "+dia1+ "/" +mes1+ "/" +ano1+ " vem primeiro que " +dia2+ "/" +mes2+ "/" +ano2);
                      }
                      else
                      {
                          if(dia1>dia2)
                          {
                               JOptionPane.showMessageDialog(null, "a data "+dia2+ "/" +mes2+ "/" +ano2+ " vem primeiro que " +dia1+ "/" +mes1+ "/" +ano1);
                          }
                          else
                          {
                              if(dia1<dia2)
                              {
                                   JOptionPane.showMessageDialog(null, "a data "+dia1+ "/" +mes1+ "/" +ano1+ " vem primeiro que " +dia2+ "/" +mes2+ "/" +ano2);
                              }
                              else
                              {
                                  JOptionPane.showMessageDialog(null, "As datas são iguais");
                              }
                          }
                      }
                  }
              }
          }
     }
    
}
