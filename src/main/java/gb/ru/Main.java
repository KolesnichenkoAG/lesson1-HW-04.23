package gb.ru;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        String str1 = new String("AAA");
        String str2 = new String("BBB");
        String str3 = new String("CCC");
        String str4 = new String("DDD");


        LinkedList<String> test1 = new LinkedList<>();
        test1.add(str1);
        test1.add(str3);
        test1.add(1, str2);
        test1.add(str4);
        test1.addFirst(str4);

        System.out.println(test1);
        test1.remove(2);
        int size = test1.size();
        System.out.println(test1);
        System.out.println(size);

        ArrayList<String> test2 = new ArrayList<>();
        test2.add(str1);
        test2.add(str4);
        test2.add(1, str2);
        test2.add(str3);

        System.out.println(test2);
        test2.remove(3);
        System.out.println(test2);


    }
}
