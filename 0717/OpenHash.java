import java.util.*;

class openhash{
	static Scanner scn = new Scanner(System.in);

	static class Data{
		static final int NO = 1;
		static final int NAME = 2;

		private Integer no;
		private String name;

		String keyCode(){
			return name;
		}

		public String toString(){
			return Integer.toString(no);
		}

		void scanData(String guide,int sw){
			System.out.println(guide + "するデータを入力してください。");

			if((sw & NO) == NO){
				System.out.print("番号：");
				no = scn.nextInt();
			}
			if((sw & NAME) == NAME){
				System.out.print("名前：");
				name = scn.next();
			}
		}
	}
}
