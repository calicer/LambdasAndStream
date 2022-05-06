package lambda;

public class Main {


    public static void main(String[] args) {

        Runnable r = ()-> System.out.println("a");

        Thread t = new Thread(r);
        t.start();

        MyLambda l = a -> a*a;

        System.out.println(l.foo(2));

        Lmda myL = s -> s.startsWith("C");

        System.out.println(myL.test("Char"));



    }

    interface MyLambda{
        int foo(int a);
    }
}
