import com.sun.security.jgss.GSSUtil;

class QNode {
    int data;
    QNode next;

    QNode(int data) {
        this.data = data;
        this.next = next;
    }
}

class Queue {
    QNode front, rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data){
        QNode newNode = new QNode(data);

        if(rear == null) {
            front = rear = newNode;
            System.out.println(data + " enqueued");
            return;
        }

        rear.next = newNode;
        rear = newNode;
        System.out.println(data + " enqueued");
    }

    public int dequeue() {
        if(front == null) {
            System.out.println("Queue is Empty (Dequeue)");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if(front == null){
            rear = null;
        }

        return value;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty (Peek)");
            return -1;
        }

        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        QNode temp = front;
        System.out.print("Queue : ");
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class QueueExample {
    public static void main(String[] args) {
        Queue queue = new Queue();
//        queue.enqueue(10);
//        queue.display();
//        queue.enqueue(20);
//        queue.display();
//        queue.enqueue(30);
//        queue.display();
//        queue.enqueue(40);
        queue.display();
        System.out.println("Dequeued : " + queue.dequeue());
        queue.display();
        System.out.println("Peek : " + queue.peek());
        System.out.println("Queue Empty : " + queue.isEmpty());
        queue.display();
    }
}