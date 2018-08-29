import java.util.*;

class Exercises_6_19{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.printf("度数ソート\n");
		System.out.printf("要素数: ");
		int size = scn.nextInt();
		
		int[] list = new int[size];
		for(int i=0;i<size;i++){
			list[i] = rnd.nextInt(99) + 1;
		}
		
		int max = list[0];
		for(int i=1;i<size;i++){
			if(list[i] > max){
				max = list[i];
			}
		}
		
		System.out.printf("ソート前\n");
		sort.display(list);
		sort.fsort(list,size,max);
		System.out.printf("ソート後\n");
		sort.display(list);
	}
}
