package queue_build.queue_use_linkedlist_build;

public class QueueUseLinkedListBuildTest {
    public static void main(String[] args) {
        QueueUseLinkedListBuild queueUseLinkedListBuild = new QueueUseLinkedListBuild(5);
        queueUseLinkedListBuild.push(5);
        queueUseLinkedListBuild.push(2);
        queueUseLinkedListBuild.push(3);
        queueUseLinkedListBuild.push(4);
        queueUseLinkedListBuild.push(1);

        System.out.println(queueUseLinkedListBuild.isFull());

        System.out.println(queueUseLinkedListBuild.pop());
        System.out.println(queueUseLinkedListBuild.pop());
        System.out.println(queueUseLinkedListBuild.pop());
    }
}
