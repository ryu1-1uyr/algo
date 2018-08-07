class hanoi{
	static void move(int n,int start,int end){
		String[] pole = {"A","B","C"};
		if(n > 1){
			move(n-1,start,6-start-end);
		}
		
		System.out.printf("円盤%dを%s軸から%s軸へ移動\n",n,pole[start-1],pole[end-1]);
		
		if(n > 1){
			move(n-1,6-start-end,end);
		}
	}
}
