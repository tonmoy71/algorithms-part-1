package week1;

/**
 * Created by tonmoy on 06-Aug-17.
 */
public class Main {
  public static void main(String[] args) {
    QuickFindUF quickFind = new QuickFindUF(10);

    quickFind.union(0, 5);
    quickFind.union(5, 6);
    quickFind.union(1, 2);
    quickFind.union(2, 7);
    quickFind.union(3, 8);
    quickFind.union(3, 4);
    quickFind.union(4, 9);

    System.out.println("Is connected(1, 7)? " + quickFind.isConnected(1, 7));   // true
    System.out.println("Is connected(6, 9)? " + quickFind.isConnected(6, 9));   // false

    System.out.println("Is connected(8, 9)? " + quickFind.isConnected(8, 9));   // true
  }
}
