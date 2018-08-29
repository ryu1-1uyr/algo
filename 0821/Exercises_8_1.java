import java.util.*;

class Exercises_8_1{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.printf("テキスト:");
		String text = scn.next();
		
		System.out.printf("パターン:");
		String pat = scn.next();
		
		int adr = search.forceSearch(text,pat);
		
		if(adr == -1){
			System.out.printf("テキスト中にパターンが存在しません\n");
		}
		else{
			int count = 0;
			int comp = 0;
			String indent = "";
			
			display: while(true){
				int address = 0;
				int matched = 0;
				System.out.printf("%d\n",count);
				while(address != pat.length()){
					System.out.printf("%s\n",text);
					System.out.printf("%s",indent);
					if(text.charAt(count+address) == pat.charAt(address)){
						for(int i=0;i<matched;i++){
							System.out.printf(" ");
						}
						System.out.printf("+\n");
						System.out.printf("%s",indent);
						System.out.printf("%s\n\n",pat);
						comp++;
						matched++;
					}
					else{
						System.out.printf("|\n");
						System.out.printf("%s",indent);
						System.out.printf("%s\n\n",pat);
						break;
					}
					
					address++;
					if(matched == pat.length()){
						break display;
					}
				}
				indent += " ";
				count++;
				if(count == text.length() - pat.length()){
					break;
				}
			}
			
			System.out.printf("比較は%d回でした\n",comp + count);
		}
	}
}
