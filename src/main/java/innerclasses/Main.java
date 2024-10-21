package innerclasses;

public class Main {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        Outer.Inner.statica = 5;
        Outer.Inner.staticmethod();
        inner.objectmethod1();
        inner.objecta = 5;

        Outer.Inner1.staticb=9;
    }
}
