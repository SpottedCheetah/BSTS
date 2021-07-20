import java.awt.*;

public class SITests {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0,0,1,1);
        Rectangle r2 = new Rectangle(0,0,1,1);
        System.out.println(r1.contains(r2));
    }
}
