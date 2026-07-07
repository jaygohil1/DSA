package dsa.arrays;

public class MultiDArrays {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int [][] twod = new int[3][2];
//        twod[0][0] = 10;
//        twod[0][1] = 20;
//
//        twod[1][0] = 30;
//        twod[1][1] = 40;
//
//        twod[2][0] = 50;
//        twod[2][1] = 60;
//
//        for (int row = 0; row <twod.length ; row++) {
//            for (int col = 0; col <twod[row].length ; col++) {
//                System.out.print(twod[row][col]+" ");
//            }
//            System.out.println();
//        }
//    }
//        int [][] inputarr = new int[3][3];
//
//        for (int row = 0; row < inputarr.length ;  row++) {
//            for (int col = 0; col <inputarr[row].length ; col++) {
//                inputarr[row][col] = in.nextInt();
//            }
//
//        }

        //TO PRINT AN ARRAY
//        for (int row = 0; row < inputarr.length ;  row++) {
//            for (int col = 0; col <inputarr[row].length ; col++) {
//                System.out.print(inputarr[row][col]+" ");
//            }
//            System.out.println();
//
//        }

        //Using arrays to string to print
//        for (int row = 0; row < inputarr.length ;  row++) {
//            System.out.println(Arrays.toString(inputarr[row]));
//        }

//        for(int[] a : inputarr){
//            System.out.println(Arrays.toString(a));
//        }

        //JAGGED Array or Arrays w different number of cols

        int [][] gagarr = {
                {11,22,33,888,999} ,
                {67,69} ,
                {25,3,6}
        };
        for (int row = 0; row < gagarr.length ; row++) {
//            System.out.println(Arrays.toString(gagarr[row]));
            for (int col = 0; col < gagarr[row].length; col++) {
                //Basically as here the size of all the cols is not same so instead of defining size of col we define the size of the row iykyk!1
                System.out.print(gagarr[row][col]+" ");
            }
            System.out.println();
        }

    }
}
