class LinkedNode {
    int data;
    LinkedNode next;

    LinkedNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    LinkedNode head;

    public void insert(int data) {
        LinkedNode new_LinkedNode = new LinkedNode(data);

        if (head == null) {
            head = new_LinkedNode;
        } else {
            LinkedNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_LinkedNode;
        }
    }

    public void delete(int key) {
        LinkedNode temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return;

        prev.next = temp.next;
    }

    public void display() {
        LinkedNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedListExample {
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
