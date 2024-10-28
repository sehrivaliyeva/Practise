package collections;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add(3, "B");
        list.remove("A");
        list.remove(3);
        list.get(1);

        //ARRAYLIST
        //add()----olanda O(1) olur, burada amortize halinda O(n) ola biler yeni 0.75 doldugdan sora arrayin olcusu deyishirse eger
        //add(index,Object)----O(n) olur cunki elementler saga surusur
        //remove() -----eger sondan siliremse O(1) olacaq
        //remove() -----eger mueyyen bir indexden siliremse O(n) olacaq cunki saga surusecek elementler
        //remove()-----eger objecti siliremse hemin obyekti tapana qeder gezecek O(n) olacaq
        //get()------indexe gore olur ancaq bu da O(1) olacaq

        //UMUMI OLARAQ
        // Yazma: O(1)
        //Oxuma O(1)
        // Silmə: O(n)


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add(5, "B");
        linkedList.remove();
        linkedList.getFirst();


        //LINKEDLIST

        //add(Object)--------elave edende O(1) olur sona ve ya basa elave edende,amortize halinda O(n) olur
        //add(index,Object)----------elave edende hemin indexe qeder gezmeli olur O(n)
        //removeLast(),removeFirst()-------evvelden silmek,sondan silmek O(1)
        //remove(index),remove(Object)------hemin idexe ve objecte qeder gezir bu da O(n) edir
        //getFirst(),getLast()------------O(1) olacaq
        //get(index)-----------O(n) olacaq hemin indexe qeder yoxlamali olacaq nodeleri


        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.remove(1);
        vector.get(1);
        vector.contains(2);


        //VECTOR
        //add(pbject),addElement()----------- sona elave etdikde O(1) olur amortize halinda O(n) olacaq
        //remove(Object),removeElement(object)----------bu halda O(n) olur cunki hemim elementi tapmalidir
        //remove(index)-----------hemin indexden elemet silinir ve surusme bas verir buna gore O(n) olacaq
        //get(index)------O(1) olacaq birbasa hemin elementi gosterecek cunki
        //contains(obj)--------burada da O(n) olacaq cunki axyaracaq elementi


        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.peek();
        stack.search(1);
        

        //STACK
        //push()--------------O(1) olacaq amortize halinda O(n) olacaq
        //peek()-------O(1) olacaq
        //pop()----------O(1) olacaq
        //search()-------O(n) olacaq cunki hemin elementi axtaracaq

    }
}
