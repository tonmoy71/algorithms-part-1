package week1.unionfind;

/**
 * Created by tonmoy on 06-Aug-17.
 */
public class WeightedQuickUnionDemo {
  public static void main(String[] args) {
    WeightedQuickUnion weightedQuickUnion = new WeightedQuickUnion(10);

    weightedQuickUnion.union(4, 3);
    weightedQuickUnion.union(3, 8);
    weightedQuickUnion.union(6, 5);
    weightedQuickUnion.union(9, 4);
    weightedQuickUnion.union(2, 1);

    System.out.println("Is connected(8, 9)? " + weightedQuickUnion.isConnected(8, 9));
    System.out.println("Is connected(5, 4)? " + weightedQuickUnion.isConnected(5, 4));

    weightedQuickUnion.union(5, 0);
    weightedQuickUnion.union(7, 2);
    weightedQuickUnion.union(6, 1);
    weightedQuickUnion.union(7, 3);

    // After connecting all the nodes to the root node..
    System.out.println("Is connected(8, 9)? " + weightedQuickUnion.isConnected(8, 9));
    System.out.println("Is connected(5, 4)? " + weightedQuickUnion.isConnected(5, 4));
  }
}
