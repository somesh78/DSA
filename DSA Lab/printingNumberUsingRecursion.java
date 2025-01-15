public class printingNumberUsingRecursion {
    public static void rec(int a, int target){
        if (a == target)return;
        System.out.println(a);
        rec(a+1, target);
    }
        public static void main(String[] args) {
            int a = 0;
            int target = 10;
            rec(a, target);
    }    
}
