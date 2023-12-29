public class Slladdf {
      public static class Node {
        int data;
        Node next;
                  
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

      
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)  {
        //step1 = create new node 

        Node newNode = new  Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //step2 - newNode next = head
        newNode.next = head;
        //link

        head = newNode;


    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        //intialing tail to new node
        tail.next = newNode;
        tail = newNode;

    }

    public void print() {
        if(head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public void add(int data, int idx) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i= 0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        //temp is getting the nearesrrt value
        newNode.next = temp.next;
         temp.next = newNode;


    }

    public int removeFirst () {
        if(size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1)  {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if( size == 1) {
            int val = head.data;
            head = tail = null;
            size= 0;
            return val;
        }
        else {
            
            Node temp = head;
            for(int i=0;i<size-2;i++) {
                temp = temp.next;

            }
              int val = temp.next.data;//tail.next
            temp.next=null;
            temp = tail;
            size--;
            return val;


        }
    }

    public int itrSearch( int key) {
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if (temp.data == key) {
                return i;
            }
            
            temp = temp.next;
            i++;
        }

        return -1;

       
    }

    public int helper(Node head,int key) {
        if(head == null) {
            return -1;

        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1) {
            return -1;
        }

        return idx+1;


    }
    public int recSearch(int key) {
        return helper(head,key);
    }



    public static void main(String args[]) {
         Slladdf ll = new Slladdf();
         ll.addFirst(1);
         ll.addFirst(2);
         ll.addLast(3);
         ll.addLast(4);
         ll.add(9,2);
         ll.print();
        // System.out.println(size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(size);

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.recSearch(9));


    }
    
}
