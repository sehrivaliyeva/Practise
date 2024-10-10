package instanceOf;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        //bu hali yadinda saxla

        System.out.println(child instanceof Parent);
    }
}
