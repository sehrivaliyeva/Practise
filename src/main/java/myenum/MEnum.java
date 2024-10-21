package myenum;

public enum MEnum implements MyInterface {

    //metod her iki sekilde override oluna biler---interfaceden gelen metod
    //enumun daxilinde abstract metodda yarada bilerik, bu zaman herbir enum sabiti o metodu override etmelidir
    //enum daxilinde de deyisen yaradib onu  metodlarda istifade ede bilerik

    RED {
        @Override
        public void method() {
            System.out.println("MEnum method red");
        }

        ;

        @Override
        public void amethod() {
            System.out.println("MEnum amethod red");
        }

    },
    BLACK {
        @Override
        public void amethod() {
            System.out.println("MEnum amethod black");
        }

    },
    GREEN {
        int a = 3;

        @Override
        public void amethod() {
            System.out.println("MEnum amethod green");
            System.out.println(a);
        }
    };

    public abstract void amethod();

    @Override
    public void method() {
        System.out.println("MEnum method");
    }

    public static void main(String[] args) {
        MEnum enum1 = MEnum.RED;
        enum1.method();
        MEnum enum2 = MEnum.GREEN;
        enum2.amethod();


    }
}
