
public class Animation extends MyFrame{
	public void run() {
		int y = 100;
		int x = 30;
		//5-1
	//     while(y >= 50) { 
			//①画面を消す
	//	   clear();
			//②四角形を表示する
	//	   setColor(0,128,0);
	//	   fillOval(x,y,100,100);
	//	   y -= 5;
	//	   sleep(0.1);
		   
	//     while(x <= 170) { 
			//①画面を消す
	//	   clear();
			//②四角形を表示する
	//	   setColor(0,128,0);
	//	   fillOval(x,y,100,100);
	//	   x += 5;
	//	   sleep(0.1);
		   
		   
	    //5-2
	//	   while(y <= 200) { 
		    //①画面を消す
	//	 	clear();
			//②四角形を表示する
	//	   setColor(0,128,0);
	//	   fillOval(x,y,100,100);
	//	   x += 5;
	//	   y += 5;
	//	   sleep(0.1);
	//	  }
	//      while(x >= 30) { 
	//		//①画面を消す
	//	    clear();
			//②四角形を表示する
	//	 	setColor(0,128,0);
	//	 	fillOval(x,y,100,100);
	//	 	x -= 5;
	//	 	sleep(0.1);
	//	 }
	//      while(y >= 100) { 
			//①画面を消す
	//	 	clear();
			//②四角形を表示する
	//	 	setColor(0,128,0);
	//	 	fillOval(x,y,100,100);
	//	 	x += 5;
	//	    y -= 5;
	//	 	sleep(0.1);
	//	 }
	//	    while(x >= 30) { 
			//①画面を消す
	//	 	clear();
			//②四角形を表示する
	//	 	setColor(0,128,0);
	//	    fillOval(x,y,100,100);
	//	 	x -= 5;
	//	 	sleep(0.1);
	//     }
		
		//5-3
	//	for (int i = 0; i < 3; i++) {
		    // → 右へ進む
	//	    for (; x <= 300; x += 5) {
	//	        clear();
	//	        setColor(0, 128, 0);
	//	        fillOval(x, y, 100, 100);
	//	        sleep(0.1);
	//	    }

		    // ← 左へ戻る
	//	    for (; x >= 30; x -= 5) {
	//	        clear();
	//	        setColor(0, 128, 0);
	//	        fillOval(x, y, 100, 100);
	//	        sleep(0.1);
	//	    }
	//	}
		
		//5-EX
	//	       while(x <= 200) { 
			    //①画面を消す
	//		 	clear();
				//②四角形を表示する
	//		   setColor(0,128,0);
	//		   fillOval(x,y,100,100);
	//		   x += 5;
	//     	   sleep(0.1);
	//		  }
	//	        while(y <= 200) { 
		//		//①画面を消す
	//		    clear();
				//②四角形を表示する
	//		 	setColor(0,128,0);
	//		 	fillOval(x,y,100,100);
	//		 	y += 5;
	//		 	sleep(0.1);
	//		 }
	//	        while(x >= 30) { 
				//①画面を消す
	//		 	clear();
				//②四角形を表示する
	//		 	setColor(0,128,0);
	//		 	fillOval(x,y,100,100);
	//		    x -= 5;
	//		 	sleep(0.1);
	//		 }
	//		    while(y >= 30) { 
				//①画面を消す
	//		 	clear();
				//②四角形を表示する
	//		 	setColor(0,128,0);
	//		    fillOval(x,y,100,100);
	//		 	y -= 5;
	//		 	sleep(0.1);
	//	   }
		
		//5-EX2
		       while(x <= 200) { 
			    //①画面を消す
			 	clear();
				//②四角形を表示する
			   setColor(0,128,0);
			   fillOval(x,y,100,100);
			   x += 5;
	     	   sleep(0.1);
			  }
		        while(y <= 200) { 
			   //①画面を消す
			    clear();
				//②四角形を表示する
			 	setColor(0,128,0);
			 	fillOval(x,y,100,100);
			 	y += 5;
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
			    while(y <= 300) { 
				//①画面を消す
			 	clear();
				//②四角形を表示する
			 	setColor(0,128,0);
			    fillOval(x,y,100,100);
			 	y += 5;
			 	sleep(0.1);
		   }
    }
	
	
  }



