//class lnode {
//    int data;
//    lnode next;
//    int pos;
//
//    lnode(int data, int pos) {
//        this.data = data;
//        this.pos = pos;
//    }
//}
//
//class LinkedListMain{
//    lnode head;
//    public void posinsert(int data,int pos){
//        lnode newnode=new lnode(data,pos);
//
//        if(head==null) {
//            head = newnode;
//        }
//        else{
//            lnode temp=head;
//            while(temp.next==pos){
//                temp=temp.next;
//            }
//            temp.next=newnode;
//            }
//        }
//
////    public void delete(int key){
////        LLNode temp = head, prev = null;
////
////        if(temp.next == null && temp.data == key){
////            head = temp.next;
////            return;
////        }
////
////        while(temp.next != null && temp.data != key){
////            prev = temp;
////            temp = temp.next;
////        }
////
////        if (temp == null) return;
////        prev.next = temp.next;
////    }
////
//    public void display(){
//        lnode temp = head;
//        System.out.print("LinkedList -> ");
//        while(temp !=null){
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.print("null");
//        System.out.println();
//    }
//}
//
//public class LinkedListSolve {
//    public static void main(String[] args) {
//        LinkedListMain list = new LinkedListMain();
////        list.insert(10);
////        list.display();
////        list.insert(20);
////        list.display();
////        list.insert(30);
////        list.display();
////        list.insert(40);
////        list.display();
////        list.insert(50);
////        list.display();
////        list.delete(30);
////        list.display();
//        list.posinsert(3,30);
//        list.display();
//    }
//}

class LNode {
    int data;
    int pos;  // optional, not really needed if we use index while inserting
    LNode next;

    LNode(int data, int pos) {
        this.data = data;
        this.pos = pos;
        this.next = null;
    }
}

class LinkedListPos {
    LNode head;

    // Insert at the given position
    public void insert(int data, int pos) {
        LNode newNode = new LNode(data, pos);

        // Case 1: Insert at head (position 1)
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Case 2: Insert at given position
        LNode temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        LNode temp = head;
        while (temp != null) {
            System.out.print("[" + temp.data + ", pos=" + temp.pos + "] -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedListSolve {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.print("Linked List: ");
        list.display();

        list.delete(20);
        System.out.print("After deleting 20: ");
        list.display();

        list.delete(10);
        System.out.print("After deleting 10: ");
        list.display();

        list.delete(100);
        System.out.print("After trying to delete 100: ");
        list.display();
    }
}