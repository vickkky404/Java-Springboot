class Computer{
    public static void playMusic()
    {
        System.out.println("Music Playing");
    }

    public String getMePen(int cost)
    {
        return "pen";
    }

}

public class Methods1 {
    public static void main(String[] args){

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen( 10);
        System.out.println(str);
    }
}
