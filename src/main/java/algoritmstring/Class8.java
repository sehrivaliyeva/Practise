package algoritmstring;

public class Class8 {

    //recursiya javada
    public static void main(String[] args) {
        method(5);

    }


    public static int method(int index) {
        if (index < 0) {
            return -1; // Baz vəziyyəti: index 0-dan kiçikdirsə -1 qaytar
        } else {
            System.out.println(index);
            return index + method(index - 1); // Recursive çağırış
        }
    }
}
