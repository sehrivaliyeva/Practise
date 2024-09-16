package algoritm;

public class Class4 {
    public static void main(String[] args) {
        //qonsularindan balaca olmayan elementleri tapin
        //yeni peak elemt bu hem oz qosusuna beraber hem de boyuk olmadiir
        int [] array1={2,4,8,1,9,5,5,3};
        for(int i=1;i<array1.length-1;i++){
            if(array1[i] >= array1[i - 1] && array1[i] >= array1[i + 1]){
                System.out.println(array1[i]);
            }
        }

    }
}
