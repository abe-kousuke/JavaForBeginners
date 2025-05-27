
public class Animation extends MyFrame{
	public void run() {
		int y = 100;
		int x = 30;
		while(true) {
		  while(x <= 170) { 
			//①画面を消す
			clear();
			//②四角形を表示する
			setColor(0,128,0);
			fillOval(x,y,100,100);
			x += 5;
			sleep(0.1);
		   }
		   while(x >= 30) { 
			//①画面を消す
			clear();
			//②四角形を表示する
			setColor(0,128,0);
			fillOval(x,y,100,100);
			x -= 5;
			sleep(0.1);
		   }
	    }
	}

}
