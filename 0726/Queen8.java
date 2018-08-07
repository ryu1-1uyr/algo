class Queen8{
	static boolean[] flag_a = new boolean[8];
	static boolean[] flag_b = new boolean[15];
	static boolean[] flag_c = new boolean[15];
	static int[] pos = new int[8];
	
	static void print(){
		for(int row=0;row<8;row++){
			for(int col=0;col<8;col++){
				if(row == pos[col]){
					System.out.printf(" ■");
				}else{
					System.out.printf(" □");
				}
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
	}
	
	static void set(int i){
		for(int j=0;j<8;j++){
			if(flag_a[j] == false && flag_b[i+j] == false && flag_c[i-j+7] == false){
				pos[i] = j;
				if(i == 7){
					print();
				}else{
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = true;
					set(i+1);
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = false;
				}
			}
		}
	}


}
