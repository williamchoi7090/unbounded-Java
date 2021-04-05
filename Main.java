public class Main{
  public static void main(String[] args) {
    Stack s = new Stack();
    Queue q = new Queue();
    s.push(5);
    s.push(10);
    s.push(15);
    s.push(20);
    s.push(25);
    s.push(30);
    System.out.println(s.peek());
    s.pop();
    s.pop();
    s.print();
    q.enQueue(5);
    q.enQueue(10);
    q.enQueue(15);
    q.enQueue(20);
    q.enQueue(25);
    q.enQueue(30);
    q.enQueue(35);
    q.enQueue(40);
    q.enQueue(45);
    q.enQueue(50);
    q.print();
    q.deQueue();
    q.print();
  }
}
