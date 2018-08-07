class shellsort2{
	static int sort(int[] list){
		int h,num = list.length;
		int count = 0;
		
		for(h=1;h<num/9;h=h*3+1);
		for(;h>0;h/=3){
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
