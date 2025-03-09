package LinkedList;

class DLL{
    DLL prev;
    int val;
    DLL next;

    public DLL(int val){
        this.prev = null;
        this.val = val;
        this.next = null;

    }
}

public class Double_linked {
    public static void main(String[] args) {
        DLL head = new DLL(12);
        System.out.println(head.val);
        System.out.println(head.prev);
        System.out.println(head.next);
    }
}