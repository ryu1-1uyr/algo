	/*		List 7-1[A]		*/
public class IntSet{
	private int max;
	private int num;
	private int[] set;
	
	public IntSet(int capacity){
		num = 0;
		max = capacity;
		try{
			set = new int[max];
		}
		catch(OutOfMemoryError e){
			max = 0;
		}
	}
	
	public int capacity(){
		return max;
	}
		
	public int size(){
		return num;
	}
	
	
	
	/*		List 7-1[B]		*/
	public int indexOf(int n){
		for(int i=0;i<num;i++){
			if(set[i] == n){
				return i;
			}
		}
		return -1;
	}
	
	public boolean contains(int n){
		int flag = indexOf(n);
		if(flag != -1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean add(int n){
		if(num >= max || contains(n) == true){
			return false;
		}
		else{
			set[num++] = n;
			return true;
		}
	}
	
	public boolean remove(int n){
		int idx;
		if(num <= 0 || (idx = indexOf(n)) == -1){
			return false;
		}
		else{
			set[idx] = set[--num];
			return true;
		}
	}
	
	
	
	/*		List 7-1[C]		*/
	public void copyTo(IntSet s){
		int n;
		if(s.max < num){
			n = s.max;
		}
		else{
			n = num;
		}
		
		for(int i=0;i<n;i++){
			s.set[i] = set[i];
		}
		
		s.num = n;
	}
	
	public void copyFrom(IntSet s){
		int n;
		if(max < s.num){
			n = max;
		}
		else{
			n = s.num;
		}
		
		for(int i=0;i<n;i++){
			set[i] =s.set[i];
		}
		
		num = n;
	}
	
	public boolean equalTo(IntSet s){
		if(num != s.num){
			return false;
		}
		
		for(int i=0;i<num;i++){
			int j = 0;
			while(j<s.num){
				if(set[i] == s.set[j]){
					break;
				}
				j++;
			}
			if(j == s.num){
				return false;
			}
		}
		return true;
	}
	
	public void unionOf(IntSet s1,IntSet s2){
		copyFrom(s1);
		for(int i=0;i<s2.num;i++){
			add(s2.set[i]);
		}
	}
	
	public String toString(){
		StringBuffer temp = new StringBuffer("{ ");
		for(int i=0;i<num;i++){
			temp.append(set[i] + " ");
		}
		temp.append("}");
		
		return temp.toString();
	}
	
	
	
	/*		ここから課題		*/
	public boolean isEmpty(){
		if(num == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isFull(){
		if(num >= max){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void clear(){
		num = 0;
	}
}
