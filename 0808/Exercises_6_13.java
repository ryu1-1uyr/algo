import java.util.*;

class Exercises_6_13{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
	
		System.out.printf("クイックソート\n");
		System.out.printf("要素数:");
		int size = scn.nextInt();
		
		int[] list = new int[size];
		for(int i=0;i<size;i++){
			list[i] = rnd.nextInt(99) + 1;
		}
	
		System.out.printf("ソート前\n");
		display(list);
		System.out.printf("\n");
		
		sort.quicksort(list,0,size-1);
		
		System.out.printf("\n");
		System.out.printf("ソート後\n");
		display(list);
	}
	
	static void display(int[] list){
		int size = list.length;
		for(int i=0;i<size;i++){
			System.out.printf("%d ",list[i]);
		}
		System.out.printf("\n");
	}
}
