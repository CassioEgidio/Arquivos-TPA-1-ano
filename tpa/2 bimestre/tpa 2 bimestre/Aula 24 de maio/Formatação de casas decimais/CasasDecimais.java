
/* importando a "dll" necessária para formatar as casas decimais*/
import java.text.DecimalFormat;

public class CasasDecimais {

    public static void main(String[] args) {

        double nota1, nota2, nota3, nota4;
        double media;

        // Criando a formatação "chamada" umaCasa, responsável por apresentar somente um número após a vírgula
        DecimalFormat umaCasa = new DecimalFormat("0.0"); 
        // Criando a formatação "chamada" duasCasas, responsável por apresentar dois números após a vírgula
        DecimalFormat duasCasas = new DecimalFormat("0.00");

        nota1 = 5;
        nota2 = 5.5;
        nota3 = 4.3;
        nota4 = 3.7;

        media = (double) (nota1 + nota2 + nota3 + nota4) / 4;

        // solicitando a apresentação da variável com apenas uma casa decimal: ... umaCasa.format(variavel)
        System.out.println("Nota1 = " + umaCasa.format(nota1)); 
        System.out.println("Nota2 = " + umaCasa.format(nota2));
        System.out.println("Nota3 = " + umaCasa.format(nota3));
        System.out.println("Nota4 = " + umaCasa.format(nota4));

        if (media >= 6.0) {
            // solicitando a apresentação da variável com duas casas decimais: ..... duasCasas.format(variavel)
            System.out.println("O Aluno foi Aprovado com Media = " + duasCasas.format(media) + "\n"); 
        } else {
            System.out.println("O Aluno foi Reprovado com Media= "+ duasCasas.format(media) +"\n");
        }
    }
}