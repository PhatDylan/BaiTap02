public class Stack{
    Node head;

    public void push(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null ){
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public int pop(){
        if (head == null) {
            return -1;
        }
        if (head.next == null) {
            int data = head.data;
            head = null;
            return data;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return temp.data;
    }


    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(20);
        stack.push(25);
        stack.push(30);
        System.out.println("Pop: "+stack.pop());
    }
}
