import java.lang.reflect.Array;
import java.util.*;
public class  ejIvertirMatriz {
    public static void main(String[] args) {
        int [] lista = {1,2,3};
        int [] liA=new int[lista.length];
        int cuenta=0;
       
        for(int i=lista.length-1;i>=0;i--){
            
            liA[cuenta]=lista[i];
            cuenta++;
        }
        System.out.println("matriz original: "+ Arrays.toString(lista));
        System.out.println("matriz invertida: "+ Arrays.toString(liA));

    }
}
