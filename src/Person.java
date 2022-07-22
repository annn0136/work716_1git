import java.util.Arrays;
import java.util.Date;

/**
 * @auther linginl
 * @create 2022-07-21-23:12
 */
public class Person {



    private static int add;
    private static int add1;
    public int age;
    public Date birthday;
    public static void main(String[] args) {
        extracted1();

        add1 = add;
        int add = new Person().add(12, 323);
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("add = " + add);
        System.out.println("Person.main");
        System.out.println(1);
        for (String arg : args) {
            System.out.println(args);
        }
        if (args != null) {

        }



        for (int i = 0; i <3 ; i++) {

        }
    }

    private static void extracted1() {
        System.out.println("person");
    }

    public int add(int a, int b) {
        for (int i = 0; i < 3; i++) {
            System.out.println("ff");
        }
        int add = add(a,b);
        return a + b;

        // TODO: 2022/7/22 f

    }


}


