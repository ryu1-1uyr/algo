import java.util.*;

public class main{

    static void q17(int nums){
      for(int i=1;i<=nums;i++){

          String line = "";

          for (int o = 0 ; o<nums-i;o++){
              line = line + " ";
          }

          for (int o=0;o!=(i-1)*2+1;o++){
              line = line + i%10;
          }

          System.out.println(line);
      }



    }

  public static void main(String[] args) {
      System.out.println("フィールドの大きさを入力してください(要int型)");
	  int nums = new java.util.Scanner(System.in).nextInt();

      q17(nums);

  }
}
