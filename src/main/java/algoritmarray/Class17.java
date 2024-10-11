package algoritmarray;

public class Class17 {
    public static void main(String[] args) {
//iki arrayin beraber olub olmadigini nece yoxlaya bilerem?
// eger iki arrayde eleemenlerin deyerleri eyni lakin yerleri ferqlidirse onlar eyni hesab olunmurlar

        int arr[] = {2, 5, 7};
        int arr1[] = {2, 8, 7};
        boolean beraberlik = true;

        if (arr.length == arr1.length && arr != null && arr1 != null) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr1[i]) {
                    beraberlik = false;
                    break;
                }
            }

            if (beraberlik) {
                System.out.println("Beraberlik");
            }else {
                System.out.println("Not Beraberlik");
            }

        }
    }
}
