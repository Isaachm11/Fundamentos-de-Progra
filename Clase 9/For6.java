public class For6{
  public static void main (String [] args){
    for (int i=1;i<=40 ;i++ ) {
      int j,t;
      j = i%2;
      t = i%3;
      if (j==0 && t==0) {
        System.out.printf("%d es par y divisible entre tres",i);
        System.out.println();
      }
      else if (j==0) {
        System.out.printf("%d es par",i);
        System.out.println();
      }
      else if (t==0) {
        System.out.printf("%d divisible entre tres",i);
        System.out.println();
      }
      else {
        System.out.printf("%d",i);
        System.out.println();
      }
    }
  }
}
