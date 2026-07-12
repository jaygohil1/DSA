package dsa.linearsearch;

public class strExample {
    public static void main(String[] args) {
        String name = "Jay Gohil";
        char target = 'i';
        char target2  = 'n';

        System.out.println(isthere(name,target));
        System.out.println(isthere2(name,target2));

    }
    static boolean isthere(String xyz , char target){
        if(xyz.isEmpty()) return false;

        for (int index = 0; index <xyz.length() ; index++) {
           if (target==xyz.charAt(index)){
               return true;
           }
        }
        return false;
    }


    static boolean isthere2(String xyz , char target){
        if(xyz.isEmpty()) return false;

       for (char a : xyz.toCharArray()) {
           if (a == target) return true;
       }
        return false;
    }
}
