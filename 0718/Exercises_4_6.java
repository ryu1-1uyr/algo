import java.util.*;

class Exercises_4_6{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		Gqueue<String> s = new Gqueue<String>(100);		// 最大100個押し込めるキュー

		while (true){
			System.out.printf("現在のデータ数：%d / %d",s.size(),s.capacity());
			System.out.printf("(1)エンキュー　(2)デキュー　(3)ピーク　(4)ダンプ　(5)探索　(0)終了：");

			int menu = scn.nextInt();
			if(menu == 0){
				break;
			}

			int num;
			String x;

			switch (menu){
				case 1:
					System.out.printf("データ：");
					x = scn.next();
					try{
						s.enque(x);
					}catch(Gqueue.OverflowGqueueException e){
						System.out.printf("キューが満杯です。\n");
					}
					break;

				 case 2:
					try{
						x = s.deque();
						System.out.printf("デキューしたデータは%sです。",x);
					}catch(Gqueue.EmptyGqueueException e){
						System.out.printf("キューが空です。\n");
					}
					break;

				case 3:	
					try{
						x = s.peek();
						System.out.printf("ピークしたデータは%sです。\n",x);
					}catch(Gqueue.EmptyGqueueException e){
						System.out.printf("キューが空です。\n");
					}
					break;

				case 4:	
					s.dump();
					break;

				case 5:	
					System.out.printf("探索するデータ：");
					x = scn.next();
					num = s.search(x);
					if (num != -1){
						System.out.printf("そのデータは%d番目にあります。\n",num);
					}else{
						System.out.printf("そのデータはありません。\n");
					}
					break;
			}
		}
	}
}
