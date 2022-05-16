import java.util.*;

import javax.xml.stream.events.EndElement;
public class ej1   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int aux,entero;
        int[] lista={1,2,3,4,5};
        System.out.println("ingresa numero");
        entero=sc.nextInt();

        for (var i=0;i<lista.length-1;i++){
            aux=lista[1+i];
            lista[1+i]=lista[0];
            lista[0]=aux;

        }
        for(int i=0;i<lista.length;i++)
        {
            System.out.print(lista[i]+",");
        }


        
    }
}