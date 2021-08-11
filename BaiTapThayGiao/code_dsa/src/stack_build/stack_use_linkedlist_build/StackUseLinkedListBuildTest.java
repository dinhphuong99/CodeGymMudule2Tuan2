package stack_build.stack_use_linkedlist_build;

public class StackUseLinkedListBuildTest {
    public static void main(String[] args) {
        StackUseLinkedListBuild stackUseLinkedList = new StackUseLinkedListBuild(5);
        stackUseLinkedList.push(5);
        stackUseLinkedList.push(2);
        stackUseLinkedList.push(3);
        stackUseLinkedList.push(4);
        stackUseLinkedList.push(1);

        System.out.println(stackUseLinkedList.isFull());

        System.out.println(stackUseLinkedList.pop());
        System.out.println(stackUseLinkedList.pop());
        System.out.println(stackUseLinkedList.pop());
    }
}
