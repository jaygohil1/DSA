package dsa.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        ArrayList list2 = new ArrayList<>();//can also be writthen as this but not a good practice
        list.add(37);
        list.add(67);
        list.add(19);
        list.add(18);
        list2.add(35);
        list2.add(36);
        list2.add(25);
        list.add(888);
//        System.out.println(list);
//        System.out.println(list2);

        list.set(1, 69);
//        System.out.println(list);

        //do list. to get all operations.

//        ArrayList<Integer> inputL = new ArrayList<>(5);
//        for (int i = 0; i <5 ; i++) {
//            inputL.add(in.nextInt());
//        }
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(inputL.get(i));
//        }
//        System.out.println(inputL);

        ArrayList<String> names = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            names.add(in.next());
        }
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(names.get(i));
//        }
        System.out.println(names);

    }
}


