public class Calculator{
    public int add(int a , int b){
        return a+b;
    }

    public int add(int a, int b , int c){
        return a + b + c;
    }
    public double add(double a , double b){
        return a+b;
    }
    public String add(String a , String b ){
        return a + b ;
    }

    public static void main(String[] args){
        Calculator calc = new Calculator();

    System.out.println("Adding two integers: " + calc.add(5, 3));
        System.out.println("Adding three integers: " + calc.add(5, 3, 2));
        System.out.println("Adding two decimals: " + calc.add(5.5, 3.2));
        System.out.println("Adding two strings: " + calc.add("Hello", "World"));
    }
}