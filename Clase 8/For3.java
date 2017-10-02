
import java.util.Scanner;

public class For4{
  public static void main(String[] args){

      for(int a=-1; k<=11; k++){
        if(a==-1){
          int b= 0;
          System.out.printf("(%d) \t" , b);
        }
        else {
          System.out.printf("(%d) \t" , a);
        }
      }

        System.out.println(" ");

    for(int c=0; c<=11; c++){
      if(c>=0){
      System.out.printf("(%d) \t" , c);
        for(int d=0;d<=11;d++){
          System.out.printf("(%d) \t" , c*d);
        }
      }
        System.out.println(" ");
    }

  }

}
