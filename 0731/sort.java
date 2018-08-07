class sort{
	static void selectsort(int[] list){
		int n = list.length;
		for(int i=0;i<n;i++){
			int min = i;
			for(int j=i+1;j<n;j++){
				if(list[j] < list[min]){
					min = j;
				}
			}
			for(int k=0;k<n;k++){
				if(k == i){
					System.out.printf("  *");
				}
				else if(k == min){
					System.out.printf("   +");
				}
				else{
					System.out.printf("    ");
				}
			}
			System.out.printf("\n");
			
			for(int l=0;l<n;l++){
				System.out.printf("%3d ",list[l]);
			}
			System.out.printf("\n");
			swap(list,i,min);
		}
	}
	
	static void swap(int[] list,int i,int min){
		int tmp;
		tmp = list[i];
		list[i] = list[min];
		list[min] = tmp;
	}
}
