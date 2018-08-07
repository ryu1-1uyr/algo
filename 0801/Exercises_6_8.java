import java.util.*;

class Exercises_6_8{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		System.out.printf("要素数");
		int size = scn.nextInt()+1;
		
		int[] list = new int[size];//要素数+番兵
		for(int i=1;i<size;i++){
			list[i] = rnd.nextInt(99) + 1;//1~100
		}
		
		System.out.printf("ソート前");
		display(list);
		
		sort.simplesort(list,size);
		
		System.out.printf("ソート後");
		display(list);
	}
	
	static void display(int[] list){
		int size = list.length;
		for(int i=1;i<size;i++){
			System.out.printf("%d ",list[i]);
		}
		System.out.printf("\n");
	}
}
