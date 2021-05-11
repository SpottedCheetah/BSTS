public class test
{
    String Text;
    int a = 5;

    private void init()
    { 	String test;
        int c;
        Text = "Hallo, Welt!";

        if(a < 6)
        {
            int b = 6;
        }
        b = 7;
        if(a > 6)
        {
            c = 10;
        }
    }

    private void schreibe()
    {
        if(a < 3)
        {
            System.out.println("a ist kleiner 3");
            int d = 9;
            String test = "";
            System.out.println(test);

        }

        if(c > 10)
        {
            System.out.println("c ist nicht kleiner 3");
            System.out.println(Text);
        }

        if(d > 10)
        {
            System.out.println("d ist nicht kleiner 3");
        }

        System.out.println(test);

        System.out.println(Text);
    }
}
