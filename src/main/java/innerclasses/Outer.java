package innerclasses;

public class Outer {

    //outer classda yerlesen object deyisen ve metodlarini static inner classda istifade ede bilmirik
    //object deyisenlerini ve metodlarini bu class daxilinde istenilen yerde
    // object yaratmadan istifade ede bilirik
    //eger inner class static metodun daxilindedirse obj deyisen ve metodlari ist oluna bilmir
    //ancaq obj metodunun daxilindedirse istifade oluna bilir


    int outera;
    static int outerb;


    //filed inner classlar istenilen access modifierde olar
    //hemin classlarin daxilinde static deyisen ve metodlar yarada bilerem, istenilen access modifierde
    //ola bilerler
    //hem de object deyisen ve metodlari yarada bilerem, istenilen access modifierde ola bilerler

    protected class Inner {
        static int statica;

        static void staticmethod() {
            System.out.println("men inner class metoduyam");
        }

        public int objecta;

        protected void objectmethod1() {
            outera = 8;
            System.out.println(outera);
        }


    }

    //outer class daxilinde static inner class yaratmaq mumkundur
    //ve bu inner class istenilen access modifikatorda ola biler
    //sttaic inner class daxilinde hem obj hem de static deyisenler yaramq mumkundur
    //ve bu deyisenler de istenilen access modifikatorda ola bilerler

    static class Inner1 {
        protected static int staticb;

        static void staticmethodb() {

        }

        protected int objectb;

        void objectmethodb() {

        }


    }

    // method daxilinde yaradilan inner classa access modifikator yazmaq olmur
    // default accesss modifikatora sahib olurlar
    //amma bu class daxilinde hem obj hem de static deyisenler, methodlar yaratmaq olur
    // bu deyisen ve methodlar istenilen access mod ola biler
    // bu classdan yalniz method daxilinde istifade elemek olur diger yerlerde yox


    public void outerClassMethod() {
        class MethodClass {

            static private int a;

            void method() {
                System.out.println(outerb);
                System.out.println(outera);
            }

            public int b;

            public void method1() {

            }

        }

    }

    //nested interface yaratmaq mumkundur diger inner classlar bu interfaceni
    //implements ede bilerler
    //basqa classlar terefinden de implementasiya edile bilrler outerclass.interface bu formada

    public interface MyInterface {
        void interfaceMethod();
    }


}
