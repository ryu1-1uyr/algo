import java.util.*;

class Exercises_5_6{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.printf("ハノイの塔\n");
		System.out.printf("円盤の枚数\n");
		int n = scn.nextInt();
		
		hanoi.move(n,1,3);
	}
}
