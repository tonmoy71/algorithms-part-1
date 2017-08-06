package week1;

/**
 * Created by tonmoy on 06-Aug-17.
 */
public class QuickFindUF {
  private int[] id;

  public QuickFindUF(int size) {
    this.id = new int[size];

    for (int i = 0; i < id.length; i++) {
      id[i] = i;
    }
  }

  public boolean isConnected(int p, int q) {
    return id[p] == id[q];
  }

  public void union(int p, int q) {
    int pId = id[p];
    int qId = id[q];

    for (int i = 0; i < id.length; i++) {
      if (id[i] == pId) {
        id[i] = qId;
      }
    }
  }
}
