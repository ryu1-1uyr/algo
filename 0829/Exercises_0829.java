import java.util.*;

class Exercises_0829{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		String[] line = new String[num];
		int data[][] = new int[num][3];
		
		for(int i=0;i<num;i++){
			line[i] = scn.next();
		}
		for(int i=0;i<num;i++){
			for(int j=0;j<3;j++){
				data[i][j] = Integer.parseInt(line[i].split(",")[j]);
			}
		}
		
		Sort.sort(data);
		
		for(int i=0;i<num;i++){
			System.out.printf("%d %d %d\n",data[i][0],data[i][1],data[i][2]);
		}
	}
}
