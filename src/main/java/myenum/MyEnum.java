package myenum;

public enum MyEnum {

    //enumda deyisenle istenilen access modofierde ola biler amma final olmalidirlar
    //constructorda deyisen yazmaq lazmdir eks halda cunki hemin deyiseni constructora gondermeyin menasi olmur
    // yeni istifade olunmuyacagsa niye gonerek
    //enumda constructor hemise private olur
    //sirg enumun oz deyisenleri static ve final olur--boyuk herfle yazilanlar

    MONDAY(1), SUNDAY(7), FRIDAY(5);

    final int sira;

    MyEnum(int sira) {
        this.sira = sira;
    }

    public static void main(String[] args) {

        MyEnum myEnum = MyEnum.MONDAY;
        System.out.println(myEnum.sira);

        //VALUES() METODU BIR BIR HANSI DEYISENLER VARSA GETIRIR.ENUM ARRAYI QAYTARIR GERIYE

        MyEnum[] enumes = MyEnum.values();
        for (MyEnum e : enumes) {
            System.out.println(e);
        }

        //ORDINAL() METODU DEYISENIN YERINI BILDIRIR
        int yeri = myEnum.ordinal();
        System.out.println(yeri);

        //VALUEOF() hansi enum lazmdirsa onu daxil edirik ve eger movcuddursa geri qaytarir
        //eger bu element olmazsa illegal argument exception cixir

        MyEnum me=MyEnum.valueOf("FRIDAY");
        System.out.println(me);
        int yoxlanis=MyEnum.valueOf("MONDAY").ordinal();
        System.out.println(yoxlanis);

    }
}
