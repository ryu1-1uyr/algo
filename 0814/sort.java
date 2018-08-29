class sort{
	static void fsort(int[] list,int size,int max){
		int[] f = new int[max+1];
		int[] b = new int[size];
		
		for(int i=0;i<size;i++){
			System.out.printf("f: ");
			display(f);
			f[list[i]]++;
		}
		
		for(int i=1;i<=max;i++){
			System.out.printf("f: ");
			display(f);
			f[i] += f[i-1];
		}
		
		for(int i=size-1;i>=0;i--){
			System.out.printf("b: ");
			display(b);
			b[--f[list[i]]] = list[i];
		}
		
		for(int i=0;i<size;i++){
			list[i] = b[i];
		}
	}
	
	static void display(int[] array){
		int size = array.length;
		for(int i=0;i<size;i++){
			System.out.printf("%d ",array[i]);
		}
		System.out.printf("\n");
	}
}
