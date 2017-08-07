package week1.unionfind;

/**
 * Created by tonmoy on 06-Aug-17.
 */
public class WeightedQuickUnion {
  private int[] id;
  private int[] size;

  public WeightedQuickUnion(int size) {
    this.id = new int[size];
    for (int i = 0; i < id.length; i++) {
      this.id[i] = i;
    }
    this.size = new int[size];
    for (int i = 0; i < size; i++) {
      this.size[i] = 1;
    }
  }

  private int root(int i) {
    while (i != id[i]) {
      i = id[i];
    }
    return i;
  }

  public boolean isConnected(int p, int q) {
    return root(p) == root(q);
  }

  public void union(int p, int q) {
    int i = root(p);
    int j = root(q);

    if (i == j) {
      return;
    }
    // Make smaller root point to larger one
    if (size[i] < size[j]) {
      id[i] = j;
      size[j] += size[i];
    } else {
      id[j] = i;
      size[i] += size[j];
    }
  }
}
