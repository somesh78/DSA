package LinkedList;

public class first {

    Node head;

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static first insrtAtAnypos(first list, int data, int pos){
        Node newNode = new Node(data);

        if (pos == 0){
            newNode.next = list.head;
            list.head = newNode;
            return list; 
        }

        Node current = list.head;
        for (int i=0; i<pos-1; i++){
            if (current == null){
                System.out.println("Position out of bounds.");
                return list;
            }
            current = current.next;
        }

        if (current == null){
            System.out.println("Position out of bounds.");
        }
        newNode.next = current.next;
        current.next = newNode;
        return list;
    }

    public static first insert(first list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void display(first list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1: Insert at tail using insert()");
        first list1 = new first();
        list1 = insert(list1, 10);
        list1 = insert(list1, 20);
        list1 = insert(list1, 30);
        display(list1);  // Expected: 10 20 30

        // Test Case 2: Insert a node at the head using insrtAtAnypos (pos = 0)
        System.out.println("Test Case 2: Insert at head using insrtAtAnypos()");
        first list2 = new first();
        list2 = insert(list2, 10);
        list2 = insert(list2, 20);
        list2 = insrtAtAnypos(list2, 5, 0);
        display(list2);  // Expected: 5 10 20

        // Test Case 3: Insert a node in the middle
        System.out.println("Test Case 3: Insert in middle using insrtAtAnypos()");
        first list3 = new first();
        list3 = insert(list3, 10);
        list3 = insert(list3, 20);
        list3 = insert(list3, 30);
        list3 = insrtAtAnypos(list3, 15, 1);  // Insert 15 after the first element
        display(list3);  // Expected: 10 15 20 30

        // Test Case 4: Insert a node at the tail using insrtAtAnypos()
        System.out.println("Test Case 4: Insert at tail using insrtAtAnypos()");
        first list4 = new first();
        list4 = insert(list4, 10);
        list4 = insert(list4, 20);
        list4 = insert(list4, 30);
        list4 = insrtAtAnypos(list4, 40, 3);  // Position 3 equals the current length
        display(list4);  // Expected: 10 20 30 40

        // Test Case 5: Attempt to insert at an out-of-bounds position
        System.out.println("Test Case 5: Insert out of bounds using insrtAtAnypos()");
        first list5 = new first();
        list5 = insert(list5, 10);
        list5 = insert(list5, 20);
        list5 = insrtAtAnypos(list5, 15, 5);  // This position does not exist
        display(list5);  // Expected: 10 20 and error message printed
    }
}
