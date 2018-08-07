class sort{
	static void inssort(int[] list){
		int size = list.length;
		System.out.printf("\nソート開始\n\n");
		
		for(int k=1;k<size;k++){
			int l = k;
			int tmp = list[k];
			String gauge = "";
			
			for(int m=0;m<size;m++){
				System.out.printf("%4d",list[m]);
			}
			System.out.printf("\n");
			
			while(l > 0 && list[l-1] > tmp){
				list[l] = list[l-1];
				l--;
			}
			
			for(int o=0;o<l;o++){
				gauge += "    ";
			}
			if(l == k){
				gauge += "   +";
			}
			else{
				gauge += " ^--";
				for(int p=k;p>l+1;p--){
					gauge += "----";
				}
				gauge += "---+";
			}
			
			System.out.printf("%s",gauge);
			System.out.printf("\n");
			
			list[l] = tmp;
		}
	}
}
