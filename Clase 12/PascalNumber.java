public class PascalNumber{
  public static void main(String[] args) {
    int n=1;
    System.out.println(getPascal(5,3));
  }

  public static int getPascal(int r, int c){
    if (r==1) {
      return 1;
    }
    else if (c==1 || r==c) {
      return 1;
    }
    else {
      return getPascal(r-1,c-1)+getPascal(r-1,c)
    }
  }
}
