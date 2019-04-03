public class FreshJuiceTest {

    public static void main(String args[]) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.Medium;
        System.out.println("size: " + juice.size);
        System.out.println(juice);
    }
}