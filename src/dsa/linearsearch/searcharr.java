package dsa.linearsearch;

public class searcharr {
    //search a value in the array
    public static void main(String[] args) {
        int[] nums = new int[7];
        nums[0] = 2;
        nums[1] = 43;
        nums[2] = 69;
        nums[3] = 21;
        nums[4] = 32;
        nums[5] = 67;
        nums[6] = 88;

        for (int i = 0; i <nums.length; i++) {
            if(nums[i]==67){
                System.out.println(i);
                break;
            }
        }
    }
}
