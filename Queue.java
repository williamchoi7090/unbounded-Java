public class Queue{
  int queue = 10;
  int items[] = new int[queue];
  int first, last;
  Queue(){
    first = -1;
    last = -1;
  }
  boolean over(){
    if (first == 0 && last == queue - 1){
      return true;
    }
    return false;
  }
  void enQueue(int data){
    if (over()) {
      System.out.println("Full");
    } 
    else{
      if (first == -1){
        first = 0;
      }
      last++;
      items[last] = data;
      System.out.println("Number entered: " + data);
    }
  }
  int deQueue(){
    int number;
    if (isEmpty()){
      System.out.println("Empty");
      return (-1);
    }
    else{
      number = items[first];
      if (first >= last){
        first = -1;
        last = -1;
      }
      else{
        first++;
      }
      System.out.println(number + " Deleted");
      return (number);
    }
  }
  boolean isEmpty(){
    if (first == -1)
    return true;
    else
    return false;
  }
  void print(){
    int i;
    if (isEmpty()){
      System.out.println("Empty");
    }
    else{
      System.out.println("\nFirst-> " + first);
      System.out.println("Numbers-> ");
      for (i = first; i <= last; i++)
        System.out.print(items[i] + " ");
      System.out.println("\nLast-> " + last);
    }
  }
}