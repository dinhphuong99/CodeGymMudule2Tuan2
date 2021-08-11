package stack_build.stack_use_linkedlist_build;
import linkedlist_of_library.*;


public class StackUseLinkedListBuild{
    private static LinkedListEx arrayList = new LinkedListEx();
    private int numberElements = 0;
    private int size;

    public StackUseLinkedListBuild(int size) {
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
            System.out.println("Stack empty");
            return -1;
        }
        int numGet = (int) arrayList.get(numberElements-1).getData();
        arrayList.remove(numberElements -1);
        numberElements--;
        return numGet;
    }

    public void push(int addNumber){
        if (isFull()) {
            System.out.println("Stack full");
        }else {
            arrayList.addLast(addNumber);
            numberElements++;
        }
    }
}
