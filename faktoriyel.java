import java.util.Scanner;

    public class faktoriyel {

    
 public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);

    int total=1 , a;

    System.out.print("Sayı giriniz :");

        a = inp.nextInt();
     
        for (int i = 1; i <=a; i++) total =total*i;{System.out.print(+total);
            
        }
    }
}
