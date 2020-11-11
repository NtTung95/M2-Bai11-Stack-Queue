public class Solution {
    public static void enQueue(int data, Queue myQueue){
        Node temp = new Node();
        temp.data = data;
        if(myQueue.front == null){
            myQueue.front = temp;
        }else {
            myQueue.rear.link = temp;
        }
        myQueue.rear = temp;
        myQueue.rear.link = myQueue.front;
    }
    public static int deQueue(Queue myQueue){
        if(myQueue.front == null){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int data;
        if(myQueue.front == myQueue.rear){
            data = myQueue.front.data;
            myQueue.front = myQueue.rear = null;
        } else {
            Node temp = myQueue.front;
            data = temp.data;
            myQueue.front = myQueue.front.link;
            myQueue.rear.link = myQueue.front;
        }
        return data;
    }
    public static void displayQueue(Queue myQueue){
        Node temp = myQueue.front;
        while(temp.link != myQueue.front){
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.front = queue.rear = null;

        enQueue(14,queue);
        enQueue(22,queue);
        enQueue(6,queue);
        enQueue(5,queue);

        deQueue(queue);

        displayQueue(queue);
    }
}
