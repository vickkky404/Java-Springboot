import java.util.Scanner;
public class OddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entr thr Number: ");
        int N = sc.nextInt();

        if(N % 2 == 0 ){
            System.out.println(N + " is even number");
        }else{
            System.out.println(N + " is Odd number");
        }

        sc.close();
    }

}