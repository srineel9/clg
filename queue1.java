class Queue<T> {
    T[] data;
    int front, rear;
    int length;
Queue(T[] a) {
        data = a;
        front = 0;
        rear = -1;
        length = a.length;
        //first in first out
        //from 0 t0 n-1 ;
        //front i.e 0 which is dequeue , front++
        //rear i.e n-1 which is enqueue , rear ++;


    }
    void enque(T a) {
        if(rear >= length-1) {
            System.out.println("queue overflow");

        }
        else {
            rear++;
            data[rear] = a;

        }
    }
     T deque() {
        T x = null;
        if(isEmpty()) {
            System.out.println("Queue underflow");
            return null;

        }
        else {
            x = data[front];
            front++;
            return x;

        }
     }
     boolean isEmpty() {
        if(front > rear) {
            return true;

        }
        else {
            return false;
        }

    }
    void printQueue() {
        if(!isEmpty()) {
            for(int i = front; i<= rear;i++) {
                System.out.println(data[i] + " ");

            }
        }
        System.out.println();

    }



}

 public class queue1 {
    public static void main(String[] args) {
        Integer arr[] = new Integer[2];
        Queue<Integer> q = new Queue<Integer>(arr);
        q.enque(1);
        q.printQueue();
        q.enque(2);
        q.printQueue();
        q.enque(3);
        q.printQueue();
        q.enque(4);
        q.printQueue();
        q.deque();
        q.printQueue();
        q.deque();
        q.printQueue();
        q.deque();
        q.printQueue();



    }

}

