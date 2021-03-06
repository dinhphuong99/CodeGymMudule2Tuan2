package exercise.linkedlist_of_library;

public class TestLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        LinkedListEx ll = new LinkedListEx();

        ll.add(20,2);
        ll.addLast(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addLast(14);

        ll.add(20,2);
        ll.add(4,9);
        ll.addLast(15);

        System.out.println("Hiển thị:");
        ll.printList();
        System.out.println("Size: "+ll.size());

        ll.removeElement(2);
        System.out.println("Hiển thị lại:");
        ll.printList();

        System.out.println("Hiển thị linked list 2:");
        LinkedListEx ll1 = ll.clone();
        ll1.printList();
    }
}
