import java.util.*;

class Exercises_3_8{
	enum Menu{
		ADD("データ追加"),
		REMOVE("データ削除"),
		SEARCH("データ探索"),
		DUMP("全データ表示"),
		KILL("終了");

		private final String message;

		static Menu MenuAt(int idx){
			for(Menu m : Menu.values()){
				if(m.ordinal() == idx){
					return m;
				}
			}
			return null;
		}

		Menu(String string){
			message = string;
		}

		String getMessage(){
			return message;
		}
	}
	
	
	static Menu SelectMenu(){
		Scanner scn = new Scanner(System.in);
		int key;
		do{
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 &&
					m.ordinal() != Menu.KILL.ordinal())
					System.out.println();
			}
			System.out.print("：");
			key = scn.nextInt();
		} while(key < Menu.ADD.ordinal() || key > Menu.KILL.ordinal());

		return Menu.MenuAt(key);
	}



	public static void main(String[] args){
		Menu menu;
		openhash.Data data;
		openhash.Data temp = new openhash.Data();

		OpenHash<String, openhash.Data> hash = new OpenHash<String, openhash.Data>(13);

		do{
			switch(menu = SelectMenu()){
				case ADD :	
					data = new openhash.Data();
					data.scanData("追加", openhash.Data.NO | openhash.Data.NAME);
					int k = hash.add(data.keyCode(), data);
					switch (k) {
						case 1: System.out.println("そのキー値は登録済みです。");
							break;
						case 2: System.out.println("ハッシュ表が満杯です。");
							break;
					}
					break;

				case REMOVE :
					temp.scanData("削除", openhash.Data.NAME);
					hash.remove(temp.keyCode());
					break;

				case SEARCH :
					temp.scanData("探索", openhash.Data.NAME);
					openhash.Data t = hash.search(temp.keyCode());
					if(t != null){
						System.out.println("そのキーをもつデータは" + t + "です。");
					}else{
						System.out.println("該当するデータはありません。");
					}
					break;

				case DUMP :
					hash.dump();
					break;
			}
		}while(menu != Menu.KILL);
	}
}
