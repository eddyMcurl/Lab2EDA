import java.lang.reflect.Array;
import java.util.*;
public class  ejIvertirMatriz {
    public static void main(String[] args) {
        int [] lista = {1,2,3};
        int [] Ain= Minvertida(lista);
        
        System.out.println("matriz original: "+ Arrays.toString(lista));
        System.out.println("matriz invertida: "+ Arrays.toString(Ain));
    }
    static int [] Minvertida(int [] lista){  
        int cuenta=0;
        int [] liA=new int[lista.length];
        for(int i=lista.length-1;i>=0;i--){
            
            liA[cuenta]=lista[i];
            cuenta++;
        }
        return liA;
        

    }
}
