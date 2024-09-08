package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MyExecutorService {
    public static void main(String[] args) {

        //isi bir thread yerine yetirir
        Executor single = Executors.newSingleThreadExecutor();

        //is threadler arasinda bolunur
        // eger yeni is elave olunarsa her hansi bir threadin bos olmasini gozleyir

        Executor fixed = Executors.newFixedThreadPool(3);

        //bir nece thread olur eger yeni bir task gelerse bos thread olmazsa yeni thread yaradila biler
        Executor cached = Executors.newCachedThreadPool();

        // eger threadlarden her hansi biri isini bitiribse digerine komek ede biler
        Executor steal = Executors.newWorkStealingPool();

    }
}
