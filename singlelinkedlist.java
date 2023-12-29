class singlelinkedlist <T> {
    Node head; // head of list



class Node {
    T data;
    Node next;

    //constructer
    Node () {
        data = null;
        next = null;

    }

    Node (T d) {
        data = d;
        next = null;

    }
}
singlelinkedlist() { //linkedlist header node 
    head = new Node(); 

  }
  //method to maintain the collection to be defined 

}

      