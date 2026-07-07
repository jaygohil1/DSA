package dsa.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MutlDimenArrL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //This ⬇ will create the outer list!
        ArrayList<ArrayList<Integer>> mdarrL = new ArrayList<>();//This is like declaration of array list

//        for (int i = 0; i < 3; i++) {
//            // ⬇ creates each inner list (row).
//            mdarrL.add(new ArrayList<>());
//        }
//        for (int i = 0; i < 3; i++) {
//
//            mdarrL.get(i).add(7);
//            mdarrL.get(i).add(5);
//            mdarrL.get(i).add(5);
//
//        }
//        System.out.println(mdarrL);

//        mdarrL.add(new ArrayList<>());
//        mdarrL.add(new ArrayList<>());
//        mdarrL.get(0).add(10);
//        mdarrL.get(0).add(20);
//
//        mdarrL.get(1).add(30);
//        mdarrL.get(1).add(40);
//
//        System.out.println(mdarrL);

        //Currently the list mdarrl is empty the below loop creates 3 sub lists inside the mdarr list
        for (int i = 0; i <3 ; i++) {
            mdarrL.add(new ArrayList<>());
        }

        for (int i = 0; i <3 ; i++) //Iterates over the current row / chooses the row
        {for (int j = 0; j < 3 ; j++) //Fills the row w 3 elements
            {mdarrL.get(i).add(in.nextInt());}
        }

        for (int i = 0; i <3 ; i++) {
            System.out.print(mdarrL.get(i)+" ");
            System.out.println();
        }



        //Simple list printing
System.out.println(mdarrL);


    }
}
