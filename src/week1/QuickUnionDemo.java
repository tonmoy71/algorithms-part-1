package week1;

/**
 * Created by tonmoy on 06-Aug-17.
 */
public class QuickUnionDemo {
  public static void main(String[] args) {
    QuickUnion quickUnion = new QuickUnion(10);

    quickUnion.union(4, 3);
    quickUnion.union(3, 8);
    quickUnion.union(6, 5);
    quickUnion.union(9, 4);
    quickUnion.union(2, 1);

    System.out.println("Is connected(8, 9)? " + quickUnion.isConnected(8, 9));
    System.out.println("Is connected(5, 4)? " + quickUnion.isConnected(5, 4));

    quickUnion.union(5, 0);
    quickUnion.union(7, 2);
    quickUnion.union(6, 1);
    quickUnion.union(7, 3);


  }
}
