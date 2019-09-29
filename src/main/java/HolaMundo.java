
public class HolaMundo {
    
   // METODO PRINCIPAL
    public static void main(String[] args) {
        var mensaje = "Hola Mundo";
        var mensaje2 = "Soy Mario";
        
        HolaMundo Hola = new HolaMundo();
        
        // Primer Hola Mundo
        System.out.println("Mi primer" + " " + mensaje );
        
        // Segundo hola mundo
        Hola.saludar(mensaje);
        
        // Concatenar palabras
        Hola.unirPalabras(mensaje, mensaje2);
    }
    
    //METODO QUE SALUDA
    public void saludar(String mensaje){
        System.out.println("Este es un mensaje: " + mensaje );
    }
    
    // METODO QUE CONCATENA DOS PALABRAS
    public void unirPalabras(String palabra1, String palabra2){
        
        // CARACTER ESPECIAL (\n) SALTO DE LINEA
        System.out.println("Palabra 1: \n" + palabra1);
        System.out.println("Palabra 2: \n" + palabra2 );
        
        // CARACTER ESPECIAL (\t) TABULACIÓN
        System.out.println("Tu union es: \t" + palabra1 + " " + palabra2 );
    }
}
