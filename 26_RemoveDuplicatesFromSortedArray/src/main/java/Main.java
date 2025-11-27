public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.removeDuplicates(new int[]{1}) + " = [1]");
        System.out.println(s.removeDuplicates(new int[]{1,1,1,1}) + " = [1]");
        System.out.println(s.removeDuplicates(new int[]{1,1,2}) + " = [1, 2, _]");
        System.out.println(s.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}) + " = [0,1,2,3,4,_,_,_,_,_]");
    }
}