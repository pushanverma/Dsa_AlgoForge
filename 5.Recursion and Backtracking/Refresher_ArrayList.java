import java.util.*;

public class Refresher_ArrayList {

    public static void main(String... args) {

        // add , remove , edit , get , size

        ArrayList<String> al = new ArrayList<>();

        // topic: add in arraylist
        al.add("pushan");
        al.add("chetna");
        al.add("aditi");
        al.add("chandresh");

        System.out.println(al + " , " + al.size());

        // topic: remove in arrayList
        al.remove("pushan");

        System.out.println(al + " , " + al.size());

        // topic: edit in arrayList

        al.set(0, "chetnaVerma");

        System.out.println(al + " , " + al.size());

        // topic: get in arrayList

        System.out.println(al.get(1));

    }
}