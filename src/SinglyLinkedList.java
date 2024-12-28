
public class SinglyLinkedList {
    Node head; // 1 -> 2 -> 3

    public int removeNode(int index){
        if(head == null){
            return -1;
        }
        Node temp = head;
        Node prev = null;
        int count = 0;
        while(temp.next != null){
            if(count == index){
                break;
            }
            prev = temp;
            temp = temp.next;
            count++;
        }
        prev.next = temp.next;
        return temp.data;

    }


    public int removeFirst(){
        if(head == null){
            return -1;
        }
        head = head.next;
        return head.data;
    }


    public int removeLast() {
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



    public void addNode(int data, int index) {
        Node newNode = new Node(data);
        if (index == 0 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int count = 0;
        while (temp.next != null && count < index - 1) {
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }



    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.addNode(30, 1);
        singlyLinkedList.addNode(31, 2);
        singlyLinkedList.addNode(32, 3);


        System.out.println("RemoveNode: "+singlyLinkedList.removeNode(1));

        System.out.println("RemoveFirst: "+singlyLinkedList.removeFirst());

        System.out.println("RemoveLast: "+singlyLinkedList.removeLast());

    }

}
