/*
 * To change this template, choose Tools | Templates
        String s1[]=new String [5];
        String s2[]=new String [5];
           
            s1[0]="h";
            s1[1]="b";
            s1[2]="c";
            s1[3]= "d";
            s1[4]="e";
            
            s2[0]="f";
            s2[1]="2";
            s2[2]="i";
 * and open the template in the editor.
 */
package ejerciciosdevectores2;

/**
 *
 * @author FERNEY JARAMILLO
 */
public class EjerciciosdeVectores2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          
           
        // char o[] = copiarCadena (s1,s2);
        
         String j = "no di mi decoro cedi mi don";
         
         
       char  s1 []={'a','b'};
       
          char  s2 []={'c','d'};
          
      String p = "amor";
      String b= "amor";
          boolean f =espalindromo(j);
          System.out.println(f);
         /** char m[]=unirCadena(s1, s2);
         System.out.println(m[0]);
         System.out.println(m[1]);
         System.out.println(m[2]);
         System.out.println(m[3]);
        
         /** System.out.println("esta es la cadena unida");
          System.out.println(m[0]);
         System.out.println(m[1]);
         System.out.println(m[2]);
         System.out.println(m[3]);
         System.out.println(m[4]); 
         System.out.println(m[5]);
         System.out.println(m[6]);
         System.out.println(m[7]);
         System.out.println(m[8]);
         
         
         
         
         System.out.println("esta es la cadena s1");
         System.out.println(s1[0]);
         System.out.println(s1[1]);
         System.out.println(s1[2]);
         System.out.println(s1[3]);
         System.out.println(s1[4]); 
         System.out.println("esta es la cadena copiada");
         System.out.println(s2[0]);
         System.out.println(s2[1]);
         System.out.println(s2[2]);
         System.out.println(s2[3]);
         System.out.println(s2[4]);
        **/
    }
/**
 * Metodo que copia una cadena en otra.
 * @param s1: Cadena que representa un vector de caracteres 
 * @param s2: vector vacio de caracteres
 * @return un vector (s2) que contiene una copia de s1
 */
    private static char[] copiarCadena(char[] s1, char[] s2) {
     char a ;
        int j =0;
        for (int i =0 ; i<s1.length; i++){
         
            a=s1[0];
            s2[j]=a;
            j++;
        }
    
        return s2;
    }
    
     /**
   Metodo que copia una cadena con otra.
 * @param s1: Cadena que representa caracteres 
 * @param s2: cadena que representa  caracteres
 * @return true si las cadenas son iguales , las cadenas son iguales si tienen la misma longitud y tienen  iguales sus elemntos.   
     */
    
  public static Boolean SonCadenasIguales (  String s1 , String s2){
         int iguales =0;
         char v1[]= s1.toCharArray();
         char v2[]= s2.toCharArray();
         
         if ( v1.length==v2.length){
         
              for (int i = 0 ; i<v1.length;i++){
          
                 for (int j =0 ; i <v2.length;j++){
          
                     if (v1[i]==v2[j]){
                     iguales ++;
          
                     }
                if ( iguales ==v1.length){
          
                     return true;
          
                     }
                   }
          
                  }
         
         }
      
         return false;
 
 }
    
    /**
   Metodo que copia una cadena con otra.
 * @param s1: Cadena que representa un vector de caracteres 
 * @param s2: cadena que representa un vector de caracteres
 * @return un vector (nuevo) que contiene una las dos cadenas.   
     */
     public static boolean espalindromo(String cadena){
    boolean valor=true;
    int i,ind;    
    String cadena2="";
    
    //quitamos los espacios
    for (int x=0; x < cadena.length(); x++) {
        if (cadena.charAt(x) != ' ') {
            cadena2 += cadena.charAt(x);
        
        }
    }
    //volvemos a asignar variables
    char v1[] = cadena2.toCharArray();
    char v2[]= v1;
    int j = v1.length-1;
    
    //comparamos cadenas
    for (i= 0 ;i < (cadena.length()); i++){        
       if (v1[i] ==v2[j]==false ) {
           //si una sola letra no corresponde no es un palindromo por tanto
           //sale del ciclo con valor false
            valor=false;
            break;
       }
       j--;
    }
    
    return valor;
}

 /**
   Metodo que  une una cadena con otra.
 * @param s1: vector que representa un vector de caracteres 
 * @param s2: vector que representa un vector de caracteres
 * @return un vector (nuevo) que contiene una las dos cadenas unidas.   
     */
     
    private static char[] unirCadena (char[]s1 , char[]s2){
       
        int cont = 0 ;
        //v1 = a, b y v2 c ,d
        char nuevo [] = new char[s1.length+s2.length];
        // tamaño de nuevo 4
        for (int i =0 ; i<s1.length;i ++){
        
          nuevo [cont++]= s1[i];
       
    
        }
      for (int j =0; j<s2.length;j++){
        // cont 2 
        nuevo[cont++] =s2[j];
     
        }
        return nuevo;
      
        }
 /**
   Metodo que copia una cadena con otra.
 * @param frase1: Cadena que representa una frase. 
 * @param frase2: cadena que representa una frase la cual sera la que se buscara cuantas veces esta en la otra.
 * @return un numero de veces que esta la cadena en frase 1.   
     */
    public static int estaNveces(String frase1,String cadena){
       
      String cadena2="";
     int contLetras =0;
     int conPalabras=0;
    //quitamos los espacios
    for (int x=0; x < cadena.length(); x++) {
        if (cadena.charAt(x) != ' ') {
            cadena2 += cadena.charAt(x);
        
        }
    }
        char v1[] = cadena2.toCharArray();
        char v2[]=cadena.toCharArray();
        int j =0;
        
        for (int i = 0 ;i<v1.length;i++) {
         
            if (v1[i]==v2[j]){
           contLetras++;
           j++;
        }
         else{
         i =i-1;
         j=0;
       
         }
           if (contLetras==v2.length){
           
           conPalabras++;
           
           }  
        
        }
     
        return conPalabras;
   
    }
     public static String[][] insertarOrdenado (String frase1,String Matriz[][]){
       
         
         
         return null;
    }
     
     public static int cantFrases(String frase1,String cadena){
         return 0;
}
public static String imprimirEnLineas ( String frase){
        return null;

}

 public static String convertirEnMayusculas(String frase1){
        return null;
}

 public static String convertirEnMinusculas(String frase1){
        return null;
 }
 
}