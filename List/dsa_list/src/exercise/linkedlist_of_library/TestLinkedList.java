package exercise.linkedlist_of_library;

public class TestLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        LinkedList ll = new LinkedList();
        //ll.get(2);
        ll.add(20,2);
        ll.addLast(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addLast(14);
        //ll.get(2);
        ll.add(20,2);
        ll.add(4,9);
        ll.addLast(15);
        //ll.remove(8);
        System.out.println("Hiển thị:");
        ll.printList();
        System.out.println("Size: "+ll.size());

        ll.removeElement(2);
        //ll.clear();
        System.out.println("Hiển thị lại:");
        //System.out.println(ll.get(7).getData());
        //System.out.println(ll.getFirst());
        ll.printList();
        //System.out.println("Tìm kiếm phần tử 15: " + ll.contains(15) + " " + ll.indexOf(15));
        System.out.println("Hiển thị linked list 2:");
        LinkedList ll1 = ll.clone();
        ll1.printList();
    }
}
