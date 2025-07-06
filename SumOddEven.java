import java.util.Scanner;
public class SumOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();


        int sum = num1 + num2;

        if(sum % 2 == 0){
            System.out.println("The sum ("+ sum +") is Even  ");
        }else{
            System.out.println("The sum("+sum+") is Odd");
        }

        sc.close();
    }
}
