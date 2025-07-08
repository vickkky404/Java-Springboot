package OOPS;

class Human{
    private  int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void  int setAge(){
        return age;
    }



    public String getName(){
        return name;
    }
} 

public class Encapsulation {
    // keeping it close , keeping it tight , provides data security..
    // helps in providing only important info that is required only
    
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(30);

        //obj.age = 11;
        //obj.name = "Navin";

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}