
public class string {

      public static void main(String[] args)
      {
         String str = "Isto é uma string de Java";
         String xyz = new String("Isto é uma String do Java");
         if( str == xyz )
             System.out.println("IGUAL");
         else 
             System.out.println("DIFERENTE");
         if( str.equals( xyz ) ) 
        //MANEIRA CORRETA DE SE COMPARAR O CONTEÚDO DAS STRINGS 
         System.out.println( "Tamanho da string: " + str.length() );
         System.out.println( "SubString: " + str.substring(0, 10) );
         System.out.println( "Caracter na posição 5: " + str.charAt(5) );
         //outros metodos 
         // quebra sempre que começa o espaço
         String[] palavras = str.split(" ");
         System.out.println("palavra: "+palavras[0]);
         System.out.println("palavra: "+palavras[1]);
         System.out.println("palavra: "+palavras[2]);
         //aponta o index
         int i = str.indexOf("uma");
         System.out.println("Indice: "+ i);//o indice conta a partir do 0
         //compara o inicio e o fim da string
         boolean teste=( str.startsWith("Olá") || str.endsWith("Mundo")); 
         System.out.println("Resultado: " + teste);
         //elimina os espaços vazios no inicio e fim da string
         str = str.trim();
         System.out.println(str);
         //substitui os caracteres
         str = str.replace('a','@'); //substitui os caracteres
         System.out.println(str);
         // substitui palavras 
         str = str.replaceAll("string","Cadeia de caracteres");
         System.out.println(str);
      }
 }
