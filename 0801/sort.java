class sort{
	static void simplesort(int[] list,int num){
		int i,j,tmp;
		for(i=2;i<num;i++){
			tmp = list[i];
			j = i;
			while(list[j-1] > tmp){
				list[j] = list[j-1];
				j--;
			}
			list[j] = tmp;
		}
	}
}
