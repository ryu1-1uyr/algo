import java.util.*;

public class main{

    static int[][] mdays = {
      {31,28,31,30,31,30,31,31,30,31,30,31},
      {31,29,31,30,31,30,31,31,30,31,30,31}
    };

    static int isLeap(int year){
       return (year%4==0&&year%100!=0||year%400==0)?1:0;
    };

    static int leftDayOfYear(int y,int m , int d){
      int days = d;

      for(int i=1;i<m;i++){
        days += mdays[isLeap(y)][i-1];
      }
      return (365 + isLeap(y))- days;
    }


  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("y>?");
    int y = stdIn.nextInt();
    System.out.println("m>?");
    int m = stdIn.nextInt();
    System.out.println("d>?");
    int d = stdIn.nextInt();

    System.out.println("残り"+leftDayOfYear(y,m,d)+"日です");
  }
}
