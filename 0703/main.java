import java.util.*;

public class main{
  public static void main(String[] args) {
      System.out.println("フィールドの大きさを入力してください(要int型)");
	  int nums = new java.util.Scanner(System.in).nextInt();

      for(int i =0;i<nums;i++){
          for (int o=0;o<nums;o++){
              System.out.printf("*");
          }
          System.out.printf("\n");
      }


  }
}
