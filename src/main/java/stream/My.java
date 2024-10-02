package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class My {
    public static void main(String[] args) {
        List<List<String>> lists = Arrays.asList(
                Arrays.asList("salam", "hello"),
                Arrays.asList("salam1", "hello1"),
                Arrays.asList("salam2", "hello2")
        );

        //paralel stream da bir nece threadin eyni anda islemesine komek edir stream ureinde

//flatMap() ic ice olan yuxaridaki listleri bir list halina getirir
        List<String> stream = lists.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(stream);


    }
}
