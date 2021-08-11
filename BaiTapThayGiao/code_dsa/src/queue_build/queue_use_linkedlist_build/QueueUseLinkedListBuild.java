package queue_build.queue_use_linkedlist_build;

import linkedlist_of_library.LinkedListEx;

public class QueueUseLinkedListBuild {
    private static LinkedListEx arrayList = new LinkedListEx();
    private int numberElements = 0;
    private int size;

    public QueueUseLinkedListBuild(int size) {
        this.size = size;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty(){
        if (numberElements == 0)
            return true;
        return false;
    }

    public boolean isFull(){
        if (numberElements >= size)
            return true;
        return false;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Queue empty");
            return -1;
        }
        int numGet = (int) arrayList.get(0).getData();
        arrayList.remove(0);
        numberElements--;
        return numGet;
    }

    public void push(int addNumber){
        if (isFull()) {
            System.out.println("Queue full");
        }else {
            arrayList.addLast(addNumber);
            numberElements++;
        }
    }
}
