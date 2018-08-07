class shellsort1{
	static int sort(int[] list){
		int num = list.length;
		int count = 0;
		
		for(int h=num/2;h>0;h/=2){
			for(int i=h;i<num;i++){
				int j;
				int tmp = list[i];
				for(j=i-h;j>=0&&list[j]>tmp;j-=h){
					list[j+h] = list[j];
					count++;
				}
				list[j+h] = tmp;
				count++;
			}
		}
		
		return count;
	}
}
