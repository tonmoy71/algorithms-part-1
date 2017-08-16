package week2;

public class LinkedStackOfStrings {

  private Node first = null;

  private class Node {
    String item;
    Node next;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void push(String item) {
    Node oldFirst = first;
    first = new Node();
    first.item = item;
    first.next = oldFirst;
  }

  public String pop() {
    String item = first.item;
    first = first.next;

    return item;
  }

  public static void main(String[] args) {
    LinkedStackOfStrings stack = new LinkedStackOfStrings();
    stack.push("to ");
    stack.push("be ");
    stack.push("or ");
    stack.push("not ");
    stack.push("to ");
    stack.push("be ");
    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
  }
}
