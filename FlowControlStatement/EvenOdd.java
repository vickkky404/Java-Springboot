import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer to check It is Even or Odd: ");
        int num = sc.nextInt();

        if(num % 2 == 0 ){
            System.out.println(num + " is Even");
        }else{
            System.out.println(num + " is Odd");
        }

        sc.close();
    }
}