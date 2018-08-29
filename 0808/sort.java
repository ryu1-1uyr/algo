class sort{
	static void quicksort(int[] list,int left,int right){
		int pl = left;
		int pr = right;
		int pivot = list[(pl+pr)/2];
		
		System.out.printf("list[%d]~list[%d] : {",left,right);
		for(int i=left;i<right;i++){
			System.out.printf("%d , ",list[i]);
		}
		System.out.printf("%d}\n",list[right]);
		
		do{
			while(list[pl] < pivot){
				pl++;
			}
			while(list[pr] > pivot){
				pr--;
			}
			if(pl <= pr){
				swap(list,pl++,pr--);
			}
		}while(pl <= pr);
		
		if(pl-left < right-pr){
			int tmp;
			tmp = left;
			left = pl;
			pl = tmp;
			
			tmp = right;
			right = pr;
			pr = tmp;
		}
		
		if(left < pr){
			quicksort(list,left,pr);
		}
		if(pl < right){
			quicksort(list,pl,right);
		}
	}
	
	static void swap(int[] list,int data1,int data2){
		int tmp;
		tmp = list[data1];
		list[data1] = list[data2];
		list[data2] = tmp;
	}
}
