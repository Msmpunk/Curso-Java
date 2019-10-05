public class Operadores {
    
   // METODO PRINCIPAL
    public static void main(String[] args) {
        
        Operadores metodo = new Operadores();
        
        // Comparar numeros
        metodo.compararNumeros(7,8);
        System.out.println("\n");
        metodo.factorNumerosFor();
        System.out.println("\n");
        metodo.factorNumerosWhile();
        System.out.println("\n");
        metodo.factorNumerosDoWhile();
        
        System.out.println("\n");
        metodo.calculadoraSwich('/', 4, 2);
        
        // Concatenar palabras
    }
    
    //METODO QUE COMPARA NUMEROS
    public void compararNumeros(int a, int b){
        if(a>b){
            System.out.println("EL valor: " + a + " " + " Es mas grande que: " + b);
        }else{
             System.out.println("EL valor: " + b + " " + " Es mas grande que: " + a);
        }
    }
    
    // METODO QUE SUMA NUMEROS DOS PALABRAS
    public void factorNumerosFor(){
        for ( int i = 1; i <= 9; i ++ ) {
            System.out.println("3 x " + i + " = " + 3*i );
        }
    }
    
    public void factorNumerosWhile(){
        int factor = 1;
        while ( factor <= 9 ) {
           System.out.println("2 x " + factor + " = " + 2*factor );
           factor++;
        }
    }
    
    public void factorNumerosDoWhile(){
      int número = 4557888;
      int dígitos = 0;
      do {
         número /= 10;
         dígitos++;
      }
      while ( número > 0 );
      System.out.println(dígitos);
    }
    
    public void calculadoraSwich(char tipo, int a, int b){
        System.out.print("El resultado es : ");
        switch ( tipo ) {
            case '+':
                System.out.println( a + b );
                break;
            case '-':
                System.out.println( a - b );
                break;
            case '*':
                System.out.println( a * b );
                break;
            case '/':
                System.out.println( a / b );
                break;
            default:
                System.out.println("error" );
                break;
        }
    }
}
