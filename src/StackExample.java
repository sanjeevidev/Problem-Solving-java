class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack{
    private Node top;

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Stack pushed");
    }

    public int pop(){
        if(isEmpty()){
            System.out.print("Stack is Empty");
            return -1;
        }
        else{
            int pop_date = top.data;
            top = top.next;
            return pop_date;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.print("Stack is Empty");
            return -1;
        }
        else{
            return top.data;
        }
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void display(){
        if(isEmpty()){
            System.out.print("Stack is Empty");
        }
        else{
            Node temp = top;
            System.out.print("Stack -> ");
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        System.out.println("Peek : " + stack.peek());
        System.out.println("Pop : " + stack.pop());
        stack.display();
    }
}
