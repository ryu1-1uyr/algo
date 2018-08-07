import java.util.*;
/*
入力した整数が13以上だとint型の範囲を超えて結果がおかしくなる
factionalとjをlong型で宣言すると許容範囲が広がる
*/

class Exercises_5_1{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i;
		System.out.printf("整数を入力:");
		i = scn.nextInt();
		
		System.out.printf("%dの階乗は%dです\n",i,factional(i));
	}
	
	static int factional(int n){
		int j = 1;
		if(n>0){
			while(n>1){
				j *= n;
				n--;
			}
			return j;
		}
		else{
			return 1;
		}
	}
}
