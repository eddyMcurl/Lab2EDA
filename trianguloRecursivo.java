import java.util.*;
public class  trianguloRecursivo {
    public static void main(String[] args) {
        int num , nt;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa valor");
        num=sc.nextInt();
        trianguloRecursivo(num);

    }
    public static void trianguloRecursivo(int num){ 
        for(int i =0;i<num;i++){
           
            for(int j=0;j<=i;j++){
                System.out.print("* ");
           
            }
        System.out.println();
        }

    }
}
