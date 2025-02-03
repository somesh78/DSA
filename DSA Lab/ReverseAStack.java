import java.util.Stack;

public class ReverseAStack {
    public static void r(Stack<Integer> s, int last, int first){
        if (first>=last) return;
        int temp =s.get(first);
        s.set(first,s.get(last));
        s.set(last,temp);
        r(s, last-1, first+1);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        System.out.println("---------------------");
        r(s, s.size()-1, 0);
        System.out.println(s);

    }
}
