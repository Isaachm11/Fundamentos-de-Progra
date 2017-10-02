
public class For2{
  public static void main (String[] args){

    for (int i=-1;i<=11 ;i++ ) {
      for (int j=0;j<=11 ;j++ ) {
        if (i==-1) {
          System.out.printf("(%d) \t",1*j);
        }
        else{
        System.out.printf("(%d) \t",i*j);
      }
      }
      System.out.println();
    }
  }
}
