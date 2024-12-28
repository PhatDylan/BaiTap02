public class Queue {
    Node head;

    public void enqueue(int data){
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

    public int dequeue(){
        if (head == null) {
            return -1;
        }
        head = head.next;
        return head.data;
    }

    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(34);
        queue.enqueue(36);
        queue.enqueue(39);
        System.out.println("Dequeue: "+queue.dequeue());
    }
}
