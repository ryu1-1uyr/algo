import java.util.*;

class Exercises_6_10{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int count = 0;
		
		int selecter = 0;
		while(selecter == 0){
			System.out.printf("第1版→ 1\n第2版→ 2   ");
			selecter = scn.nextInt();
		}
		
		System.out.printf("要素数:");
		int size = scn.nextInt();
		int list[] = new int[size];
		
		for(int i=0;i<size;i++){
			list[i] = rnd.nextInt(99) + 1;
		}
		
		System.out.printf("\n");
		System.out.printf("ソート前\n");
		display(list);
		
		if(selecter == 1){
			count = shellsort1.sort(list);
		}
		if(selecter == 2){
			count = shellsort2.sort(list);
		}
		
		System.out.printf("ソート後\n");
		display(list);
		System.out.printf("要素の移動回数:%d\n",count);
	}
	
	static void display(int[] list){
		int n = list.length;
		for(int j=0;j<n;j++){
			System.out.printf("%d ",list[j]);
		}
		System.out.printf("\n");
	}
}
