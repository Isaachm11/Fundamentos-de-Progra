public class recursivo{

  public static void main(String[] args) {
    int[] n= {1,2,3,4,5,6,7,8,9};
    int m;
    m = conteo(n,0);

    System.out.println(m);
  }

    public static int conteo(int[] num,int i){

      if (i==num.length-1) {
      //conteo recursivo del 5 al 10
        return num[i];
      } else{
        return num[i] * conteo(num, i+1);
      }
    }
}
