class Stack{
  private class stack{
    int linked;
    stack list;
  }
  stack top;
  Stack(){
    this.top = null;
  }
  public void push(int linked){
    stack a = new stack();
    if (a == null){
      System.out.print("\nOver");
      return;
    }
    a.linked = linked;
    a.list = top;
    top = a;
  }
  public void pop(){  
    if (top == null){
      System.out.print("\nUnder");
      return;
    }
    top = (top).list;
  }
  public boolean isEmpty(){
    return top == null;
  }
  public int peek(){
    if (!isEmpty()){
      return top.linked;
    }
    else{
      System.out.println("None");
      return 0;
    }
  }
  public void print(){
    if (top == null) {
      System.out.printf("\nEmpty");
      System.exit(1);
    }
    else{
      stack b = top;
      System.out.println("The data in the stack is: ");
      while (b != null){
        System.out.printf("%d-> ", b.linked);
        b = b.list;
      }
      System.out.printf("\n");
      System.out.printf("\n");
    }
  }
}