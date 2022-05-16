import java.util.*;

import javax.xml.stream.events.EndElement;
public class ej1   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int entero;
        int[] lista={1,2,3,4,5};
        System.out.println("ingresa numero");
        entero=sc.nextInt();
        int []Mrotado = rotarIzquierdaArray(lista);
        System.out.println("matriz rotada: "+ Arrays.toString(Mrotado));

    }
    public static int [] rotarIzquierdaArray(int [] lista){
        int aux;
        for (var i=0;i<lista.length-1;i++){
            aux=lista[1+i];
            lista[1+i]=lista[0];
            lista[0]=aux;

        }
        return lista;
    
        
    }
}