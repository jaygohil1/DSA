package dsa.linearsearch;

public class SearchArr2 {
    public static void main(String[] args) {

        int [] nums = {1,22,32,321,-1,73,65,77,-29,25,67};
        int ans = linears(nums,67);
        System.out.println(ans);
    }
    static int linears(int[] arr , int target){
        if(arr.length==0) return -1;

        for (int i = 0; i <arr.length ; i++) {
            int element = arr[i];
            if(element == target){
                System.out.println("Element found at index: ");
                return i;
            }
        }
        //If none of the above then:
        return -1;
    }
}
