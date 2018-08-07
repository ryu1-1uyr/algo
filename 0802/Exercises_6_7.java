import java.util.*;

class Exercises_6_7{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.printf("要素数");
		int size = scn.nextInt();
		
		int[] list = new int[size];
		for(int i=0;i<size;i++){
			list[i] = rnd.nextInt(99) + 1;
		}
		
		display(list);
		sort.inssort(list);
		display(list);
	}
	
	static void display(int[] list){
		int num = list.length;
		for(int j=0;j<num;j++){
			System.out.printf("%d ",list[j]);
		}
		System.out.printf("\n");
	}
}
