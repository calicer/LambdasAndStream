package lambda;

public class Parent {
    private int b;

    public Parent(){
        Runnable r = ()-> System.out.println("kj");
    }

    public Parent(int a){
        this.b = a;
    }
}
