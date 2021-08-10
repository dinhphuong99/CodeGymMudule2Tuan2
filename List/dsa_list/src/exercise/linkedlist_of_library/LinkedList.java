package exercise.linkedlist_of_library;

public class LinkedList {
    private Node head;
    private int numNodes;

    public LinkedList(Object data) {
        head = new Node(data);
    }

    public LinkedList() {
    }

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        if (head == null)
            head = new Node(data);
        else {
            Node temp = head;
            Node holder;

            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
            numNodes++;
        }
    }

    public void addFirst(Object data) {
        if (head == null)
            head = new Node(data);
        else {
            Node temp = head;
            head = new Node(data);
            head.next = temp;
            numNodes++;
        }
    }

    public Node get(int index) {
        if (head == null)
            return null;
        else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addLast(Object data) {
        if (head == null)
            head = new Node(data);
        else {
            Node temp = head;
            Node lastAdd;
            while (true) {
                if (temp.next == null)
                    break;
                temp = temp.next;
            }
            lastAdd = temp.next;
            temp.next = new Node(data);
            temp.next.next = lastAdd;
            numNodes++;
        }
    }

    public void remove(int index) {
        if (head == null)
            System.out.println("List null");
        else {
            Node temp = head;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            numNodes--;
        }
    }

    public boolean removeElement(Object data) {
        Node temp = head;
        for (int i = 0; temp != null; i++) {
            if (temp.getData() == data){
                this.remove(i);
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public int size(){
        return this.numNodes + 1;
    }

    public boolean contains(Object data) {
        Node temp = head;
        for (int i = 0; temp != null; i++) {
            if (temp.getData() == data)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(Object data) {
        int index =-1;
        Node temp = head;
        for (int i = 0; temp != null; i++) {
            if (temp.getData() == data)
                return i;
            temp = temp.next;
        }
        return index;
    }

    public void clear(){
        this.head = null;
    }

    public Node getLast() {
        return this.get(this.size() - 1);
    }

    public Node getFirst() {
        return head;
    }

    public LinkedList clone() {
        LinkedList clone = new LinkedList();
        Node temp = this.head;
        for (int i = 0; temp != null; i++) {
            clone.add(i,temp.getData());
            temp = temp.next;
        }
        return clone;
    }

    public void ensualCapacity(int minCapacity){
        this.numNodes = minCapacity;
    }
}